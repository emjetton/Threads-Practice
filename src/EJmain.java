import java.util.Random;

public class EJmain {
    public static void main(String [] args)
    {

        //int n = Integer.parseInt(args[0]);
        int n = 50000;
        int [] nums = new int[n];   //making random object and int array
        Random r = new Random();

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = r.nextInt(1000);      //filling array with random nums
        }

        EJresult rSum = new EJresult();

        EJresult rAverage = new EJresult();         //making result objects

        EJresult rMax = new EJresult();

        Thread th0 = new Thread(new EJSum(rSum, nums));

        Thread th1 = new Thread(new EJAverage(rAverage, nums));         //making thread objects

        Thread th2 = new Thread(new EJmax(rMax, nums));

        th0.start();
        th1.start();            //start threads
        th2.start();

        try{
                th0.join();
                System.out.printf("We made a bunch of random numbers, the sum is %d%n" , rSum.getValue());

                th1.join();
                System.out.printf("We made a bunch of random numbers, the average is %d%n" , rAverage.getValue());

                th1.join();
                System.out.printf("We made a bunch of random numbers, the max is %d%n" , rMax.getValue());

                }
        catch (InterruptedException ex)
        {
            System.out.println("Unable to join");
        }
    }
}

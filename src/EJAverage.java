public class EJAverage extends EJresult implements Runnable {

    EJresult result;
    int[] nums;

    public EJAverage(EJresult result, int[] nums)
    {
        this.result = result;
        this.nums=nums;
    }

    public void run(){
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum = sum+nums[i];              //finding average
        }
        result.setValue(sum);

        int avg = sum/nums.length;
        result.setValue(avg);
    }

}

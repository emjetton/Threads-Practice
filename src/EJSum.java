public class EJSum extends EJresult implements Runnable  {

    EJresult result;
    int[] nums;

    public EJSum(EJresult result, int[] nums)
    {
        this.result = result;
        this.nums = nums;
    }


    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i<nums.length; i++)  //finding sum
        {
            sum = sum+nums[i];
        }
        result.setValue(sum);
    }


}

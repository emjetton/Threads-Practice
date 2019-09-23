public class EJmax extends EJresult implements Runnable{
    EJresult result;
    int[] nums;

    public EJmax(EJresult result, int[] nums)
    {
        this.result = result;
        this.nums=nums;
    }

    public void run() {
        int max = nums[0];

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]>nums[0]){            //finding max
                max = nums[i];
            }
        }
        result.setValue(max);
    }
}

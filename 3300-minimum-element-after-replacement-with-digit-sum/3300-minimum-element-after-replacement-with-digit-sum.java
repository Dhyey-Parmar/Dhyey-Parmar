class Solution {
    public int minElement(int[] nums) {
        int temp=0,ans=0;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            ans=0;
            while(temp!=0){
                ans+=temp%10;
                temp/=10;
            }
            nums[i]=ans;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}
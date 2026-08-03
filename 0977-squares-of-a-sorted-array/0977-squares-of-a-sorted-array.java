class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int i=0;
        int j=nums.length-1;
        int []res=new int[nums.length];
        for(int k=nums.length-1;k>=0;k--){
            if(nums[i]>nums[j]){
                res[k]=nums[i];
                i++;
            }
            else{
                res[k]=nums[j];

            j--;
            }
        }
        return res;
        
    }
}
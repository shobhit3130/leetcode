class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int res=1;
        while(j<nums.length-1){

            if(nums[i]==nums[i-1]){
                j++;
                continue;
            }
            nums[i]=nums[j];
            i++;
            j++;
            res++;
            

        }
        return res;
        
    }
}
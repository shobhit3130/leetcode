class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int min_diff=Integer.MAX_VALUE;
        int diff=0;
        Arrays.sort(nums);
        int closest_sum=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
        
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                diff=Math.abs(target-sum);
            if(min_diff>diff){
                min_diff=diff;
               closest_sum=sum;

            }
            if(sum<target){
                j++;
            }
            else if(sum>target){
                k--;
            }
            else{
                return sum;
            }
            }
        
            
        }
        return closest_sum;
        
    }
}
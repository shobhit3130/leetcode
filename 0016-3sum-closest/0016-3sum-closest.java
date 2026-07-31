class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min_diff=Integer.MAX_VALUE;
        int diff=0;
        int n=nums.length;
        int sum=0;
        int closest_sum=0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    diff=Math.abs(sum-target);
                    if(min_diff>diff){
                        min_diff=diff;
                        closest_sum=sum;
                    }

                }
            }
        }
        return closest_sum;
        
        
    }
}
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int sum=1;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            sum=sum*r;
            temp=temp/10;
        }

        
        if(sum%t==0){
            return n;
        }
        
        n++;
    }
    }
    }
        
    

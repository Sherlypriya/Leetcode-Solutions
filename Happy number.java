class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getnext(n);
        while(fast !=1 && slow!=fast){
            slow=getnext(slow);
            fast=getnext(getnext(fast));
        }
        return fast==1;
    }
    private int getnext(int num){
        int sum=0;
        while(num>0){
            int d= num%10;
            sum+=d*d;
            num=num/10;
            }
            return sum;
        }
       
    }
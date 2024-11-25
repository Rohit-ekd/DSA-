
class Solution {
    public static int sumOfDigit(int m){
        int sum=0; int last;
        while(m>0){
            last = m%10;
            sum = sum + last;
            m/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
       System.out.println(sumOfDigit(159));
    }
}
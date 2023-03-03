public class MaxWealth {
    public static void main(String[] args) {

        System.out.println("");
    }

   int maximumWealth(int[][] accounts) {
       int ans = Integer.MIN_VALUE;

       for(int [] out: accounts){
           int sum = 0;
           for(int in : out){
               sum  += in;
           }

           if(sum > ans){
               ans = sum;
           }
       }
       return ans;
    }

}

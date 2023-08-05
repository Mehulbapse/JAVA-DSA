
public class RodCutting{
    public int cutRod(int price[], int n) {
        //code here
        int length[] = new int[n];

        for(int i=0;i<n;i++)
        {
            length[i]=i+1;
          
        }

        int[][] t = new int[n+1][n+1];
        for(int i =0;i<=n; i++){
            for(int j =0;j<=n; j++){
                if(i ==0){
                    t[i][j] = 0;
                }

                if(j == 0){
                    t[i][j] = 0;
                }
            }
        }


        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(length[i-1] <=j){
                    t[i][j] = Math.max(price[i-1] + t[i][j-length[i-1]] , t[i-1][j]);

                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][n];
    }

    public static void main(String[] args) {
        RodCutting rodcut = new RodCutting();
        int[] array = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(rodcut.cutRod(array , 8));

    }
}
import javax.sound.midi.SysexMessage;

public class PartitionEqualSubsetSum {


    public int subSetSum(int N, int[] arr, int sum) {
        int[][] dp = new int[N+1][sum+1]; // O(N x sum) SC

        for(int j=0; j<sum+1; j++) dp[0][j] = 0;
        for(int i=0; i<N+1; i++) dp[i][0] = 1;

        // O(n x sum) TC
        for(int i=1; i<N+1; i++) {
            for(int j=1; j<sum+1; j++) {
                if(arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j-arr[i-1]] | dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][sum];
    }

    public int equalPartition(int N, int[] arr) {
        int sum = 0;
        for(int i=0; i<N; i++) sum += arr[i];
        if(sum % 2 != 0) return 0;
        else {
            return subSetSum(N, arr, sum/2);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 11, 5};
        PartitionEqualSubsetSum subsetsum = new PartitionEqualSubsetSum();
        System.out.println( subsetsum.equalPartition(4,array));

    }
}
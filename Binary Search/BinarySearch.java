

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr = {-18,-12,-4,0,2,4,5,6,8,49,53};
        int target = 6;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
package src.main.java.slidingwindow;

public class MaximumSubArray {

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int arr1[] = {2, 3, 4, 1, 5};
        int k = 2;
        int maximum = getMaximum(arr1, k);
        System.out.println(maximum);
    }

    private static int getMaximum(int[] arr, int k) {
        int max=0;
        int currentsum=0;

        for(int i=0;i<k;i++) {
            currentsum+=arr[i];
        }
        max = currentsum;

        for(int i=k;i<arr.length;i++) {
            currentsum += arr[i]-arr[i-k];
            max = Math.max(max,currentsum);
        }
        return max;
    }

}

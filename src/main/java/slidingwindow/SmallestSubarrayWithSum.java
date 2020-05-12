package src.main.java.slidingwindow;

import static java.lang.Integer.*;

public class SmallestSubarrayWithSum {
    public static void main(String[] args) {
        int gsum = 280;
        int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};

        int minlen = getMinimum(arr,gsum);
        System.out.println(minlen);
    }

    private static int getMinimum(int[] arr, int gsum) {
        int mini = Integer.MAX_VALUE;
        int start = 0;
        int csum = 0;

        for(int end=0;end<arr.length;end++) {
            csum+=arr[end];
            while(csum>=gsum && start<=end) {

                csum-=arr[start];
                mini = Math.min(mini,end-start+1);
                start++;
            }
            //System.out.println(mini);
        }

        return mini;
    }
}

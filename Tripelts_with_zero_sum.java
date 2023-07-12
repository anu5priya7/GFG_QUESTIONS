 import java.util.Arrays;

public class Tripelts_with_zero_sum {

    // arr[]: input array
    // n: size of the array
    // Function to find triplets with zero sum.
    public static boolean findTriplets(int arr[], int n) {
        // add code here.
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 2, 1, 5 };
        int n = arr.length;

        System.out.println(findTriplets(arr, n));
    }
}

import java.util.ArrayList;

public class subArraySum {

    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here

        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < n) {
            sum = sum + arr[right];
            while (left < right && sum > s) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == s) {
                ans.add(left + 1);
                ans.add(right + 1);
                return ans;
            }
            right++;
        }
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 6, 7, 8 };
        int n = arr.length;
        int s = 16;

        System.out.println(subarraySum(arr, n, s));

    }
}

class Solution {
    int lowerBound(int[] arr, int target) {
        return index(arr, target, 0, arr.length - 1, arr.length);
    }

    static int index(int[] arr, int k, int l, int r, int ans) {
        if (l > r)
            return ans;  // base case: return the best answer so far

        int mid = (l + r) / 2;

        if (arr[mid] >= k) {
            ans = mid;  // potential answer
            return index(arr, k, l, mid - 1, ans);  // search left half
        } else {
            return index(arr, k, mid + 1, r, ans);  // search right half
        }
    }
}

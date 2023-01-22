class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= target) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        
        if (s > 0 && nums[s - 1] == target) {
            return s - 1;
        } else {
            return -1;
        } 
    }
}

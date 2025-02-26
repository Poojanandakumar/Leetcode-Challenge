public class DSA {
    static void pattern1(int nr) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= nr; i++) {
            System.out.println(s.append(i));
        }
    }

    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Return the index of the target
            } else if (nums[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public int search(int[] nums, int target,boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if(findstartindex){
                    end = mid-1;
                }else{
                    start = mid+1;
                } // Return the index of the target
            } else if (nums[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return ans;

    }




    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }



}

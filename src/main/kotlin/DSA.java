import java.util.ArrayList;
import java.util.List;

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

    public static int orderArgnosticbinarySearch(int[] nums, int target, int start, int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Return the index of the target
            }

            if (start < end) {
                if (nums[mid] < target) {
                    start = mid + 1; // Search in the right half
                } else {
                    end = mid - 1; // Search in the left half
                }
            } else {
                if (nums[mid] < target) {
                    start = mid - 1; // Search in the right half
                } else {
                    end = mid + 1; // Search in the left half
                }
            }

        }
        // Target not found
        return -1;
    }


    public int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
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
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int peak(int[] num) {

        int s = 0;
        int e = num.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (num[m] > num[m + 1]) {
                //dsc side //left side
                e = m;
                //we need to check left side only
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static int searchInmountain() {
        int[] num = {1, 2, 1, 3, 5, 6, 4};
        int s = 0;
        int e = num.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (num[m] > num[m + 1]) {
                //dsc side //left side
                e = m;
                //we need to check left side only
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static int searchFirsthalf() {
        int[] arr = {0, 1, 2, 4, 2, 1};
        int target = 3;
        int peak = peak(arr);
        int firsttry = orderArgnosticbinarySearch(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return orderArgnosticbinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static void cyclicSort() {
        int[] nums = new int[]{3, 4, 1, 2, 5};
        int i = 0;
        int n = nums.length - 1;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                nums = swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(nums);
    }

    static List<Integer> cyclicSortMissingNo() {
        int[] nums = new int[]{1,2};
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                nums = swap(nums, i, correctIndex);

            } else {
                i++;
            }
        }

        int k = 0;
        List<Integer> rs = new ArrayList<>();
        while (k < n) {
            if (nums[k] != k + 1) {
                rs.add(k+1);
            }
            k++;

        }
//        if(rs.isEmpty()){
//            rs.add(n);
//            return rs;
//        }
        return rs;
    }

    static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }


}

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] nums = new int[]{1, 2};
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
                rs.add(k + 1);
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

    public static int[] concatenationOfArray(int[] nums) {
        int[] result = new int[nums.length * 2];

        int i = 0;
        int j = 0;
        while (i < nums.length * 2 && j < nums.length) {
            result[i] = nums[j];
            if (i == nums.length - 1) {
                j = 0;
            } else {
                j++;
            }
            i++;
        }

        return result;
    }

    public static int[] arrayFromPermutation(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        int[] result = new int[nums.length];
        result[0] = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static int maximumWealth(int[][] accounts) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            sums.add(sum);
        }
        return greatestNumber(sums);
    }

    static int greatestNumber(List<Integer> nums) {
        int gr = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > gr) {
                gr = nums.get(i);
            }
        }
        return gr;
    }

    public static int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k = 0;
        int[] result = new int[2 * n];

        while (i < n && j < 2 * n && k < 2 * n) {
            result[k] = nums[i];
            result[k + 1] = nums[j];
            i++;
            j++;
            k = k + 2;
        }
        return result;
    }

    public static int missingNumber() {
        int[] nums = new int[]{1};
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }

        int k = 0;

        while (k < nums.length) {
            if (nums[k] != k + 1) {
                return k + 1;
            }
            k++;
        }
        return nums.length + 1;

    }

    public static List<Integer> findDuplicatesFromArray() {
        int[] nums = new int[]{1};
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1;
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }

        int k = 0;
        List<Integer> result = new ArrayList<>();
        while (k < nums.length) {
            if (nums[k] != k + 1) {
                result.add(nums[k]);
            }
            k++;
        }
        return result;
    }


    public static int[] setMismatch() {
        int[] nums = new int[]{1, 2, 2, 4};
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1;
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }

        int k = 0;
        int[] result = new int[2];
        while (k < nums.length) {
            if (nums[k] != k + 1) {
                result[0] = nums[k];
                result[1] = k + 1;
            }
            k++;
        }
        return result;
    }

    public static void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for (int k = 0; k < matrix.length; k++) {
            for (int m = 0; m < matrix[0].length; m++) {
                if (matrix[k][m] == 0) {
                    int[] a = new int[]{k, m};
                    list.add(a);
                }
            }
        }
        int k = 0;
        System.out.println(Arrays.toString(list.get(1)));
        while (k < list.size()) {
            int[] a = list.get(k);
            int i = a[0];
            int j = a[1];
            for (int m = 0; m < matrix[0].length; m++) {
                matrix[i][m] = 0;
            }

            for (int m = 0; m < matrix.length; m++) {
                matrix[m][j] = 0;
            }

            k++;

        }
        System.out.println(Arrays.deepToString(matrix));
    }


    public static List<Boolean> kidsWithCandies() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            int total = candies[i] + extraCandies;
            if (isGreatest(candies, total,i)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    static boolean isGreatest(int[] candies, int total,int k) {

        for (int i = 0; i < candies.length; i++) {
            if(i!=k && candies[i]>total){
                return false;
            }
        }
        return true;
    }


}

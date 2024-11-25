class ArrayAss {
    public static boolean checkDistinct(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkDistinctUsingXor(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            res = res ^ nums[i];
        }
        if (res == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int findTarget(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] < target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    end = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target < nums[end]) {
                    start = mid + 1;
                } else {
                    start = mid - 1;
                }
            }

        }
        return -1;
    }

    public static int maxPrice(int arr[]){
        int n = arr.length;
        int maxprice = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]<arr[j] && maxprice<(arr[j]-arr[i]))
                {
                    maxprice = arr[j]-arr[i];
                }
            }
        }
        return maxprice;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // if (checkDistinctUsingXor(arr)) {
        //     System.out.println("Distinct array");
        // } else {
        //     System.out.println("Not distinct array");
        // }
        int res = maxPrice(arr);
        System.out.println(res);
    }
}
public class TwoPointerSum {
    public static boolean twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) return true;  
            else if (sum < target) left++;    
            else right--;        
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 11};
        int target = 10;
        System.out.println(twoSum(arr, target));  // Output: true
    }
}

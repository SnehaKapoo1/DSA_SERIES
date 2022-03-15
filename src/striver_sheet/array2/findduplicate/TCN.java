package striver_sheet.array2.findduplicate;

public class TCN {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String args[]) {
        int arr[] = {3, 1, 3, 4, 2};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}

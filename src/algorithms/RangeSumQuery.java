package algorithms;

public class RangeSumQuery {

        private static int[] prefixSum;

        public RangeSumQuery(int[] nums) {

            prefixSum = new int[nums.length+1];

            for(int i=1; i<prefixSum.length; i++){
                prefixSum[i] = prefixSum[i-1] + nums[i-1];
            }
        }

        public static int sumRange(int left, int right) {
            return prefixSum[right+1] - prefixSum[left];
        }

    public static void main(String[] args) {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery r = new RangeSumQuery(nums);
        System.out.println(sumRange(0, 2));
    }
}

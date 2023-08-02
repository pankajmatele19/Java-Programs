class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = j;
                    arr[1] = i;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,8};
        twoSum(arr,7);
    }
}

public int[] swapEnds(int[] nums) {

    int temporary = nums[0];
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = temporary;

    return nums;
}

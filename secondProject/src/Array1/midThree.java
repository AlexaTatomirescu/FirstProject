public int[] midThree(int[] nums) {

    int[] a = new int[3];
    a[0] = nums[nums.length/2-1];
    a[1] = nums[nums.length/2];
    a[2] = nums[nums.length/2+1];

    return a;
}

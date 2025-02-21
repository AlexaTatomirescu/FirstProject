public int[] frontPiece(int[] nums) {

    int[] a;

    if(nums.length<2)
        a=new int[nums.length];

    else a = new int[2];

    if (nums.length>0)
        a[0]=nums[0];

    if (nums.length>1)
        a[1]=nums[1];

    return a;
}

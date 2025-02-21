public int[] make2(int[] a, int[] b) {

    int[] ar = new int[2];
    int count = 0;
    int i;

    i=0;
    while (count < 2 && i < a.length) {
        ar[count] = a[i];
        count++;
        i++;
    }

    i=0;
    while (count < 2 && i < b.length) {
        ar[count] = b[i];
        count++;
        i++;
    }

    return ar;
}

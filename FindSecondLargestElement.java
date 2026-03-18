class FindSecondLargestElement {

    static int FindSecondLargest(int[] arr) {
        int max = arr[0];
        int sMax = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                sMax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>sMax)
            {
                sMax = arr[i];
            }
        }

        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 7, 11, 5, 9};
        int secLarge = FindSecondLargest(arr);

        System.out.println("Second largest : " + secLarge);
    }
}

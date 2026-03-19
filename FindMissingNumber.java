class FindMissingNumber
{   
    static int missingNumber(int[] arr)
    {
        int n = arr.length+1;
        int totelSum = n*(n+1)/2;
        int arrSum = 0;

        for(int i : arr)
        {
            arrSum += i;
        }

        return totelSum - arrSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        System.out.println("Missing number : " + missingNumber(arr));
    }
}
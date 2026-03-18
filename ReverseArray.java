class ReverseArray
{
    static int[] revArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

         System.out.println("-------------------");
        for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        System.out.println();

        int[] rev = revArray(arr);

        System.out.println("-------------------");
        for(int i=0; i<rev.length; i++)
            {
                System.out.print(rev[i] + " ");
            }
        System.out.println();
        System.out.println("-------------------");
    }
}
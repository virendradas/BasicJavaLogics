class MoveZeroEnd
{
    static void MoveEndZero(int[] arr)
    {
        int index = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length)
        {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,8,0,6,5,0,0,2,3};

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" ---move end of zero---");

        MoveEndZero(arr);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
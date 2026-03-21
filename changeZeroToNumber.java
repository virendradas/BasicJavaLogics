class changeZeroToNumber
{
    static void changeZero(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,9,0,8,6,0,7,5,0};

        for(int i = 0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");    
        }

        changeZero(arr);

        System.out.println();
        System.out.println("----------------------");

        for(int i = 0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");    
        }
    }
}
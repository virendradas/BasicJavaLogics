class SearchElementOfArray
{
    static boolean findElement(int[] arr, int search)
    {
        boolean checkFind = false;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == search)
            {
                checkFind = true;
                break;
            }
        }

        return checkFind;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,3,5};
        int search = 6;

        boolean checkFind = findElement(arr, search);

        if(checkFind)
        {
            System.out.println("Finded your element, " + search);
        }
        else
        {
            System.out.println("Not find !!! " + search);
        }
    }
}
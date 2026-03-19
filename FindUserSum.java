import java.util.Scanner;

class FindUserSum
{
    static void sumOfUserValue(int arr[], int sum)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j] == sum)
                {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for find sum in araay : ");
        int sum = sc.nextInt();
        
        sumOfUserValue(arr, sum);
    }
}
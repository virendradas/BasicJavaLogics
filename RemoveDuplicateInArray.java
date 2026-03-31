class Main {
    
    static void removeDuplicate(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            boolean isCheck = false;
            
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    isCheck = true;
                    break;
                }
            }
            
            if(!isCheck)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,1,5,4,3};
        removeDuplicate(arr);
    }
}

// class Main {
//     static int remove(int[] arr)
//     {
//         int n = arr.length;
//         for(int i=0; i<n; i++)
//         {
//             for(int j=i+1; j<n; j++)
//             {
//                 if(arr[i] == arr[j])
//                 {
//                     for(int k=j; k<n-1; k++)
//                     {
//                         arr[k] = arr[k+1];
//                     }
//                     n--;
//                     j--;
//                 }
//             }
//         }
//         return n;
//     }
    
//     public static void main(String[] args){
//         int arr[] = {1,2,4,3,2,1,5,4,3};
//         int size = remove(arr);
        
//         for(int i=0; i<size; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
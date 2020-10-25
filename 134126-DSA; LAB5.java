// Java program to reverse an array
// 134126, Adrianna Bitutu Ndubi
public class LAB_5 {
     
   /* Function to reverse arr[] from 
    start to end*/
    static void revereseArray(int arr[],
                    int start, int end)
    {
        int temp;
          
        while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }     
      
    /*Prints out an array on a line */
    static void printArray(int arr[], 
                            int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    } 
 
    // Driver code
    public static void main(String args[]) {
         
        int arr[] = {10, 20, 30, 40, 50, 60};
        printArray(arr, 6);
        revereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6); 
        
    }
}
 
 //Output
 
  10 20 30 40 50 60 
  Reversed array is 
  60 50 40 30 20 10 
  BUILD SUCCESSFUL (total time: 5 seconds)

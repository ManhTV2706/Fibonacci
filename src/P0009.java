public class P0009 {
    public static void main(String[] args) {
        // Step 1: Use recursion method to find 45 sequence Fibonacci 
        int[] arr = generateFibonacciRecursion(45); 
        // Step 2: Display to screen
        displayFibonacci(arr);
    }

    private static int[] generateFibonacciRecursion(int size) {
        int[] arr = new int[size];
        findSequenceFibonacci(0, arr);
        return arr;
    }

    private static void displayFibonacci(int[] arr) {
        System.out.println();
        System.out.println("The " + arr.length + " sequence fibonacci:");
        //use loop to access each element of array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            
            //check index is not last index
            if(i < arr.length -1){
                System.out.print(", ");
            }
        }
    }

    private static void findSequenceFibonacci(int count, int[] arr) {
        //check count equals array length to stop recursion
        if(count == arr.length){
            return;
        }
        
        //check the first two number of array
        if(count == 0 || count == 1){
            arr[count] = count;
            System.out.println(count + 1 + ": " + arr[count]);
        } else{ 
            arr[count] = arr[count - 1] + arr[count - 2];
            System.out.println(count + 1 + ": " + arr[count - 1] + " + " + arr[count - 2] + " = " + arr[count]);
        }
        
        findSequenceFibonacci(count + 1, arr);
    }
    
}

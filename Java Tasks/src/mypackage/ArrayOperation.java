package mypackage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOperation {
		int[] numbers= {1,22,29,31,1,61,63,31,32,6}; 

    public static void main(String[] args) {
    	ArrayOperation myArray = new ArrayOperation();
        myArray.calculateSum();
        myArray.findMaxAndMin();
        myArray.reverseArray(myArray.numbers);
        myArray.removeDuplicated();
        myArray.bubbleSort();
       
        int n = 10; // Example value for n (Fibonacci method)
        int[] fibonacciArray = myArray.generateFibonacci(n);
        System.out.println("The first " + n + " Fibonacci numbers = " + Arrays.toString(fibonacciArray));
    }

    
    public void calculateSum(){
		int sum=0;
		for(int number:numbers) {
			if (number<100) {sum = sum+number;}}
		System.out.println("The array = "+java.util.Arrays.toString(numbers));
		System.out.println("The sum of the array = "+sum);
    }	
    public void findMaxAndMin(){
		int max=numbers[0];
		int min=numbers[0];
		for(int number:numbers) {
			if (number>max) {max=number;}
			if (number<min) {min=number;}}
		System.out.println("The Maximun of the array = "+max);
		System.out.println("The Minimum of the array = "+min);
	}
    public void reverseArray(int[]numbers){
    	int[] reversed=new int [numbers.length];
		for(int i=0;i<numbers.length;i++) {
			reversed[i]=numbers[numbers.length-1-i];
		}
		System.out.println("The Reverse of the array = "+java.util.Arrays.toString(reversed));
	}
    public void removeDuplicated(){
    	Set<Integer> set=new HashSet<>();							
		for(int number:numbers) {set.add(number);}					
		
		int[]uniqueArray = new int [set.size()];					
		int index=0;
		for(int number:set) {uniqueArray[index++]=number;}			
		System.out.println("The array after removing duplicated = "+Arrays.toString(uniqueArray));   
   } 
    public void bubbleSort(){
    	  int[] sortedArray = Arrays.copyOf(numbers, numbers.length); 
          int n = sortedArray.length;
          for (int i = 0; i < n - 1; i++) {
              for (int j = 0; j < n - 1 - i; j++) {
                  if (sortedArray[j] > sortedArray[j + 1]) {
                      int temp = sortedArray[j];
                      sortedArray[j] = sortedArray[j + 1];
                      sortedArray[j + 1] = temp;}}}
          System.out.println("The array after bubble sort = " + Arrays.toString(sortedArray));
    }
    public int[] generateFibonacci(int n) {			
        if (n <= 0) {return new int[0];}			
	        int[] fibonacciArray = new int[n];
	        if (n > 0) fibonacciArray[0] = 0;
	        if (n > 1) fibonacciArray[1] = 1;
	        
		        for (int i = 2; i < n; i++) {
		            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
		        }
		        
	        return fibonacciArray;
    }
    
    
    
    
    
    
}	

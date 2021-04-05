


package project6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project6 {

      public static void main(String[] args) {
        
          System.out.println("Enter array size: ");
          Scanner in = new Scanner(System.in);
          
          int size = in.nextInt();
          int[] array = new int[size];
          populateArray(array);
          
          
          
          long start = System.currentTimeMillis();
          SortingAlgorithms.bubbleSort(array.clone());
          long elapsed = System.currentTimeMillis() - start;
          System.out.println("Bubble Sort: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          SortingAlgorithms.bubbleSortCS(array.clone());
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Bubble Sort Short Circuit: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          SortingAlgorithms.selectionSort(array.clone());
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Selection Sort: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          SortingAlgorithms.insertionSort(array.clone());
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Insertion Sort: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          Arrays.sort(array.clone());
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Java Sort: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          SortingAlgorithms.insertionSort(array.clone());
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Insertion Sort: " + elapsed + " ms ");
          
          start = System.currentTimeMillis();
          SortingAlgorithms.quickSort(array.clone(),  0, array.length-1);
          elapsed = System.currentTimeMillis() - start;
          System.out.println("Quicksort " + elapsed + " ms "); 
  
          
    }
    
      public static void populateArray(int[] array)
      {
          Random rand = new Random();
          
          for (int i = 0; i< array.length; i++)
              array[i] = rand.nextInt(1001);
      }
      
    
    
    

}


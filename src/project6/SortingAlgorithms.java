
package project6;


public class SortingAlgorithms {
    
    
    
    public static void bubbleSort(int[] array)
    {
        for(int i = 0; i< array.length-1; i++)
            for(int j = 0; j< array.length-1-i; j++)
                if(array[j] > array[j+1])
            {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
            }
    }
    
    public static void bubbleSortCS(int[] array)
    {
        for(int i = 0; i<array.length-1; i++)
        {
            boolean swap = false;
            for(int j = 0; j < array.length-1-i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }
    
    public static void selectionSort(int[] array)
    {
        int j;
        for(int i = 0; i < array.length-1; i++)
        {
            int minIndex = i;
            
            for(j = i+1; j < array.length-1; j++)
                if(array[j] < array[minIndex])
                    minIndex = j;
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = array[minIndex];
        }
    }
    
    public static void insertionSort(int arr[])
    {
        int i, key, j;
        for(i = 1; i < arr.length; i++)
        {
            key = arr[i];
            j = i - 1;
            
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
                    arr[j+1] = key;
        }
    }  
    
   static int partition(int[] array, int begin, int end) {
    int pivot = end;

    int counter = begin;
    for (int i = begin; i < end; i++) {
        if (array[i] < array[pivot]) {
            int temp = array[counter];
            array[counter] = array[i];
            array[i] = temp;
            counter++;
        }
    }
    int temp = array[pivot];
    array[pivot] = array[counter];
    array[counter] = temp;

    return counter;
}

public static void quickSort(int[] array, int begin, int end) {
    if (end <= begin) return;
    int pivot = partition(array, begin, end);
    quickSort(array, begin, pivot-1);
    quickSort(array, pivot+1, end);
}
     
    
}

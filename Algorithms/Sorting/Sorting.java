package Algorithms.Sorting;

//Bubble sorting algorithms
public class Sorting {

    //Simple buble sort 
    //Start from the end of the list and complare previouse element with current  element if privouse > current then swap
    // doing this untile the first element and
    //repeate proceess to firlst element ++ element
    protected int [] bubbleSort_simple(int [] data){
        int len = data.length;
        int temp = 0;
        for(int i = 0; i<len-1; i++){
            for(int j=len-1;j>i;j--){
                if(data[j]<data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        return data;
    }

    //Optimised Bubble sort this will reduse the time complexity for sorted or sorting quick data sets.
    protected int [] bubbleSort_optimized(int [] data){
        int len = data.length;
        int temp = 0;
        //assumeSorted is to return true if no swap happen in single for loop
        boolean assumeSorted = false;
        for(int i = 0; i<len-1 && !assumeSorted; i++){
            //set assumeSorted to true & if least one swap will make it false
            assumeSorted = true;
            for(int j=len-1;j>i;j--){
                if(data[j]<data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                    assumeSorted= false;
                }
            }
        }
        return data;
    }

    /*
    1. Set minLacation =0
    2. search for min element in unsorted part
    3. swap with minLacation
    4. Increment minLocation untli the list end
     */
    protected int [] selectionSort1(int [] data){
        int len = data.length;
        int min = 0;
        int temp ;
        //minLocation - the current point where taken as minimum value in unsorted part is need to be move
        for(int minLocation = 0; minLocation<len-1; minLocation++){
            min =minLocation;
            for(int j=minLocation+1;j<len-1;j++){
                if(data[min]>data[j]){
                    min = j;
                }
            }
            //System.out.println("Swap" + data[minLocation] + " - "+ minLocation+" , " +  data[min] + " - "+ min);
            temp = data[minLocation];
            data[minLocation] = data[min];
            data[min] = temp;

        }
        return data;
    }


    protected int [] insertionSort1(int data[]){
        for(int i=1;i<data.length;i++){
            int key = data[i];
            int j = i-1;
            while(j>=0 && key<data[j]){
                data[j+1]=data[j];
                j++;
            }
            data[j+1]=key;
        }
        return data;
    }
    
    //Merge sort

    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        
    }
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
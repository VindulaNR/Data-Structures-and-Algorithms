package Algorithms.Sorting.BubbleSort;

//Bubble sorting algorithms
public class bubbleSort{

    //Simple buble sort 
    //Start from the end of the list and complare previouse element with current  element if privouse > current then swap
    // doing this untile the first element and
    //repeate proceess to firlst element ++ element
    protected int [] bubbleSort1(int [] data){
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
    protected int [] bubbleSort2(int [] data){
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
    
}
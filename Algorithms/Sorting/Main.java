/*Author : Vindula Rathnayaka
Topic : Sorting Algorithms
 */

package Algorithms.Sorting;
import Algorithms.Sorting.BubbleSort.bubbleSort;

//Inherits the bubbleSort to get the implemented bubbleSorting Method
class Main extends bubbleSort {

    //printList function to print the lists
    void printList(int [] list) {
        for(int i = 0; i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
    public static void main(String[] args) {
        //Initialize the unordered list
        int unsortedList[] = {2,8,4,44,12,90,1,6,10,50,12,4,75,83};
        int unsortedList1[] = {2,10,34,23,56,78,98,101,200,300};
        //new Main instatnce
        Main test = new Main();

        //Bubble sort 
        System.out.println("**********Bubble Sorting Algorthms***************");
        System.out.println("1.Simple Bubble sort");
        long start = System.nanoTime();
        int sortedList[] = test.bubbleSort1(unsortedList);
        long end = System.nanoTime();
        test.printList(sortedList);
        System.out.print("\nExecution Time : "+(end-start)+"\n");

        //Optimised bubble sort
        System.out.println("1.Simple Bubble sort");
        start = System.nanoTime();
        sortedList = test.bubbleSort2(unsortedList);
        end = System.nanoTime();
        test.printList(sortedList);
        System.out.print("\nExecution Time : "+(end-start)+"\n");
    }
}
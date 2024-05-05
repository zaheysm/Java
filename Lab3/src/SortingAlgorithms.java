import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This Class will take an array and sort it in multiple ways and calculate time it took
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class SortingAlgorithms {
    int holdNum=0;      //declare variable to hold number
    long startNano,startMillis,estimateTimeNano,estimateTimemMllis;     //declare long to hold time

    /**
     * Method to display menu
     */
    public void subMenu(){

        System.out.print("Select a sorting algorithm to sort the data array\n" +
                "\n" +
                "     B. Bubble Sort \n" +
                "     I. Insertion Sort \n" +
                "     S. Selection Sort \n" +
                "     M. Merge Sort \n" +
                "     Q. Quick Sort\n" +
                "     R. Return to Main Menu\n" +
                "\n" +
                ">");       //print the menu
    }

    /**
     * method that will run the sorting option that the user choose
     * @param scan Scanner object to enter object
     * @param randomaised random of integers array
     */
    public void select(Scanner scan,int [] randomaised){
        char choice=' ';        //variable for choice
        final char bubbleSort = 'B';        //variable for bubble sort choice
        final char insertionSort = 'I';     //variable for insertion sort
        final char selectionSort = 'S';     //variable for selection sort
        final char mergeSort = 'M';         //variable for merge sort
        final char quickSort = 'Q';         //variable for quick sort
        final char Exit = 'R';     //variable for exit choice
        do {
            try{
            subMenu();      //display the menu
            String Complexity="";       //variable for the message kind of sorting
            choice = BinaryLinearSearch.readInput(scan).charAt(0);      //input the char needed
            if (randomaised[0]==0){     //Statement if the array is empty

                throw new IllegalAccessException();     //throw exception
            }
            int [] tempArr= new int[1000];      //declare a tem array
            System.arraycopy(randomaised, 0, tempArr, 0, tempArr.length);       //array copy for a new memory location

            switch (choice) {       //

                    case bubbleSort:
                        BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print unsorted array
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //switch statement for what the user choose
                        bubbleSort(tempArr);        //sort the array in bubble sort
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        Complexity = "Bubble Sort: Simple sorting algorithm  - O(n2) Complexity  - in place";       //message on what kind of sort
                        break;
                    case insertionSort:
                        BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print unsorted array
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //switch statement for what the user choose
                        insertionSort(tempArr);      //sort the array in insertion sort
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        Complexity = "Insertion Sort: Simple sorting algorithm  - O(n2) Complexity  - in-place";        //message on what kind of sort
                        break;
                    case selectionSort:
                        BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print unsorted array
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //switch statement for what the user choose
                        selectionSort(tempArr);    //sort the array in selection sort
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        Complexity = "Selection Sort: Simple sorting algorithm  - O(n2) Complexity  - in-place";        //message on what kind of sort
                        break;
                    case mergeSort:
                        BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print unsorted array
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //switch statement for what the user choose
                        mergeSort(tempArr, 0, tempArr.length-1);      //merge the array in selection sort
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        Complexity = "Merge Sort: Recursive Divide-And-Conquer - O(n log n) Complexity - not in-place";      //message on what kind of sort
                        break;
                    case quickSort:
                        BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print unsorted array
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //switch statement for what the user choose
                        quickSort(tempArr, 0, tempArr.length - 1);      //merge the array in quick sort
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        Complexity = "Quick Sort: Recursive Divide-And-Conquer - O(n log n) Complexity - not in-place";      //message on what kind of sort
                        break;
                    case Exit:
                        System.out.println("Returning to main menu...");
                        break;
                } ;
                if (choice != Exit) {
                    System.out.println(Complexity);     //print a message of Complexity of the array and array kind
                    BinaryLinearSearch.remainingElements(tempArr, 0, tempArr.length);       //print sorted array
                    System.out.println();       //print empty line
                    System.out.println("Time taken in nanoseconds: " + estimateTimeNano);       //print time took in nanoseconds
                    System.out.println("Time taken in milliseconds: " + estimateTimemMllis);         //print time took in milliseconds
                }
            }catch(InputMismatchException e){       //exception
                System.err.println("*****Input Mismatch Exception*****");       //print exception handling
            }catch (IllegalAccessException e){
                System.out.println("The array has yet to be initialized... Please go back to main menu");        //print exception handling
            }catch (Exception e){   //general exception
                System.err.println(e.getMessage()+" general error");
            }
        }while(choice!=Exit);       //loop condition

    }

    /**
     * Method that will sort the array in bubble sort
     * @param randomaised unsorted array
     */
    private void bubbleSort(int [] randomaised){
        for (int i=0;i<randomaised.length-1;i++){       //loop for the array
            for (int j=0;j<randomaised.length-1;j++){       //loop for array
                if (randomaised[j]>randomaised[j+1]){       //statement to ask if the number is bigger the one after it
                    holdNum=randomaised[j];     //hold temp number
                    randomaised[j]=randomaised[j+1];        //instantiate the smaller number instead of the bigger one
                    randomaised[j+1]=holdNum;       ////instantiate next number with the temp number
                }
            }
        }
    }


    /**
     * Method that will sort the array in insertion sort
     * @param randomaised unsorted array
     */
    private void insertionSort(int [] randomaised) {
        for (int i = 1; i < randomaised.length; i++) {      //loop to run all over the array
            holdNum = randomaised[i];       //hold the first as we assume it's the biggest
            int j = i - 1;      //instantiate j to start from 0
            while (j >= 0 && randomaised[j] > holdNum) {        //loop condition
                randomaised[j + 1] = randomaised[j];        //put the biggest number in the last bid of i
                j--;        //decrement j
            }
            randomaised[j + 1] = holdNum;       //this is the biggest one and to hold it in their
        }
    }

    /**
     * Method that will sort the array in selection sort
     * @param randomaised unsorted array
     */
    private void selectionSort(int [] randomaised){
        int index=0;        //variable to hold index
        for (int i=0;i<randomaised.length-1;i++){        //loop run on the array
            holdNum = randomaised[i];       //assume this place in the array is the biggest one
            for (int j=i;j<randomaised.length;j++){             //loop run on the array
               if(holdNum>randomaised[j]){      //asks if the hold num is bigger than the one in place j
                   holdNum=randomaised[j];      //if it's bigger hold it
                   index=j;     //hold the index of it
               }
            }
            randomaised[index]= randomaised[i];     //take the biggest one and put it last
            randomaised[i]=holdNum;     //instantiate the smallest number first
        }
    }

    /**
     * Method that will sort the array in merge sort
     * @param randomaised unsorted array
     * @param first start of the array
     * @param last  end of the array
     */
    private void mergeSort(int [] randomaised,int first,int last){

        if (first<last){        //statement if the first is smaller than last
            int mid=(first+last)/2;     //method to cut the array in half
            mergeSort(randomaised,first,mid);       //recursive run of the array from start to mid
            mergeSort(randomaised,mid+1,last);  //recursive run of the array from mid to end
            mergeArray(randomaised,first,mid,last);     //merge and sort array method
        }
    }

    /**
     * Method that will run the array on parts of the array and sort it and merge it
     * @param randomaised unsorted array
     * @param first start of the array
     * @param mid mid of the array
     * @param last end of the array
     */
    private void mergeArray(int [] randomaised,int first,int mid,int last){

        int sizeLeft=mid-first+1;       //new size for the array(left side)
        int sizeRight=last-mid;     ////new size for the array(right side)


        int [] leftArr=new int[sizeLeft];       //new array for the left side
        int [] rightArr=new int[sizeRight];     //new array for the right side

        for (int i=0;i<sizeLeft;i++){
            leftArr[i]=randomaised[i+first];        //instantiate the array for the left(from start to middle)
        }
        for (int i=0;i<sizeRight;i++){
            rightArr[i]=randomaised[i+mid+1];        //instantiate the array for the right(from middle to end)
        }
        int i=0,j=0,k=first;        //declare variables for indexs
        while(i<sizeLeft&&j<sizeRight){     //loop condition to the sizes is smaller than the size of the array
            if(leftArr[i]<=rightArr[j]){        //ask which one is smaller or equal from both sides
                randomaised[k]=leftArr[i];      //put the smaller integer in the array
                i++;        //increment the value
            }else{
                randomaised[k]=rightArr[j];    //put the smaller integer in the array
                j++;         //increment the value
            }
            k++;         //increment the value
        }

        while(i<sizeLeft){      //loop condition in case there still left to add them to the loop
            randomaised[k]=leftArr[i];      //instantiate the loop of what left of the array
            i++;         //increment the value
            k++;         //increment the value
        }
        while(j<sizeRight){     //loop condition in case there still left to add them to the loop
            randomaised[k]=rightArr[j];     //instantiate the loop of what left of the array
            j++;        //increment the value
            k++;        //increment the value
        }

    }

    /**
     * Method that will sort the array in quick sort
     * @param randomaised unsorted array
     * @param start start of the array
     * @param end  end of the array
     */
    private void quickSort(int[] randomaised, int start, int end)
    {
        if (start < end)         //statement if the start is smaller than end
        {
            int index = sortPart(randomaised, start, end);      //last index worked on
            quickSort(randomaised, start, index - 1);       //recursive run of the array from start to index
            quickSort(randomaised, index + 1, end);          //recursive run of the array from index to end
        }
    }

    /**
     * method that will sort in partition
     * @param randomaised unsorted array
     * @param start start of the array
     * @param end end of the array
     * @return index to strat from
     */
    private int sortPart(int [] randomaised,int start,int end) {
        int temp=0;
        int pivot = randomaised[end];       //assume the last integer is the bigger one
        int index = start - 1;      //the start for the loop

        for (int i = start; i < end; i++) {     //loop
            if (randomaised[i] < pivot) {       //if the last integer is the smallest

                index++;        //increment the value
                temp = randomaised[index];      //put the number in temp value
                randomaised[index] = randomaised[i];        //the smaller value goes to the start
                randomaised[i] = temp;      //the bigger value goes to the end
            }
        }
        temp = randomaised[index + 1];      //put the number in temp value
        randomaised[index + 1] = randomaised[end];      //the smaller value goes to the start
        randomaised[end] = temp;        //the bigger value goes to the end


        return (index + 1);  //return the index from where to start the next search
    }



}

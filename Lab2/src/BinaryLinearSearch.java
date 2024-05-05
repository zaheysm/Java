import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BinaryLinearSearch {

    private  Scanner scan=new Scanner(System.in);       //declare private scanner
    private int [] randomaised;     //declare private array

    /**
     * method that will run iterative Binary Search in an array
     * @param key parameter to search in the array
     * @param randomArr array of randomised integers
     * @return index where the key found or -1 if not found
     */
    public int iterativeBinarySearch(int key,int [] randomArr){
        int first=0;        //declare int the start of search
        int last=randomArr.length;      //declare int the last of search
        int mid=last/2;     //declare int the mid of the array
        while (first<=last){        //start loop for condition first smaller than last
            if(randomArr[mid]<key){     //statement if array in place of smaller than key we are searching
                first=mid+1;        //instantiate first to mid +1
                remainingElements(mid,last);  //print remaining of the array
            }else if(randomArr[mid]==key){       //statement if array in place of smaller than key we are searching
                return mid;     //return the index of the search key found
            }else{      //else statement
                last=mid-1;     //instantiate last to mid +1
                remainingElements(first,last);    //print remaining of the array
            }
            mid=(first+last)/2;     //the new start of the search

        }
        return -1;      //return -1 if there is no key found
    }
    /**
     * method that will run recursive Binary Search in an array
     * @param key parameter to search in the array
     * @param randomArr array of randomised integers
     * @param first first index of the array
     * @param last last index of the array
     * @return index where the key found or -1 if not found
     */
    public int recursiveBinarySearch(int key,int [] randomArr,int first,int last ){
        if (first<=last) {      //condition first smaller than last
            int mid = first + (last - first)/2;     //the new start of the search
            if (randomArr[mid] < key) {     //statement if array in place of smaller than key we are searching
                first = mid + 1;        //instantiate first to mid +1
                remainingElements(mid,last);     //print remaining of the array
                return recursiveBinarySearch(key,randomArr,first,last);     //run the method again
            } else if (randomArr[mid] == key) {     //statement if array in place of smaller than key we are searching
                return mid;     //return the index of the search key found
            } else {        //else statement
                last = mid - 1;     //instantiate last to mid +1
                remainingElements(first,last);      //print remaining of the array
                return recursiveBinarySearch(key,randomArr,first,last);     //run the method again
            }
        }
        return -1;      //return -1 if there is no key found
    }

    /**
     * method that will run iterative Linear Search in an array
     * @param key parameter to search in the array
     * @param randomArr array of randomised integers
     * @return index where the key found or -1 if not found
     */
    public int iterativeLinearSearch(int key,int [] randomArr){
        for (int i:randomArr){      //enhanced foo loop
            if (i==key){        //condition if the key is found
                return i;       //return the index of the key
            }
        }
        return -1;       //return -1 if there is no key found
    }

    /**
     * method that will run recursive Linear Search in an array
     * @param key parameter to search in the array
     * @param randomArr array of randomised integers
     * @param size return the size of the array
     * @return index where the key found or -1 if not found
     */
    public int recursiveLinearSearch(int key,int [] randomArr,int size){
        size--;     //the size of the array reduced by 1
        if (size>=0) {       //condition if size bigger than 0
            if (randomArr[size] == key) {       //condition if the key is found
                return size;        //return the index of the key
            }else{      //else statement
                return recursiveLinearSearch(key,randomArr,size);       //run the loop again
            }
        }


        return -1;      //return -1 if there is no key found
    }


    /**
     * method that will generate random numbers from 10-100
     * @return an array with random integer in it
     */
    public int [] generateRandomInts(){
        Random rand=new Random();       //declare random variable
        randomaised=new int[30];        //instantiate the array
        for (int i=0;i<randomaised.length;i++){     //loop to run on the array
            randomaised[i]=(rand.nextInt(9)*10+11)+rand.nextInt(9);        //instantiate the array in the place of in a random number
        }
        System.out.println("Array of randomly generated integers(unsorted): ");       //print statement
        remainingElements(0,randomaised.length);        //print the unsorted array
        Arrays.sort(randomaised);       //sort the array
        System.out.println("Array of randomly generated integers(sorted): ");       //print statement
        remainingElements(0,randomaised.length);        //print sorted array
        System.out.println();       //print empty line
        return randomaised;     //return the array
    }

    /**
     * method will print the remaining elements left from the array
     * @param start where to start run on the array
     * @param end  where to end run on the array
     */
    private void remainingElements(int start,int end){
        for (int i=start;i<end;i++){        //loop with variable when to start and end
            System.out.print(randomaised[i]+" ");       //print the array
        }
        System.out.println();       // print empty line
    }

    /**
     * method that will read an input
     * @return integer number
     */
    public String readInout() throws InputMismatchException  {
        String str = scan.nextLine();
        if (str.isEmpty()){
            throw new InputMismatchException();
        }
        return str;
    }

    /**
     * method that will clean the inpout stream
     */
    public void cleanstrem(){
        scan.nextLine(); // clean up the input stream
    }

    /**
     * method that will return time in nano
     * @return time in nano
     */
    public static long nanoTime(){
        return System.nanoTime();   //return the time in nano
    }

    /**
     * method that will return time in millis
     * @return time in millis
     */
    public static long currentTimeMillis(){

        return System.currentTimeMillis();      //return the time in miillis
    }



}

package study1;



public class Stuff {
	/*
	static int [] arrToSort= {58,29,21,9,21,10,88};
	private int holdNum;
    /**
     * Method that will sort the array in bubble sort
     * @param randomaised unsorted array
     
    void bubbleSort(int [] randomaised){
        for (int i=0;i<randomaised.length-1;i++){       //loop for the array
            for (int j=0;j<randomaised.length-1-i;j++){       //loop for array
                if (randomaised[j]>randomaised[j+1]){       //statement to ask if the number is bigger the one after it
                    holdNum=randomaised[j];     //hold temp number
                    randomaised[j]=randomaised[j+1];        //instantiate the smaller number instead of the bigger one
                    randomaised[j+1]=holdNum;       ////instantiate next number with the temp number
                }
            }
        }
    }
    /*
    void print(int arrToSort []) {
    	for (int i=0;i<arrToSort.length;++i) {
    		System.out.print(arrToSort[i]+" ");
    	}
    	System.out.println();
    }
    */
    private int n = 4; 
    private String s = "Original"; 

    public Stuff(int n) {  
     this.n = n / 6;  
    } 

    public void ChangeString(String s) { 
     this.s = s; 
     s = "changed again";   
     System.out.println(s); 
    } 
     
    public String toString() { 
     return "Stuff has n = " + n + " and s = " + s;
    }
}
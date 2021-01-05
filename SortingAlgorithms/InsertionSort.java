package UdemyCourses.DataStructure.SortingAlgorithms;

public class InsertionSort {
    public static void main(String [] args){

        int[] intArray = { 6,5,4,3,2,1,0};
        //first position is sorted: starts at index 1
        for(int firstIndex = 1; firstIndex < intArray.length; firstIndex++){
            //set newElement to array`s first index
            int newElement = intArray[firstIndex];
            int i;
            for(i = firstIndex; i > 0 && intArray[i - 1] > newElement;i--){
               //shift the position
                intArray[i] = intArray[i - 1];
            }
            //set the new element
            intArray[i] = newElement;
        }

        for(int i = 0; i <intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}

package UdemyCourses.DataStructure.SortingAlgorithms;
public class BubbleSort {
    public static void main(String []  args){

        int[] bubbleArray = {3,2,1,0};

        //Starting from the last index then go back down: 6 5 4 3 2 1
        for(int lastIndex = bubbleArray.length -1; lastIndex > 0; lastIndex--){
            //starting from the beginning index and go up
            //inner loops is used to compare two values and swap when condition is true
            for(int i = 0; i < lastIndex; i++ ) {
                if(bubbleArray[i] > bubbleArray[i + 1]){
                    swap(bubbleArray, i, i +1);
                }

//                if(bubbleArray[i] > bubbleArray[i + 1]){
//                    //swap the two values
//                    int temp = bubbleArray[i];
//                      bubbleArray[i] = bubbleArray[lastIndex];
//                      bubbleArray[lastIndex]= temp;
//                }
            }
        }

        //displaying the sorted array
        for(int i = 0 ;i < bubbleArray.length ; i++){
            System.out.println(bubbleArray[i]);
        }
    }

    //swap function
    public static void swap(int [] array, int i, int j){
        if( i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

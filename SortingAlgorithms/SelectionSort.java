package UdemyCourses.DataStructure.SortingAlgorithms;

public class SelectionSort {
    public static void main(String [] args){
        //Sample values to sort
        int[] selectionArray = {5,4,3,2,1};
        //Starting from the lastIndex
        for(int lastIndex = selectionArray.length - 1; lastIndex > 0; lastIndex--){
            //Assigning largestIndex = 0;
            int largestIndex = 0;
            //inner for traverse and starting from the index 1 and check if the index is larger than largestIndex
            for(int i = 1; i <= lastIndex; i++){
                if(selectionArray[i] > selectionArray[largestIndex]){
                    //assign the largest index position
                    largestIndex = i;
                }
            }
            //swap the two index: currentIndex position and largest index position
            swap(selectionArray,lastIndex,largestIndex);
        }

        for(int i = 0; i< selectionArray.length;i++){
            System.out.println(selectionArray[i]);
        }
    }
    public static void swap(int [] array, int i, int j){
        if( i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

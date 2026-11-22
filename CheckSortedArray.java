public class CheckSortedArray{
    public static void main(String args[]){
       int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       boolean sorted = true;

       for(int i = 0; i < array.length-1; i++){
        int next = i + 1;
        if(array[i] > array[next]){           
            sorted = false;
            break;            
        }
       }

       if(sorted == true){
        System.out.println("Array is Sorted");
       }else{
        System.out.println("Array is UnSorted");
       }
    }
}
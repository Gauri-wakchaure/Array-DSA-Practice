public class Check_Sorted_Array{
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 6, 5, 7};
        int i = 0;
        int first = array1[i];
        boolean result = true;

        for(i = 1; i < array1.length; i++){
            if(array1[i] >= first){
                  first = array1[i];
            }else{
                result = false;
                break;
            }
        }

        if(result == true){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Unsorted Array");
        }
    }
}
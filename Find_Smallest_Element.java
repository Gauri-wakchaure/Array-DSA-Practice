public class Find_Smallest_Element{

    public static int Find_Smallest(int array2[], int smallest){
        for(int i = 0; i< array2.length; i++){
            if(array2[i] < smallest){
                 smallest = array2[i];
            }
        }    
       return smallest;
    }
    public static void main(String[] args) {
        int array2[] = {29, 54, 78, 43, 23, 89, 51, 67};
        int smallest = Integer.MAX_VALUE;

        smallest = Find_Smallest(array2, smallest);

        System.out.println("Smallest Element in the Array is : " + smallest);
    }
}
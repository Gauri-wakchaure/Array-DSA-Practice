public class Find_Largest_Element{

    public static int FindLargest(int array1[], int largest){

        for(int i = 0; i < array1.length; i++){
            if(array1[i] > largest){
                largest = array1[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int array1[] = {23, 45, 26, 87, 45, 90, 65, 76, 10};
        int largest = Integer.MIN_VALUE;
        
        largest = FindLargest(array1, largest);

        System.out.println("Largest Number in the Array is : " + largest);
    }
}
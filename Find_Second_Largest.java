public class Find_Second_Largest{
   public static int FindLargest(int array1[], int largest, int secondLargest){
        for(int i = 0; i < array1.length; i++){
            if(array1[i] > largest){
                secondLargest = largest;
                largest = array1[i];
                
                }else if(array1[i] > secondLargest && array1[i] < largest){
                    secondLargest = array1[i];
            }
        }   
        return secondLargest;
    }
    public static void main(String[] args){
        int array1[] = {50, 60, 40, 65, 23, 63, 30};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        secondLargest = FindLargest(array1, largest, secondLargest);

        System.out.println("Second Largest Number in the Array is : " + secondLargest);
    }
}
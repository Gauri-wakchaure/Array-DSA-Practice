public class CountOccurrenceOfElement{
    public static void main(String[] args) {
        int array1[] = {1, 2, 2, 3, 4, 5, 4, 6, 2, 7, 9, 3, 2, 4};
        int element = 2;
        int countEle = 0;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] == element){
                countEle++;
            }
        }
        System.out.println("Occurrence of given Element is : " + countEle);
    }
}
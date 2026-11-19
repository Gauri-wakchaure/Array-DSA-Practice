public class Count_Even_Odd{
    public static void main(String[] args) {
        int array1[] = {34, 65, 32, 90, 67, 91, 77, 33, 42, 12, 23, 66, 88, 43};
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        
        System.out.println("Total Count of Even Numbers is : " + countEven);
        System.out.println("Total Count of Odd Numbers is : " + countOdd);
    }
}
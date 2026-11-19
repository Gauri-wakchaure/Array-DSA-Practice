public class SumOFArrayElements{

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
        }

        System.out.println("Sum Of Elements in the Array is : " + sum);
    }
}
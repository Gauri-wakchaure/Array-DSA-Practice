public class AverageOfArrayElements{

    public static void main(String[] args) {
        int array1[] = {34, 65, 32, 90, 67, 91, 12};
        int sum = 0;

        for(int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
        }
        double result = (double) sum / array1.length;

        System.out.println("Sum Of Elements in the Array is : " + result);
    }
}
public class CountPositiveNegativeZero{
    public static void main(String[] args) {
        
        int array[] = {1, 2, 0, -3, -34, 27, 0, 23, -45, -9, 0, 56};
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                countPos++;
            }else if(array[i] < 0){
                countNeg++;
            }else{
                countZero++;
            }
        }
        System.err.println("Count of Positive Numbers : " + countPos);
        System.err.println("Count of Negative Numbers : " + countNeg);
        System.err.println("Count of Zeros : " + countZero);
    }
}
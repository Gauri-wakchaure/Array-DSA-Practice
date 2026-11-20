public class Find_Missing_Number{
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int missingNo = 0;
        int expOp = 45;       
        int sum = 0;    

        for(int i = 0; i < array.length; i++){
             sum = sum + array[i];
        }
        
        missingNo = expOp - sum;
        System.out.println("Missing Number : " + missingNo);       
    }
}
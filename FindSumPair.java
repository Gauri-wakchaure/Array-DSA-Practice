public class FindSumPair{
    public static void main(String[] args) {
        int array[] = {5, 15, 8, 12, 20, 3};
        int target = 100;
        int i = 0;
        int j = 1;
        boolean result = false;

        for(i = 0; i < array.length; i++){
            for(j = i+1; j < array.length; j++){
                if(array[i]+ array[j] == target){
                    result = true;
                    System.out.println("Pair of Target is : " + array[i] + " + " + array[j]);
                }
            }           
        }
        if(result == false){
            System.out.println("No Pair Found");
        }
    }
}
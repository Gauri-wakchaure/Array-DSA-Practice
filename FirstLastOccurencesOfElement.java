public class FirstLastOccurencesOfElement{

    public static int CheckFirstOccurence(int array[], int key, int firstOccurence){
            
            for(int i = 0; i < array.length; i++){
               if(array[i] == key){
                firstOccurence = i;
                break;
               }
            }
        return firstOccurence;
    }

    public static int CheckLastOccurence(int array[], int key, int lastOccurence ){
            
            for(int j = array.length-1; j >= 0; j--){
                   if(array[j] == key){
                    lastOccurence = j;
                    break;
                }
        }
        return lastOccurence;
    }
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 20, 40, 20, 50, 20, 20, 67};
        int key = 20;
        int firstOccurence = -1;
        int lastOccurence = -1;
        
        firstOccurence = CheckFirstOccurence(array, key, firstOccurence);
        lastOccurence = CheckLastOccurence(array, key, lastOccurence);

        System.out.println("First Occurence is : " + firstOccurence);
        System.out.println("Last Occurence is : " + lastOccurence);
    }
}
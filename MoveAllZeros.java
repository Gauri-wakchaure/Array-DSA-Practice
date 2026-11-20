public class MoveAllZeros{
    public static void main(String[] args) {
        int array1[] = {1, 2, 0, 2, 0, 1, 0, 0, 5, 8};
        int first = 0;
        int temp = 0;
        int last = array1.length-1;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] == 0){
                temp = array1[i];
                array1[first] = array1[last];
                array1[last] = temp;
                first++;
                last--;
            }
        }

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
    }
}
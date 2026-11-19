public class Reverse_Arrays{
    public static void main(String[] args) {
        
        int array1[] = {12, 34, 16, 67, 29, 54, 10};

        int i = 0;
        int temp = 0;
        int first = i;
        int last = array1.length-1;

        while(first < last){
            temp = array1[last];
            array1[last] = array1[first];
            array1[first] = temp;
            first++;
            last--;
        }
        
        for(int j = 0; j < array1.length; j++){
            System.out.print(array1[j] + " ");
        }
    }
}
public class ArrayReverse{
    public static void main(String[] args) {
        int array1[] = {34, 65, 32, 90, 67, 91, 77, 33, 66, 88, 43};

        int first = 0;
        int last = array1.length-1;
        int temp = 0;

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
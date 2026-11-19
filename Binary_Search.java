public class Binary_Search{
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 100;
        int first = 0;
        int last = numbers.length-1;
        int mid = (first + last) / 2;
        boolean found = false;

        while(first <= last) {
            if(key == numbers[mid]){
                found = true;
                System.out.println("Key Found at index : " + mid);
                break;
            }else if(key < numbers[mid]){
                last = mid - 1;
                mid = (first + last) / 2;
            }else{
                first = mid + 1;
                mid = (first + last) / 2;
            }          
        }

        if(found == false){
            System.out.println("Key Not Found");
        }
    }
}
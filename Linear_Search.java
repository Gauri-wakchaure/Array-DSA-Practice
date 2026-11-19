public class Linear_Search{
  public static int linearSearch(int numbers[], int key){
    for(int i = 0; i < numbers.length; i++){
        if(key == numbers[i]){
          return i;
        } 
     }
     return -1;
  }
    public static void main(String args[]){
      int numbers[] = {12, 34, 76, 23, 90, 67, 81};
      int key = 67;
      int NF = -1;

      int result = linearSearch(numbers, key);

      if(NF == result){
        System.out.println("Key Not Found");
      }else{
        System.out.println("Key Found at index : " + result);
      }
  }
}
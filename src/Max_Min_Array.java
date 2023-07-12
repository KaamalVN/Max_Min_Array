import java.util.Scanner;

public class Max_Min_Array {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size= scanner.nextInt();
    int[] array = new int[size];
    for(int iterator=0;iterator<size;iterator++){
        array[iterator]=scanner.nextInt();
    }
    System.out.println(min_max_finder(array));
}

    static int min_max_finder(int[] array) {
        int max_element = Integer.MIN_VALUE;
        int min_element = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max_element){
                max_element=array[i];
            }
            else if(array[i]<min_element){
                min_element=array[i];
            }
        }
        return max_element+min_element;
    }

}

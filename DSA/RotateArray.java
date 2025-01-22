import java.util.*;
public class RotateArray {
    public static void main(String [] args){
        // Rotate Array in Left or Counterclockwise in n^2
        int [] arr = {1,2,3,4,5,6,7,8};
        int d = 3;
        while(d>0) {
            int temp = arr[0];
            for (int i = 0; i<arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            d--;
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
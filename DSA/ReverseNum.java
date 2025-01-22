import java.util.*;
public class ReverseNum {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        int remainder = 0;
        int result = 0;
        while(num>0){
            remainder = num % 10;
            result = result * 10 + remainder;
            num = num/10;
        }
        System.out.print(result);
    }
}

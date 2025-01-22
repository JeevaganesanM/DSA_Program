import java.util.*;
public class NaturalNum {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = obj.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum+= i;
        }
        System.out.print("Natural Number:"+sum);
    }
}

import java.util.*;
public class Swap {
    public static void main(String[]args){
        int a = 6;
        int b = 2;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print("a:"+a+" "+"b:"+b);
    }
}

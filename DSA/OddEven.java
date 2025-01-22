import java.util.*;
class OddEven {
    public static void main(String [] args){

        // Odd or Even without using % operator
        Scanner obj = new Scanner(System.in);

        int aValue =  obj.nextInt();
        int bValue =  obj.nextInt();

        if(((aValue/bValue)*bValue) == aValue){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
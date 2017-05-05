//https://www.youtube.com/watch?v=RDpRV9Gk0wY&feature=youtu.be
//فيديو لشرح كيفية كتابة هذا الكود
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
      int x;
        System.out.println("Enter an integer to check if it is an odd or even");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        if(x%2==0){
            System.out.println("you entered an even number");}
        else{
            System.out.println("you entered an odd number");}
            
        }
    }
    


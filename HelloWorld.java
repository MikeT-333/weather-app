import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name");
        String name= scanner.nextLine();
        System.out.print("Hello"+name+"!");

        }//end main

    private static int doubleNumber(int number) {
        return 2*number;
    }
}//end class
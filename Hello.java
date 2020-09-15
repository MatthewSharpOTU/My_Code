import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("Please input your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.printf("Your age is: %s", age);
    }
}
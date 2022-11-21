import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int c, a, b, x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main menu\n1.Add Employee\n2.View Employees\n3.Search Employee\n4.Delete Employee\n5.Exit");
            System.out.println("Enter your choice");
            c = sc.nextInt();
        }while(c!=5);
    }
}
import java.util.ArrayList;
import java.util.Scanner;
/*class employee {
    int code, salary;
    static int i=1;
    String name, designation, companyname, phone, email;

    employee(int code, String name, String designation, String companyname, int salary, String phone, String email) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.companyname = companyname;
        this.salary = salary;
        this.phone = phone;
        this.email = email;

    }

}
*/
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[]=new String[5];
        Integer code[]=new Integer[5];
        String designation[]=new String[5];
        String salary[]=new String[5];
        String companyname[]=new String[5];
        String phone[]=new String[5];
        String email[]=new String[5];
        //ArrayList<employee> ar=new ArrayList<employee>();


            System.out.println("Main menu\n1.Add Employee\n2.View Employees\n3.Search Employee\n4.Delete Employee\n5.Exit");
            System.out.println("Enter your choice");
            int  c = sc.nextInt();
        do {
            switch (c) {
                case 1:
                    for (int a = 0; a < 5; a++) {
                        System.out.println("Employee details ");
                        System.out.println("Employee code: ");
                        code[a] = sc.nextInt();
                        System.out.println("Employee name");
                        name[a] = sc.next();
                        System.out.println("Employee designation ");
                        designation[a] = sc.next();
                        System.out.println("salary");
                        salary[a] = sc.next();
                        System.out.println("company name ");
                        companyname[a] = sc.next();
                        System.out.println("phone number ");
                        phone[a] = sc.next();
                        System.out.println("Email");
                        email[a] = sc.next();

                    }
                    break;
                default:
                    System.out.println("invalid chice");
            }

        }while(c!=5);
    }
}
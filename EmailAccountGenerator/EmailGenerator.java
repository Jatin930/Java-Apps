import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ASK USER FOR FIRST NAME, LAST NAME AND DEPARTMENT
        System.out.println("Please enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter the department you work in:");
        String department = scan.nextLine();

        //CREATING NEW OBJECT (EMP) BY USING CONSTRUCTOR
        EmployeeInfo emp = new EmployeeInfo(firstName, lastName, department);

        //ASKING THE USER IF THEY WANT TO CHANGE THE PASSWORD (USING SET METHOD TO CHANGE PASSWORD)
        System.out.println("Would you like to change your password? (Y/N)");
        String changePass = scan.nextLine();
        if (changePass.equals("Y") || changePass.equals("y")){
            System.out.println("Please enter the new password here: ");
            String newPass = scan.nextLine();
            emp.changePassword(newPass);
            System.out.println("This is your new password: " + newPass);
        }
        else if(changePass.equals("N") || changePass.equals("n")) {
            System.out.println("Ok, Thank You!");
        }
        else System.out.println("Error: Enter valid input (Y/N)");

        System.out.println();
        //GET METHOD FOR NAME
        System.out.println("Full Name: " + emp.getName());
        //GET METHOD FOR EMAIL
        System.out.println("Email: " + emp.getEmail());
        //GET METHOD FOR PASSWORD
        System.out.println("Password: "+ emp.getPassword());
        System.out.println("Your mail box capacity is at: " + emp.getMailBoxCap());
        }



    }



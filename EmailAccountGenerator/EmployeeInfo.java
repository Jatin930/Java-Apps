import java.util.Random;
public class EmployeeInfo {
    public String firstName;
    public String lastName;
    public String email;
    public String department;
    public String password;
    public int mailBoxCap = 100;
    //CONSTRUCTOR TO INITIALIZE VARIABLES
    public EmployeeInfo(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        email = firstName.toLowerCase() +  "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".com";
        System.out.println("Email: "+ email);
        this.password = generateRandomPassword(10);
        System.out.println("Password: " + password);
    }

    //METHOD TO GENERATE RANDOM PASSWORD
    public static String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //SET METHOD TO CHANGE PASSWORD
    public void changePassword(String password){
        this.password= password;
    }
    //GET METHOD TO GET NAME
    public String getName(){
        return firstName + " " + lastName;
    }
    //GET METHOD TO GET EMAIL
    public String getEmail(){
        return email;
    }
    //GET METHOD TO GET PASSWORD
    public String getPassword(){
        return password;
    }
    //GET METHOD TO GET MAIL BOX CAPACITY

    public int getMailBoxCap(){
        return mailBoxCap;
    }
}

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class DateTaker {
    private  String userName ;
    private String userDOB;

    public void myName() {
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Please enter your name");
        String myName = myObj.nextLine(); //Read user input
        this.userName = myName;
    }

    public void myDOB() {
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Please Enter your Date of birth to see magic");
        String myDOB = myObj.nextLine();
//        LocalDate dateEntered = LocalDate.parse(myObj.nextLine());
//        LocalDate dateNow = LocalDate.now();
//        LocalDate myDOB = dateNow - dateEntered;
        this.userDOB = myDOB;
    }

    public void getMagic() {
        String magicName=  userName ;
        String magicDOB = userDOB;
        String magicDetails = "Your magic name is: " +magicName + " " +"and your magic date of birth is " +magicDOB;
        System.out.println(magicDetails);
    }


}


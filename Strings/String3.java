import java.util.*;

public class String3 
{
    public static void main(String[] args) 
    {
        boolean isTrue = true;
        String email,username;
        username ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email : ");
        email = scanner.next();


        for(int i =0;i<email.length();i++)
        {
            if(email.charAt(i) == '@')
            {
                isTrue = false;
                break;
            }
            else
            {
                username += email.charAt(i);
            }
        }
        System.out.println("Username : " + username);


        scanner.close();



    }
    
}
// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = apnaCollegeJava@gmail.com  ; username = apnaCollegeJava 
// email = helloWorld123@gmail.com username = helloWorld123
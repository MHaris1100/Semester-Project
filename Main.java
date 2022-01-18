import java.util.*;
public class Main 
{
    int amount;
    int withdraw;
    int pincode;
    int deposit;
    
    Scanner input=new Scanner(System.in);
   
    public static void main(String[] args)
    {
        Login Log=new Login();
        Log.setdata();
        Log.Login();
        Log.other();
        
    }

}

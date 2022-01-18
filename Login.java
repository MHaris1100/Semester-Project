
public class Login extends Withdraw
{
    int PIN;
    public void setdata()
    {
        System.out.println("Set your pincode:");
        pincode=input.nextInt();
    }
    public void Login()
    {
        System.out.println("Enter your pincode");
        PIN=input.nextInt();
    
     if( pincode==PIN)
     {
        int Choice;
        
        System.out.println("Pin Approved");
        System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.EXIT");
        Choice=input.nextInt();
        
        switch(Choice)
        {
            case 1:
            {
                Withdraw();
                break;
            }
            case 2:
            {
                Deposit();
                break;
            }
            case 3:
            {
                Check_balance();
                break;
            }
            case 4:
            {
                break;
            }
        }
    }
    else
    {
        System.out.println("Enter the correct pincode");
        Login();
    } 
    }
      

}


public class Withdraw extends Deposit
{
    public void Withdraw()
    {
      
        System.out.print("Enter money to be withdrawn:");
       
        withdraw = input.nextInt();
        if(amount >= withdraw)
        {
           amount = amount - withdraw;
           System.out.println("Please collect your money");
        }
        else
        {
           System.out.println("Insufficient Balance");
        }
        System.out.println("");               
   } 
    public void other()
   {
      int other;
      System.out.println("would you like to check your total amount :");
      System.out.println("1.YES\n2.NO:");
      other=input.nextInt();
      switch(other)
      {
          case 1:
          {
              Check_balance();
              break;
          }
          case 2:
          {
              break;
          }
      }
   }
}

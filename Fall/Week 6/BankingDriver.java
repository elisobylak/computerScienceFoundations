public class BankingDriver
{
  public static void main(String[] args)
  {
    Banking nicksAcct = new Banking ("nick", 450, 550);
    Banking carolsAcct = new Banking ("carol", 600, 700);
    //Creates objects for Nick and Carol's Accounts//
    
    System.out.println(nicksAcct.getTotalMoney()+carolsAcct.getTotalMoney());
    //Prints total in both Nick and Carols Accts//
    
    nicksAcct.setCheckMoney(550);
    //Adds one hundred dollars to nicks acct//
    
    System.out.println(nicksAcct);
    //Prints out Nicks stats//
    
    int tempCheck = nicksAcct.getCheckMoney();
    int tempSave = nicksAcct.getSaveMoney();
    //Saves Nicks Acct values to temp values//
    
    carolsAcct.setCheckMoney(carolsAcct.getCheckMoney()+tempCheck);
    carolsAcct.setSaveMoney(carolsAcct.getSaveMoney()+tempSave);
    //sets Carol's Checking and saving to equal her old value plus the value of nicks Acct//

    
    nicksAcct.setCheckMoney(0);
    nicksAcct.setSaveMoney(0);
    //Wipes Nick's Acct of all values//
    
    System.out.println(nicksAcct);
    System.out.println(carolsAcct);
    //Prints the stats of both of thier Accts again//
  }
}
    
    
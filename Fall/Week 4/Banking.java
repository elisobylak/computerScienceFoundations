public class Banking
{
  private String name;
  private int checkMoney;
  private int saveMoney;
  
  
  
  
  public Banking(String who, int checking, int saving){
    name = who;
    checkMoney = checking;
    saveMoney = saving;
  }
  
  public int getTotalMoney(){
    return(checkMoney+saveMoney);
  }
  
  Banking nicksAcct = new Banking("Nick",450,550);
  Banking carolsAcct = new Banking("Carol",600,700);
  
  System.out.println(nicksAcct.getTotalMoney());
}


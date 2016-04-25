public class Infant{  
  
  public static void main(String[] args); }

{
    private  String name;
    private int age;  // age in months
    
    public Infant(String who, int months){
      name = who;
      age = months;
    }
   
    public String getName(){return name;}
 
   public int getAge(){return age;}
   
   public void anotherMonth(){age = age + 1;}
}
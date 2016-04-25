/*Eli Sobylak
 * & 
 * Megan Morton
 * CSF-14
 * October 1-2014
 * 
 **/


public class Stars {
  String stars;
  public void setStars(String c) {
    stars=c;
  }
  public String getStars() {
    return stars;
  }
  
  public static void main(String[] args) {
    Stars myStars = new Stars();
    myStars.setStars("*****");
    
    String Stars = myStars.getStars();
    System.out.println(Stars);
    System.out.println(Stars);
    System.out.println(Stars);
  }
}

      
    
    
    
    

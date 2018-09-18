import java.util.*;

/*
 *
 * @author Lento_Kun
 */
 
 class auth{
   
   static Scanner input = new Scanner(System.in);
   static String user = "admin";
   static String pass = "adminpass";
   
   public static void main(String[] args){
      
      logg:
      for(int x = 0; ; x++){
      System.out.print("Enter Username: ");
      String the_user = input.next();
      
      System.out.print("Enter Password: ");
      String the_pass = input.next();
      
      if(the_user.equals(user) && the_pass.equals(pass)){
      System.out.println("Access Granted");
      break logg;
      } else {
      System.out.println("Invalid User or Pass");
       }
     }
  }
}
   
   

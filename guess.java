import java.util.*;

/*
 *
 * @author Lento_Kun
 */
 
 class guess{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   Random rand = new Random();
   
   game:
   for(int x=0 ; ; x++){
    int random = rand.nextInt(10);
    System.out.print("\n < [ Guess The Number ] > \n [ Input Here ]: ");
    int guess = nextInt();
    if(guess==random){
     System.out.print("\nWinner Winner Chicken Dinner!\n");
    
    } else {
     System.out.print("\nBetter Luck Next Time!\n");
    }
    System.out.print("Do you want to play again?");
    
    looper:
    for(int y=0; ; y++){
     System.out.print("\n[ Do you want to play again? ] \n [ Type : yes || no ] \n [ Input Here ]: ");
     String ans = input.next();
     
     if(ans.equalsIgnoreCase("yes")){
      continue game;
     } else if(ans.equalsIgnoreCase("no")){
      System.out.print("\n [ Thank You For Playing ] \n");
      break game;
     } else {
      continue looper;
      
      

     }}}}}

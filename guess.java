import java.util.*;

/*
 *
 * @author Lento_Kun
 */
 
 class guess{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   Random rand = new Random();
   
   loop:
   for(int x=0 ; ; x++){
    int random = rand.nextInt(10);
    System.out.print("==========\n===[Guess The Number]===\n==========\n");
    System.out.print("Enter Number: ");
    int guess = nextInt();
    if(guess==random){
     System.out.print("\nWinner Winner Chicken Dinner!\n");
    } else {
     System.out.print("\nBetter Luck Next Time!\n");
    }
    System.out.print("Do you want to play again?");
    
    looper:
    for(int y=0; ; y++){
     System.out.print("\nType [ no ] for No and \nType any for continue playing\n");
     String ans = input.next();
     

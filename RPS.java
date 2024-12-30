import java.util.Scanner;
import java.util.Random;
public class RPS {
public static void main(String[] args) {
    String choice="";
    int usernm=0;
      try(Scanner sc=new Scanner(System.in)) {
        Random play=new Random();
        int num=play.nextInt(1,3);
          if(num==1){
           choice="Scissor";
}
       else if(num==2){
          choice="Paper";
}
     else if(num==3) {
        choice="Rock";
  }
System.out.println("Lets Play a [Rock], [Paper], [Scissor] __GAME!!!!:)");
System.out.print("Pls,Enter Your Choice :");
String user=sc.next();
System.out.println("Your Choice Was:"+user);

 if(user.equalsIgnoreCase("paper"))
 {
   usernm=4;
 }
else if(user.equalsIgnoreCase("rock"))
{
  usernm=5;
}
else if(user.equalsIgnoreCase("scissor")){
  usernm=6;
}
else{
  System.out.println("WRONG ENTRY!!!!!!");
}
//checking to see who won
 if(num==1 && usernm==4)
{
  System.out.print("[YOU LOST!!]\n"+"COMPUTER PLAYED:"+choice);
  
}
else if(num==1 && usernm==6){
  System.out.print("[IT'S A DRAW!!]\n"+"COMPUTER PLAYED:"+choice);
  

}
 else if(num==1 && usernm==5){
  System.out.println("[YOU WON!!]\n"+"COMPUTER PLAYED:"+choice);
 }
 else if(num==2&&usernm==4){
  System.out.println("[IT'S A DRAW!!]\n"+"COMPUTER PLAYED:"+choice);
 }
 else if(num==2&&usernm==6){
  System.out.println("[YOU WON!!]\n"+"COMPUTER PLAYED:"+choice);
 }
  else if(num==2&&usernm==5){
    System.out.println("[YOU LOST!!]\n"+"COMPUTER PLAYED:"+choice);
  }
   else if(num==3&&usernm==4){
    System.out.println("[YOU LOST!!]\n"+"COMPUTER PLAYED:"+choice);
   }
    else if(num==3&&usernm==6){
      System.out.println("[YOU WON!!]\n"+"COMPUTER PLAYED:"+choice);
    }
     else if(num==3&&usernm==5){
      System.out.println("[IT'S A DRAW!!]\n"+"COMPUTER PLAYED:"+choice);
     }
     else{
      System.out.println("INVALID!!!!");
     }

  
}}}
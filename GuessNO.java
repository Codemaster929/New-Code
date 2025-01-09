import java.util.Random;
import java.util.Scanner;
class guess{
    
    
Random nums=new Random();
int choice=nums.nextInt(1,100);
 private int number;
 public void setnum(int n){
    this.number=n;
} 
public void getnum(){
    System.out.println("YOU,choose:"+number);
    
}
public void game(){
    while(choice!=number){
        if(number>choice){
            System.out.println("YOU GUESSED HIGHER THAN THE NO");
         System.out.println("GUESS AGAIN ...\n");        
               break;  }
    //    else if(choice==number){
    //    System.out.println("CONGRATS, YOU GUESSED IT CORRECT,IN !!!FIRST TRY!!!:\n"+"Computer Choose :"+choice);
    //    break;
// }
else {
    System.out.println("YOU GUESSED LOWER THAN THE NO");
    System.out.println("GUESS AGAIN...\n");
    break;}     
}
}}
public class guessno{
     public static void main(String[] args) {
      guess rando=new guess();
        try(Scanner gt =new Scanner(System.in)) {
            // System.out.println("comp choice: "+rando.choice);
        System.out.println(">>WELCOME,LETS PLAY A GAME, YOU HAVE TO GUESS A NO FROM 1 TO 100, LET'S SEE IF YOU CAN...");
        System.out.println(">>YOU GET A RANKING BASED ON,IN HOW MANY CHANCES YOU  GET IT RIGHT:)");
        System.out.println(">>SO, LETS SEE THE RANKINGS ARE AS FOLLOWS:\n1.TRY(1-2)== GUESS MASTER\t2.TRY(3-4)==PRO GUESSER\n3.TRY(5-6)==SHARP GUESSER\t4.TRY(7-8)==NOVICE GUESSER\n5.TRY(above 8)==LUCKY GUESSER");     
   
        int loop=0;int count =1;
        while(loop<100){
            System.out.print("||ENTER THE NUMBER YOU GUESS:");
            int num=gt.nextInt();
            if(num>100){
                System.out.println("!!!! WRONG INPUT, YOU HAVE TO GUESS B/W 1 TO 100 ONLY\n");
                continue;
            }
         if(rando.choice==num){
            System.out.format("[[ CONGRATS, YOU GUESSED IT CORRECT,IN !!! %d TRY!!! ]]\n",count);
            System.out.println("__COMPUTER CHOICE :__"+rando.choice);
            break;
        }
            rando.setnum(num);
            rando.getnum();
            rando.game();
            loop++;
            count++;
        
        if(loop==99){
      System.out.println("NO NOT GUESS AGAIN ..,THE NO OF CHANCES IS OVER ,!!!YOU LOST!!!");
    System.out.println("CPMPUTER CHOICE WAS:"+rando.choice);
    
        }}
        if(count>=1&&count<=2){
            System.out.println(">>YOU ARE GUESS MASTER<<");
        }
        else if(count>2&&count<=4){
            System.out.println(">>YOU ARE PRO GUESSER<<");
        }
        else if(count>4&&count<=6){
            System.out.println(">>YOU ARE SHARP GUESSER<<");
        }
        else if(count>6&&count<=8){
            System.out.println(">>YOU ARE NOVICE GUESSER<<");
        }
        else{
            System.out.println(">>YOU ARE LUCKY GUESSER<<");
        }
    
     
    }}}





 /**
  *@author: Veranika Tolkach
  *Assignment 3
  * This program creates a game that rolls two dices
  * 10 times. If at least once out of 10 times
 * the sum of random numbers is 10, the user wins.
 **/
  import java.util.Random;
  public class RollDice
 {
    public int randomNum1(int n)
  {
    Random rand=new Random();
    int num1=rand.nextInt(6)+1;
    return num1;
    }//end of randomNum1
   
    public int randomNum2(int m)
    {
    Random rand=new Random();
    int num2=rand.nextInt(6)+1;
    return num2;
    }//end of randomNum2
    
       public static void main(String[] args)
       {
       Boolean youWon=false;
       int sum;
       int die1;
       int die2;
       RollDice dice1=new RollDice();//creating an object called dice1
       RollDice dice2=new RollDice();//creating an object called dice2
       System.out.println("Num1 Num2 Sum");
       int i=0;
       for (i=0;i<10;i++)
       {
       die1=dice1.randomNum1(7);           
       die2=dice2.randomNum2(7);
       sum=die1+die2;
      System.out.println(die1 + "\t\t" + die2 + "\t\t" + sum);
        if(sum==10)
        {
          youWon=true;
        }
      
       }//end for
       if(youWon)
       {
          System.out.println("You won");
       }
      
       }//end of main
 }//end of RollDice
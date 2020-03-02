/**
 * @(#)code.java
 *
 *Create a Program that will Generate a Ramdom number (1-50).
	Let the user guess the random number generated given 3 attempts 
	before the program reveals to correct generated number.
	User will be provided a hint by the program by prompting "higher" if the user number is less than the random number.
	and "lower" if the user number is greater than the random number.
	The program can be played several times (generating different random number) as long as the user wants to.
	 * @author 
 * @version 1.00 2020/3/2
 */
import javax.swing.JOptionPane;
import java.util.Random; 
public class Lanzaderas_exer3{
        
   
    public static void main(String[] args) {
         Random rand = new Random();
         int rand_int1 = rand.nextInt(5);
         int input;
         String ans = "y";
         while (ans.equals("y")){
         int att = 0;
         for(int i = 1 ; i<=3 ;i++){
         	do{
         		input = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
         	}while(input<0);
         	
         	if (input == rand_int1){
         		JOptionPane.showMessageDialog(null,"You guess the number" + rand_int1);
         		att = att + 1;
         		break;
         	}
         	else if (input < rand_int1){
         		JOptionPane.showMessageDialog(null,input + "is less than the Number");
         		att = att + 1;
         	}
         	else if (input > rand_int1){
         		JOptionPane.showMessageDialog(null,input + "is greater than the Number");
         		att = att + 1;
         	}
         }//for looop end
         JOptionPane.showMessageDialog(null,"ATTEMPTS = "+att);
         ans = JOptionPane.showInputDialog(null,"Want to try again? [y/n]");
    }//end while
}
}
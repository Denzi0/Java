/**
 * @(#)LoopSample.java
 *							Compute the average of 10 scores.
 *							Display the average;
 *						**  Let the user compute another average if he wish for.
 *                      ** Program must not accept negative values.
 * @author 
 * @version 1.00 2020/3/2
 */

import javax.swing.JOptionPane;

public class LoopSample {
  
    public static void main(String[] args) {
      
      int num,sum=0;
      String ans="y";
      
      
     while (ans.equals("y")) {
     
    	  for (int ctr=1; ctr<=10; ctr++){
      			do{
      				num = Integer.parseInt(JOptionPane.showInputDialog("Enter Number " + ctr));
      			}while (num<0);	
      			
      			sum+=num;
      			}//end of for
      	 JOptionPane.showMessageDialog(null, "The average is : " + sum/10);
      	 
      	ans = JOptionPane.showInputDialog("Want to try again? [y/n]");
     }//end of while
   
    }
    
}

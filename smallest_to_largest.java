/**
 * @(#)smallest_to_largest.java
 *
 *
 * @author 
 * @version 1.00 2020/2/29
 */
import javax.swing.JOptionPane;
public class smallest_to_largest {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int smallest = 0;
        int largest = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("enter num 1 "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("enter num 2 "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("enter num 3 "));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("enter num 4 "));
        num5 = Integer.parseInt(JOptionPane.showInputDialog("enter num 5 "));
       	double average = num1 + num2 + num3 + num4 + num5 /5;
       	if (num1 > num2){
       		largest = num1;
       		smallest = num2;
       	}else{
       		smallest = num1;
       		largest = num2;
       	}
       	
       	if (num3 > largest){
       		largest= num3;
       	}
       	if (num3 < smallest){
       		smallest = num3;
       	}
       	if (num4 > largest){
       		largest = num4;
       	}
       	if (num4 < smallest){
       		smallest = num4;
       	}
       	if (num5 > largest){
       		largest = num5;
       	}
       	if (num5 < smallest){
       		smallest = num5;
       		
       	}
       	
       	
       		
       	JOptionPane.showMessageDialog(null,"Largest number "+ largest);
       	JOptionPane.showMessageDialog(null,"Smallest "+ smallest);
       	JOptionPane.showMessageDialog(null,"Average " + average);
       	
       	
    }
}


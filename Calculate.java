import javax.swing.*;
class Calculate{
	public static void main(String arg[]){
		String num1 = JOptionPane.showInputDialog(null, " Enter Num1");
		String num2 = JOptionPane.showInputDialog(null, " Enter Num2 ");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, " Addition is = " + (a + b) + " \n Subtraction is = " + ( a - b) + " \n Multiplication is = " + ( a * b) + " \n Division is = " + ( a / b) + " \n Reminder is = " + ( a % b));
	}
}
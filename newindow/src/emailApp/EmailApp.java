package emailApp;

import javax.swing.JOptionPane;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str1=JOptionPane.showInputDialog("Enter your first name : ");
			String str2=JOptionPane.showInputDialog("Enter your last name : ");
			Email em1=new Email(str1, str2);
			String realMadrid= em1.changePasword("sonOfBarca");
			System.out.println(em1.showInfo());
			System.out.print("Updated Password : " +realMadrid);
			
	}

}

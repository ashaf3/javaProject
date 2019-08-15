package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

	private String fName;
	private String lName;
	private String password;
	private String Department;
	private String alternameEmail;
	private String email;
	private int mailBoxCapacity=500;
	private String companySuffix="lambton.com"; 
	private int defaultPasswordLength=10;
	
	//constructor for receiving fname and lname
	
	public Email(String firstname, String lastname)
	{
		this.fName=firstname;
		this.lName=lastname;
		//System.out.println("Email created : "+this.fName + " "+this.lName);
		//calling setDept method
		this.Department=setDept();
		//System.out.println("Department : "+this.Department	);
		//call to randomPassword method
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("Your password is : "+this.password);
		
		//email creation
		email=fName.toLowerCase()+"."+lName.toLowerCase()+"@"+Department.toLowerCase()+"."+companySuffix;
		//System.out.println("your email id : "+email);
		
		
	}
	
	


	//ask department
	private String setDept() {
		System.out.print("New Employee : "+fName+" "+lName+" \nChoose YOUR DEPARMENT: \n1 SALES\n2 DEVELOPMENT\n3 ACCOUNTING\n0 NONE\n Enter department code : ");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt(); 
		
		if (deptChoice==1){return "SALES";}
		else if (deptChoice==2){return "DEVELOPMENT";}
		else if (deptChoice==3){return "ACCOUNTING";}
		else {return "";}
		
		
		
	}
	//random password creation
	private String randomPassword(int length) {
		
		String passSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] passwrd=new char[length];
		for (int i=0;i<length;i++){
			int rand=(int) (Math.random() * passSet.length());
			passwrd[i]=passSet.charAt(rand);
		}
		return new String(passwrd);
	}
	//set mailbox capacity
	public void setMailBoxCapacity(int capacity){
		this.mailBoxCapacity=capacity;
	}
	
	public int getMailBoxCapacity(){return mailBoxCapacity;}
	
	//set alternate email
	public void setAlternamteEmail(String altEmail){
		this.alternameEmail=altEmail;
	}
	public String getAlternateEmail(){return alternameEmail;}
	
		// change password
	public String changePasword(String password){
		//this.password=password;
		return password;
	}
	public String getPassword(){return password;}
	public String showInfo(){
		return "Name : "+fName +" " + lName +
				"\nCOMPANY EMAIL : " + email + 
				"\nYour password is : "+password+
				"\nMAILBOX CAPACITY : "+mailBoxCapacity + "mb";
	}
}

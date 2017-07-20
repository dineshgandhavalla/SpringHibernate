import java.util.*;
class Bank
{

	protected double balance;
	
  void newAccount()
  {
  	System.out.println("your details");

  	
  }

  double deposit(double d)
  {
  	
  	balance = balance+ d;
  	System.out.println("the deposited amount is :" +balance);
  	return balance;
  }

}

  
class Atm extends Bank
{
 
 void miniStatement()
 {
 	System.out.println("this is for miniStatement: "+balance);
 }

 void balanceEnquiry()
 {
 	System.out.println("your account balance is : "+balance);
 }
 int withdrawl(int w)
 {
 	balance= balance-w;
 	System.out.println("the withdrawn amount is :" + w);
 	//System.out.println("the Balance amount is :" + balance);
 	return w;
 }
}


class AccountDetails
{
	private String name;
	private String email;
	private String mobileno;
	private String idno;

	public void setName(String name)
	{
		this.name = name ;
	}

	public void setEmail(String email)
	{
		this.email = email ;
	}

	public void setMobileno(String mobileno)
	{
		this.mobileno = mobileno ;
	}

	public void setIdno(String idno)
	{
		this.idno = idno ;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email ;
	}

	public String getMobileno()
	{
		return mobileno ;
	}

	public String getIdno()
	{
		return idno ;
	}

}


public class BankingDemo
{
	public static void main(String[] args)
	{
		Atm obj = new Atm();
		obj.miniStatement();
		obj.deposit(50000);
		obj.miniStatement();
		Scanner s = new Scanner(System.in);
		int num =0;
		num = s.nextInt();
		obj.withdrawl(num);
		//obj.withdrawl(2000);
		obj.miniStatement();
		
		obj.withdrawl(5000);
		obj.miniStatement();

		obj.deposit(60000);
		obj.miniStatement();
		obj.newAccount();
		//obj.balanceEnquiry((obj.deposit(50000))-(obj.withdrawl(2000)));
		/*System.out.println("the deposited amount is :" +obj.deposit(50000));
		System.out.println("the withdrawn amount is :" +obj.withdrawl(2000));
		System.out.println("your account balance is :" +obj.balanceEnquiry((obj.deposit(50000))-(obj.withdrawl(2000))));
		*/
		AccountDetails ad = new AccountDetails();


		Scanner sn = new Scanner(System.in);
		String name =null;
		name = sn.nextLine();
		ad.setName(name);
		ad.setEmail("dineshkumargandhavalla94@gmail.com");
		ad.setMobileno("9160596953");
		ad.setIdno("AP0001245Q778");

		System.out.println("Name :"+ad.getName());
		System.out.println("Email id :"+ad.getEmail());
		System.out.println("Contact no :"+ad.getMobileno());
		System.out.println("Id Proof no :"+ad.getIdno());

	}
}
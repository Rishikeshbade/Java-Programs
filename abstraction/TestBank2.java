package abstraction;

abstract class Bank2{
	
	public abstract double getBalance();
}

class BankA extends Bank2{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}

class BankB extends Bank2{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		
		return 150;
	}
	
}

class BankC extends Bank2{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 200;
	}
	
}

public class TestBank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA banka;
		banka = new BankA();
		
		BankB bankb;
		bankb = new BankB();
		
		BankC bankc;
		bankc = new BankC();
		
		System.out.println("Balnce in Bank A : &"+banka.getBalance());
		System.out.println("Balnce in Bank B : &"+bankb.getBalance());
		System.out.println("Balnce in Bank C : &"+bankc.getBalance());
		
	}

}

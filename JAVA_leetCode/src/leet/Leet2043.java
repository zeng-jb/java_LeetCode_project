package leet;

public class Leet2043 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long balence [] = {10, 100, 20, 50, 30};
		Bank bank = new Bank(balence);
		System.out.println(bank.withdraw(3, 10));
		System.out.println(bank.transfer(5, 1, 20));
		System.out.println(bank.deposit(5, 20));
		System.out.println(bank.transfer(3, 4, 15));
		System.out.println(bank.withdraw(10, 50));
	}

}


class Bank {

	long[] balance;
	int N;
	
	public boolean check(int account) {
		return 0 < account && account <= N;
	}
	
    public Bank(long[] balance) {
    	this.balance = balance;
    	N = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
    	if(check(account2) && withdraw(account1, money)) {
    		return deposit(account2, money);
    	}
    	return false;
    }
    
    public boolean deposit(int account, long money) {
    	if(!check(account)) {
    		return false;
    	}	
		balance[account-1] += money;
		return true;
    	
    }
    
    public boolean withdraw(int account, long money) {
    	if(!check(account) || balance[account-1] < money) {
    		return false;
    	}
		balance[account-1] -= money;
		return true;
    	
    }
}
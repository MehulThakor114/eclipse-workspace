package com.phoenix.inner;
//Outer class
public class Account {
	
	private int accNo;
	private String ownerName;
	private float balance;
	
	
	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void print()
	{
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	//non static inner class Locker
	public class Locker{
		private int Lockerid;
		private String Label;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}

		public Locker(int lockerid, String label) {
			super();
			Lockerid = lockerid;
			Label = label;
		}
		public void lock()
		{
			System.out.println("Account is Locked: " + accNo);
		}
		
		public void unlock()
		{
			System.out.println("Account is UnLocked: " + accNo);
		}
		public void keepThings()
		{
			System.out.println("Things are in locker");
		}
		
		
	}

}

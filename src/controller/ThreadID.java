package controller;

public class ThreadID extends Thread {

	public ThreadID() {
		super();
	}

	private void showID() {
		int ID = (int)threadId();
		System.out.println("TID: "+ID);
	}
	
	@Override
	public void run() {
		showID();
	}

}

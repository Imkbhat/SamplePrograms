package com.bob.hms.admin.common;

public class SenderReceiverSynchrinization {
	
	public void send(String message) {
		System.out.println("Sending message = " +message);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
			System.out.println("Interrupted Exception");
		}
		System.out.println("\n" + message + "Sent");
	}

	public static void main(String[] args) {
		
		SenderReceiverSynchrinization send = new SenderReceiverSynchrinization();
		SendThread thread = new SendThread(" Hi ", send);
		SendThread thread1 = new SendThread(" Bye ", send);
		
		thread.start();
		thread1.start();
		
		try{
			thread.join();
			thread1.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
	
	static class SendThread extends Thread {
		
		private String message;
		SenderReceiverSynchrinization send;
		
		public SendThread(String message, SenderReceiverSynchrinization Obj) {
			this.message = message;
			send = Obj;
		}
		
		@Override
		public void run() {
			synchronized (send) {
				send.send(message);
			}
		}
	}
}

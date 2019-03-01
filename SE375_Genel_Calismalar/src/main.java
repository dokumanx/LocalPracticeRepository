
public class main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new newThread();
		
		t1.setName("Yeni Thread");
		t1.start();
		
		new Thread() {
			
			public void run() {
				System.out.println("\n"+ Thread.currentThread().getName());
			}
			
		}.start();
		
		new Thread() {
				
				public void run() {
					System.out.println("\n"+ Thread.currentThread().getName());
				}
				
			}.start();
			
		new Thread() {
			
				public void run() {
					System.out.println("\n"+ Thread.currentThread().getName());
				}
				
			}.start();
			
			
		Thread runnableThreadObject = new Thread(new RunnableClassThread());
		runnableThreadObject.start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("\nAnonim "+Thread.currentThread().getName());
				
			}
		}).start();
		
	}

}

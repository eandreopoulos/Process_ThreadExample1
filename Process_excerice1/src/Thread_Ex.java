
public class Thread_Ex extends Thread{
	
	String name;
	
	public Thread_Ex(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("Hi my name is " + name);
	}

	public static void main(String[] args) {
		Thread_Ex t1 = new Thread_Ex("alpha");
		Thread_Ex t2 = new Thread_Ex("beta");
		
		t1.start();
		t2.start();
	}
}

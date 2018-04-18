package firstJavaProgram;

public class InstanceCounter {
	private static int numInstance = 0;
	protected static int getCount() {
		return numInstance;
	}
	private static void addinstance() {
		numInstance++;
	}
	public InstanceCounter() {
		// TODO Auto-generated constructor stub
		InstanceCounter.addinstance();
	}
	public static void main(String []args) {
		System.out.println("starting wiht" + 
	InstanceCounter.getCount() + "instances");
		for (int i=0; i<500; ++i) {
			new InstanceCounter();
		}
		System.out.println("starting wiht" + 
				InstanceCounter.getCount() + "instances");
	}
	
}

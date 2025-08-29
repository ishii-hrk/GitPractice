package drill08;

public class Drill0812 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		counter.increaseCounter();
		counter.increaseCounter();
		counter.increaseCounter();
		
		counter.decreaseCounter();
		counter.decreaseCounter();
		
		counter.displayCounter();
	}

}

class Counter{
	
	int counter;
	
	public Counter() {
		this.counter = 0;
	}
	
	public void increaseCounter() {
		counter++;;
	}
	
	public void decreaseCounter() {
		counter--;
	}
	
	public void displayCounter() {
		System.out.println("Counter:" + counter);
	}
}

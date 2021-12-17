package SortingAlgorithms;

public class Timer extends Thread{
	
	public boolean loop;
	public int time;
	
	public Timer() {
		this.loop = true;
		this.time = 0;
	}
	
	@Override
	public void run() {
		try {
			
			while(loop) {
				//System.out.println("Test");
				Thread.sleep(1);
				time++;
			}
		} catch (Exception e) {
			
		}
	}

}
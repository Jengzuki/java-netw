package thread;

public class SingleRunnable implements Runnable {

	private int[] temp;
	public SingleRunnable(){
		temp = new int[3];
		for (int start = 0; start < temp.length; start++) {
			temp[start] =start;
		}
	}
	
	@Override
	public void run() {
		
		for (int start : temp) {
			try {
				Thread.sleep(1000); //10초 //  1/1000초만큼 쉬어라
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s,",Thread.currentThread().getName());
			System.out.printf("temp value  :  %d %n", start);
	
		}
	}
		}

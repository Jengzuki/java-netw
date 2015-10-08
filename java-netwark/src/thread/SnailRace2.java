package thread;

import java.util.Random;

public class SnailRace2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("경주 시작");
		System.out.println("달팽이들 출발 준비....");
		Snail s1 =new Snail("성한");
		Snail s2 =new Snail("순환");
		Snail s3 =new Snail("준규");
		Snail s4 =new Snail("혜숙");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		//달팽이들이 경기를 마치기 전까지는 main() 스레드를 종료시키면 안되기 떄문에 블락(걸어잠군다.)시켜야 하므로
		// join(); 을 호출한다.
		
		s1.join();
		s2.join();
		s3.join();
		s4.join();
		
		System.out.println("달팽이 경주가 종료");
		
	}
}
class Snail2 implements Runnable{
	public Snail2(String name) {

	}
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int randomNum = r.nextInt(501); // 1부터 500까지 랜덤 숫자발생
			try {
				Thread.sleep(randomNum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(Thread.currentThread().getName()+"달팽이"+i+"미터 전진");
		}
		System.out.println(Thread.currentThread().getName()+"달팽이가 결승전을 통과합니다!!!!!");
	}
}
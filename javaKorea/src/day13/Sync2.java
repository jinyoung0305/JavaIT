package day13;

public class Sync2 {
	public static void main(String[] args) {
		Room room = new Room();
		Thread t1 = new Thread(room, "사람1");
		Thread t2 = new Thread(room, "사람2");
		Thread t3 = new Thread(room, "사람3");
		
		t1.start();
//		try {t1.join();} catch (Exception e) {e.printStackTrace();}
		t2.start();
//		try {t2.join();} catch (Exception e) {e.printStackTrace();}
		t3.start();
	}
}

// 의상실
// 한 사람이 사용 중이면 다른 사람들은 대기를 해야한다 --> 동기화
class Room implements Runnable {
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("의상실 입장");
			while(time < 5) {
				try {Thread.sleep(1000);} 
				catch (Exception e) {e.printStackTrace();}
				time++;
				System.out.println(Thread.currentThread().getName()+" 의상실 사용 중..."+time+"초");
			}
			System.out.println("의상실 비움");
		}
	}
	
}

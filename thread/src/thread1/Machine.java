package thread1;
public class Machine extends Thread{
	private static StringBuffer log = new StringBuffer();
	private static int count = 0;
	public void run()
	{
		for(int a=0;a<20;a++)
		{
			log.append(currentThread().getName()+":"+a+" ");
			if(++count%10==0)
				log.append("\n");
		}
	}
	public static void main(String[] args)throws Exception
	{
		Machine machine1 = new Machine();
		Machine machine2 = new Machine();
		machine1.setName("m1");
		machine2.setName("m2");
		Thread main = Thread.currentThread();
		System.out.println("default priority of main:"+main.getPriority());
		System.out.println("default priority of m1:"+machine1.getPriority());
		System.out.println("default priority of m2:"+machine2.getPriority());
		machine2.setPriority(Thread.MAX_PRIORITY);
		machine1.setPriority(Thread.MIN_PRIORITY);
		machine1.start();
		machine2.start();
		Thread.sleep(2000);
//		while(machine1.isAlive()||machine2.isAlive())
//		{
//			Thread.sleep(500);
//		}
		System.out.println(log);
	}
}

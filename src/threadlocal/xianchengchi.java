package threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class xianchengchi {
	public static void main(String[]args)
	{
		int bb=0;
		ExecutorService exe=Executors.newFixedThreadPool(3);
		for(int i=1;i<10;i++)
		{
			final int a=i;
		
			exe.execute(new Runnable()
					{
		      		public void run()
		      		{for(int j=1;j<=10;j++)
		      		{
		      			System.out.println(Thread.currentThread().getName()+"第"+a+"个任务的"+"第"+j+"次循环");
		      		}
		      		}
					});
		}
		exe.shutdown();
		}

}

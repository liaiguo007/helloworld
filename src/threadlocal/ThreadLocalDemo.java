package threadlocal;

import java.util.Random;

public class ThreadLocalDemo implements Runnable{
	private final static ThreadLocal<Student> studentLocal = new ThreadLocal();	
	public static void main(String []args) {
		ThreadLocalDemo r = new ThreadLocalDemo();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		accessStudent();
	}
	private void accessStudent() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "is the current thread name!");
		Random random = new Random();
		int age = random.nextInt(100);
		Student student = getStudent();
		student.setAge(age);
		System.out.println( Thread.currentThread().getName() + "first student age is " + student.getAge());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( Thread.currentThread().getName() + "second student age is " + student.getAge());
	}	
	public Student getStudent() {
		Student student = studentLocal.get();
		if(student == null) {
			student = new Student();
			studentLocal.set(student);
		}
		
		return student;
	}

}

package threadlocal;

//3.使用工厂类Executors的静态方法newFixedThreadPool()方法创建线程池，返回ExecutorService接口的实现类对象，然后调用submit()方法提交线程任务

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
* @Author 笑笑
* @Date 19:00 2018/05/23
*/
public class CallableDemo {

  public static void main(String[] args) throws Exception{
      //参数表示此线程池里有多少可用的线程数量
      ExecutorService es = Executors.newFixedThreadPool(3);
      //提交线程任务,返回一个Future接口,参数为Callable实现类对象
      Future<String> future = es.submit(new MyThreadClass());
      //获取返回值
      String s = future.get();
      System.out.println(s);

  }

}

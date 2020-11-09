package threadlocal;

import java.util.concurrent.Callable;
/**
 * @Author 笑笑
 * @Date 18:37 2018/05/23
 */
public class MyThreadClass implements Callable<String>{

    //V call()  由于该方法的返回值是个泛型V，所以具体的返回类型可以自己定义，下面返回值设置为了String，
    @Override
    public String call() throws Exception {

        return "笑笑";
    }
}

package Imutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import read.write.lock.lgx.WriterThread;

/** * 并发读写List,会出异常 * Exception in thread 
 * "ReaderThread" java.util.NoSuchElementException * 
 * Exception in thread "ReaderThread" java.util.ConcurrentModificationException
 *  
 *  * */
public class ListTest {
    public static void main(String[] args) {
    	List<Integer> arraylist = new ArrayList();
        List<Integer> list= Collections.synchronizedList(arraylist);
        new WriteThread(list).start();
        new ReaderThread(list).start();
    }
}
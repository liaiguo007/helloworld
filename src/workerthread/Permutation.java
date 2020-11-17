package workerthread;

public class Permutation {
	
	public void permutation(String[]ss,int i) {
		
		if(ss==null || i > ss.length)
			return ;
		if(i == ss.length) {
			for(int j =0;j<ss.length;j++) {
			System.out.println(ss[j]);
			}
		}else {
		for(int j=i;j<ss.length;j++) {
			String temp = ss[j];
			ss[j] = ss[i];
			ss[i] = temp;
			permutation(ss,i+1);
			temp = ss[j];
			ss[j] = ss[i];
			ss[i] = temp;
		}
	}
  }
	
	public static void main(String []args) {
		String []ss = {"a","b","c"};
		Permutation permutation = new Permutation();
		permutation.permutation(ss,0);
	}
	
}

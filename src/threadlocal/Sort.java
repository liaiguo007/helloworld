package threadlocal;

public class Sort {
	public int[] insertSort(int []a) {
		for(int i =1;i<a.length;i++) {
			for(int j = i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}	
	
	public int[] selectSort(int []a){
		for(int i =0;i<a.length;i++) {
			for(int j = i + 1;j<a.length;j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;
	}
	
	
}

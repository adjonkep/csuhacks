package algo;

import java.util.Arrays;

public class Misc {

	public static void main(String[] args) {
		Misc m = new Misc();
		int[] a = { 8, 7, 6, 5, 4, 3, 2, 1 };
		//System.out.println(Arrays.toString(m.bsort(a)));
		System.out.println(m.mo2(22));
		System.out.println(234%100);
	}

	public int[] bsort(int a[]) {

		for (int j = a.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (a[i] > a[i + 1]) {
					int tmp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = tmp;
				}
			}
		}
		return a;
	}
	
	public int no2(int n){
		int count=0;
		for(int i=0; i<=n; i++){
			if(i/10==2){
				count++;
				if(i%10==2){
					count++;
				}
			}else{
				if(i%10==2)
					count++;
			}
		}
		return count;
	}
	
	public int noDigits(int n){
		return (int)Math.floor(Math.log10(n)) + 1;
	}
	
	public int mo2(int n){
		int count=0;
		
		return count;
		
	}
}

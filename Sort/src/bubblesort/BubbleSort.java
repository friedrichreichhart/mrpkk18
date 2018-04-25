package bubblesort;

public class BubbleSort {
	
	public static void main(String[] args) {
		new BubbleSort();
	}
	
	public BubbleSort() {
		//
		int[] zahlen = {3,6,1,3,2,9,7,8};
		//
		for (int n = zahlen.length; n>1; n--) {
			for (int i=0; i<n-1; i++){
				if (zahlen[i] > zahlen[i+1]) {
					int temp = zahlen[i];
					zahlen[i] = zahlen[i+1];
					zahlen[i+1] = temp;
				}
					
			}
		}
		//
		for (int i : zahlen)
			System.out.println(i);
	}

}

public class Selection {
	public static void main(String[] args) {
		int[] test = {3,1,6,7,1,2};
		test = sort(test);
		print(test);
		isSorted(test);
		System.out.println(isSorted(test));
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i+1]){
				return false;
			}
		}

		return true;
	}

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				print(a);
				System.out.println();
			}
			
		}
		return a;
	}
}
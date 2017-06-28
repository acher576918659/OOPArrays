package tw.aaa.myproject.OOPArray;

public class NumberSort {
	int[] data = { 5, 12, 7, 26, 3 };

	public void sort() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				int temp = 0;
				if (data[j] > data[i]) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
	}

	public void print() {
		for (int k = 0; k < data.length; k++) {
			System.out.printf("data[%d]=%d\n", k, data[k]);
		}
	}

	public static void main(String[] args) {
		NumberSort a = new NumberSort();
		a.sort();
		a.print();
	}

}

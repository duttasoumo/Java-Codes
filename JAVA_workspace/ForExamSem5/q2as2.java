import java.io.*;

class q2as2 {
	public static void main(String args[]) throws IOException {
		int i, flag, d1, d2, d3, j, k, l, m;
		int a[] = new int[9];
		for (i = 123; i <= 333; i++) {
			j = 0;
			d1 = i;
			d2 = 2 * i;
			d3 = 3 * i;
			while (d1 != 0) {
				a[j++] = d1 % 10;
				d1 = d1 / 10;
			}
			while (d2 != 0) {
				a[j++] = d2 % 10;
				d2 = d2 / 10;
			}
			while (d3 != 0) {
				a[j++] = d3 % 10;
				d3 = d3 / 10;
			}
			flag = 1;
			for (k = 0; k < 9; k++) {
				for (l = 0; l < 9 - k-1; l++) {
					if (a[l] > a[l + 1]) {
						m = a[l];
						a[l] = a[l + 1];
						a[l + 1] = m;
					}
				}
			}
			flag = 1;
			for (k = 0; k <= 8; k++) {
				if (a[k] != (k + 1)) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}
}
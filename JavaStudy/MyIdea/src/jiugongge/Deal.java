package jiugongge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Deal {
	int[][] a = new int[9][9];

	public void readFile() throws IOException {
		BufferedReader re = new BufferedReader(new FileReader(new File("d:" + File.separator + "tem.txt")));
		char[] c = new char[9];
		for (int i = 0; i <= 8; i++) {
			String str = re.readLine();
			c = str.toCharArray();
			for (int j = 0; j <= 8; j++) {
				a[i][j] = c[j] - 48;
			}
		}
		re.close();
	}

	public void print(int a[][]) {
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public Boolean isOk(int a[]) {
		Set<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i <= 8; i++) {
			tree.add(a[i]);
		}
		if (!tree.contains(0) && tree.size() == 9) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean arrays() {
		int b1[] = new int[9];
		int b2[] = new int[9];
		int b3[] = new int[9];
		int b4[] = new int[9];
		int b5[] = new int[9];
		int b6[] = new int[9];
		int b7[] = new int[9];
		int b8[] = new int[9];
		int b9[] = new int[9];
		int c1[] = new int[9];
		int c2[] = new int[9];
		int c3[] = new int[9];
		int c4[] = new int[9];
		int c5[] = new int[9];
		int c6[] = new int[9];
		int c7[] = new int[9];
		int c8[] = new int[9];
		int c9[] = new int[9];
		int d1[] = new int[9];
		int d2[] = new int[9];
		int d3[] = new int[9];
		int d4[] = new int[9];
		int d5[] = new int[9];
		int d6[] = new int[9];
		int d7[] = new int[9];
		int d8[] = new int[9];
		int d9[] = new int[9];
		for (int i = 0; i <= 8; i++) {
			b1[i] = a[0][i];
			b2[i] = a[1][i];
			b3[i] = a[2][i];
			b4[i] = a[3][i];
			b5[i] = a[4][i];
			b6[i] = a[5][i];
			b7[i] = a[6][i];
			b8[i] = a[7][i];
			b9[i] = a[8][i];
			c1[i] = a[i][0];
			c2[i] = a[i][1];
			c3[i] = a[i][2];
			c4[i] = a[i][3];
			c5[i] = a[i][4];
			c6[i] = a[i][5];
			c7[i] = a[i][6];
			c8[i] = a[i][7];
			c9[i] = a[i][8];
		}
		for (int i = 0; i <= 2; i++) {
			d1[i] = a[0][i];
			d1[i + 3] = a[1][i];
			d1[i + 6] = a[2][i];
			d4[i] = a[3][i];
			d4[i + 3] = a[4][i];
			d4[i + 6] = a[5][i];
			d7[i] = a[6][i];
			d7[i + 3] = a[7][i];
			d7[i + 6] = a[8][i];
		}
		for (int i = 0; i <= 2; i++) {
			d2[i] = a[0][i + 3];
			d2[i + 3] = a[1][i + 3];
			d2[i + 6] = a[2][i + 3];
			d5[i] = a[3][i + 3];
			d5[i + 3] = a[4][i + 3];
			d5[i + 6] = a[5][i + 3];
			d8[i] = a[6][i + 3];
			d8[i + 3] = a[7][i + 3];
			d8[i + 6] = a[8][i + 3];
		}
		for (int i = 0; i <= 2; i++) {
			d3[i] = a[0][i + 6];
			d3[i + 3] = a[1][i + 6];
			d3[i + 6] = a[2][i + 6];
			d6[i] = a[3][i + 6];
			d6[i + 3] = a[4][i + 6];
			d6[i + 6] = a[5][i + 6];
			d9[i] = a[6][i + 6];
			d9[i + 3] = a[7][i + 6];
			d9[i + 6] = a[8][i + 6];
		}
		Boolean i1 = isOk(b1) && isOk(b2) && isOk(b3) && isOk(b4) && isOk(b5) && isOk(b6) && isOk(b7) && isOk(b8)
				&& isOk(b9);
		Boolean i2 = isOk(c1) && isOk(c2) && isOk(c3) && isOk(c4) && isOk(c5) && isOk(c6) && isOk(c7) && isOk(c8)
				&& isOk(c9);
		Boolean i3 = isOk(d1) && isOk(d2) && isOk(d3) && isOk(d4) && isOk(d5) && isOk(d6) && isOk(d7) && isOk(d8)
				&& isOk(d9);
		if (i1 && i2 && i3) {
			return true;
		} else {
			return false;
		}
	}

	public void deal() {
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if (a[i][j] == 0&&a[i][j]<=9) {
					
					for(int x=0;x<=8;x++){
						if(!arrays()){
						a[i][j]++;
						}
					}
				}
				if (arrays()) {
					print(a);
				}
			}
		}
	}

}

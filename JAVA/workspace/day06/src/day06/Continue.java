package day06;

public class Continue {
	public static void main(String[] args) {
		
		int[][] arrData = {
				{10, 20, 30},
				{40, 50, 60}
		};
		
		// continue �� ���
		for (int i = 1; i <= 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
		
		// continue �� ���
		for (int i = 1; i<= 10; i++) {
			if (i ==4) {}
			else {
				System.out.println(i);
			}
		}
		
		// .length �� ���
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}

	}
}

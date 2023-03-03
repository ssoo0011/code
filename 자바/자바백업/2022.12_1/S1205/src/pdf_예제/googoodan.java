package pdf_¿¹Á¦;

public class googoodan {

	public static void main(String[] args) {
		
		int [][]goo = new int[9][9];

		
		for (int i = 0; i < goo.length ; i++) {
			System.out.println();
			System.out.println("goo[ " + i +"]"  );
		
			for (int j = 0; j < goo.length ; j++) {
				goo[i][j] = (i+1)*(j+1);
				System.out.print((i+1) * (j+1) + "\t");
		
				
			}
		}

	}

}

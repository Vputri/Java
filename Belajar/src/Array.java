public class Array {
    public static void main(String[] args) {
    	int[][] arrx;	// Cara 1 Array 2 Dimensi
		arrx = new int[3][3];
		arrx[0][0] = 1;
		arrx[0][1] = 2;
		arrx[0][2] = 3;
		arrx[1][0] = 4;
		arrx[1][1] = 5;
		arrx[1][2] = 6;
		arrx[2][0] = 7;
		arrx[2][1] = 8;
		arrx[2][2] = 9;
		System.out.println("Nilaiarrx[0] : " + arrx[0][0]);
		System.out.println("Nilaiarrx[0] : " + arrx[0][1]);
		System.out.println("Nilaiarrx[0] : " + arrx[0][2]);
		System.out.println("Nilaiarrx[1] : " + arrx[1][0]);
		System.out.println("Nilaiarrx[1] : " + arrx[1][1]);
		System.out.println("Nilaiarrx[1] : " + arrx[1][2]);
		System.out.println("Nilaiarrx[2] : " + arrx[2][0]);
		System.out.println("Nilaiarrx[2] : " + arrx[2][1]);
		System.out.println("Nilaiarrx[2] : " + arrx[2][2]);
		int[][] arry = {{10,20,30},{40,50,60},{70,80,90}} ; // Cara 2 Array 2 Dimensidgnukuran 3 * 3 = 9
		System.out.println("Nilaiarry[0] : " + arry[0][0]);
		System.out.println("Nilaiarry[0] : " + arry[0][1]);
		System.out.println("Nilaiarry[0] : " + arry[0][2]);
		System.out.println("Nilaiarry[1] : " + arry[1][0]);
		System.out.println("Nilaiarry[1] : " + arry[1][1]);
		System.out.println("Nilaiarry[1] : " + arry[1][2]);
		System.out.println("Nilaiarry[2] : " + arry[2][0]);
		System.out.println("Nilaiarry[2] : " + arry[2][1]);
		System.out.println("Nilaiarry[2] : " + arry[2][2]);
		}
	}
    
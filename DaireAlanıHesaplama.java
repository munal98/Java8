import java.util.Scanner;

public class DaireAlanıHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Yarı çap");
		int yarıçap=sc.nextInt();
		
		System.out.println("Daire Alanı: " + daireAlanıHesapla(yarıçap));
	}

	public static double daireAlanıHesapla(int yarıçap) {
		
		return 3.14 * yarıçap * yarıçap;
	}

}

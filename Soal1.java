import java.util.Scanner;

public class Soal1{
	public static void main(String[] args) {
	
		int bilangan;
		int hasil;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Masukan bilangannya : ");
		bilangan = userInput.nextInt();
		
		hasil = bilangan * bilangan;
		System.out.println("Hasil bilangan dari kuadrat dari" + bilangan + "yaitu : " + hasil);
	}
}
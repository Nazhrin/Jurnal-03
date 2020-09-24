import java.util.Scanner;

public class Soal3{
	public static void main(String[] args) {
		
		int nilaipraktikum,nilaiasesmen1,nilaiasesmen2;
		double Jumlahnilai;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Masukan Nilai Praktikum : ");
		nilaipraktikum =  userInput.nextInt();
		System.out.print("Masukan Nilai Asesmen1 : ");
		nilaiasesmen1 =  userInput.nextInt();
		System.out.print("Masukan Nilia Asesmen2 : ");
		nilaiasesmen2 =  userInput.nextInt();
		
		Jumlahnilai =(0.25 * nilaipraktikum) + (0.35 * nilaiasesmen1) + (0.40 * nilaiasesmen2);
		
		System.out.println("Nilai akhirnya adalah :" + Jumlahnilai );
	}
}	
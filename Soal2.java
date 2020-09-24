import java.util.Scanner;

public class Soal2{
	public static void main(String[] args) {
		
		String matakuliah;
		int jumlahjam;
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Masukan Mata Kuliah : ");
		matakuliah = userInput.nextLine();
		System.out.print("Masukan Jumlah Jam : ");
		jumlahjam = userInput.nextInt();

	
		System.out.println("Aku suka kuliah" + matakuliah);
		System.out.println("Kuliah" + jumlahjam + "jam per minggu rasanya kurang");
		System.out.println("Tambahin dong jadi" + 2 * jumlahjam + "jam per minggu;)");
	}
}
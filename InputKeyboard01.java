import java.util.Scanner;  // Import the Scanner class

public class InputKeyboard01 {
    public static void main(String [] args){
        //deklarasi variable atau objek
        Scanner input = new Scanner(System.in); //membuat objek (Scanner = nama kelas input = nama objek)
        String nama;

        //input --> begin
        System.out.print("Tulis nama : ");

        //contoh method dari objek inputKeyboard
        //nextLine() untuk membaca inputan dari keyboard tipe data String
        //nextLine untuk menerima inputan
        nama = input.nextLine();
        //input --> end

        //output
        System.out.println("Nama adalah " + nama);
    }
}

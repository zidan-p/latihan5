
package latihanPBO;
import java.util.Scanner;   //import Scanner;

public class latihan5 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);   //membuat Scanner baru
        int nilai;  //mendeklarasikan variabel
        System.out.println("masukan nilai akhir PBO :"); //menmapilkan kalimat
        nilai = masukan.nextInt();  //memberi nilai varibel menggunakan input dari keyboard
        if(nilai < 70){ //kodisi pertama dari pernyataana, jika bernilai benar maka kode di dalamnya akan di jalankan
            System.out.println("Siswa tidak lulus");    // menampilkan kalimat
        }
        if(nilai > 70){ //kondisi kedua dari pernyataan, jika bernialai benar maka kode program di dalamnya akan dijalankan
            System.out.println("Siswa lulus"); // menampilkan kalimat
        }
    }
    
}

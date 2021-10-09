import java.util.Scanner;

public class Tugas02 {
    //Deret Faktorial
    public void deretFaktorial(Scanner scanner){
        //Untuk Memasukkan Inputan
        System.out.print("Masukkan Nilai Faktorial Yang Anda Cari : ");
        int faktorial = scanner.nextInt();

        int hasilFaktorial = 1;
        //Melakukan Looping
        for (int i = faktorial; i > 0; i--) {
            hasilFaktorial*=i;
            System.out.print(i);

            //Looping Tanda X
            if (i != 1) {
                System.out.print(" x ");
            }
        }
        //Memberikan tanda " = " Diakhir
        System.out.println(" = "+hasilFaktorial);
    }
    //Deret Fibonacci
    public void deretFibonacci(Scanner scanner){
        //Variabel dan Tipe data Yang Digunakan
        int jmlData, nilaiAwal, nilaiSkrg, nilaiAkhir;

        //Untuk Memasukkan Jumlah Data
        System.out.print("Masukan Banyak Data Yang Ingin Ditampilkan : ");
        jmlData = scanner.nextInt();
        //Untuk Inisialisasi
        nilaiAwal = 1;
        nilaiSkrg = 1;
        nilaiAkhir = 1;
        //Melakukan Looping
        for (int i = 1; i <= jmlData; i++) {
            System.out.print(nilaiSkrg + "  ");
            nilaiAkhir = nilaiAwal + nilaiSkrg;
            nilaiAwal = nilaiSkrg;
            nilaiSkrg = nilaiAkhir;

            //Notifikasi Jika Data yang Keluar Lebih Dari 500
            if(nilaiAkhir>500){
                System.out.println("\n==== Nilai Lebih dari 500 ====");
            }
        }
    }
}

class Main2{
    //Untuk Menampilkan
    public static void main(String[] args) {
        Tugas02 tugas02 = new Tugas02();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== HITUNG DERET FAKTORIAL ===");
        tugas02.deretFaktorial(scanner);
        System.out.println("\n\n== DERET FIBONACCI ===");
        tugas02.deretFibonacci(scanner);
    }
}

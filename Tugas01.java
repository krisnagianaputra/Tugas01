import java.util.Scanner;

class Tugas01 {
    //Piramida
    public void piramida(int value){
        //Menggunakan If Else Untuk Menentukan Bilangan Ganjil/Genap
        //Sekaligus Memberi Inputan terhadap Tinggi Piramid yang diinginkan
        if (value%2 == 0){
            System.out.println("Tinggi Piramida Merupakan Bilangan Genap yaitu : "+value);
        }else{
            System.out.println("Tinggi Piramida Merupakan Bilangan Ganjil yaitu : "+value);
        }

        System.out.println("Hasil Piramida");
        //Melakukan Looping dengan menggunakan Nasted Loop
        for(int i=1; i<=value; i++) {
            for(int j=1; j<=value-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}

class Main1{
    //Untuk Menampilkan Piramid
    public static void main(String[] args) {
        Tugas01 tugas01 = new Tugas01();
        Scanner scanner = new Scanner(System.in);

        //Tempat Untuk Memasukkan Inputan
        System.out.print("Masukkan Tinggi Piramida : ");
        int value = scanner.nextInt();
        tugas01.piramida(value);
    }
}
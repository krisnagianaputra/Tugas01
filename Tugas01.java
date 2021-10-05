import java.util.Scanner;

class Tugas01 {
    public void piramida(int value){
        if (value%2 == 0){
            System.out.println("Mendefinisikan Tinggi Piramida Sebagai Bilangan Genap yaitu : "+value);
        }else{
            System.out.println("Mendefinisikan Tinggi Piramida Sebagai Bilangan Ganjil yaitu : "+value);
        }

        System.out.println("Output Piramida");
        for(int i=1; i<=value; i++) {
            for(int j=1; j<=value-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

class Main1{
    public static void main(String[] args) {
        Tugas01 tugas01 = new Tugas01();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida : ");
        int value = scanner.nextInt();
        tugas01.piramida(value);
    }
}

package latihan;

//Created By 21343050_Heri Ramadhan

public class AritmatikaDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        double x = 27.425;
        double y = 7.22;

        System.out.println("Variable Values...");
        System.out.println("i = " +i);
        System.out.println("j = " +j);
        System.out.println("x = " +x);
        System.out.println("y = " +y);

        //penjumlahan angka
        System.out.println("Adding...");
        System.out.println("i + j = " + (i + j));
        System.out.println("x + y = " + (x + y));

        //pengurangan angka
        System.out.println("Subtracting...");
        System.out.println("i - j = " + (i - j));
        System.out.println("x - y = " + (x - y));

        //perkalian angka
        System.out.println("Multiplying...");
        System.out.println("i * j = " + (i * j));
        System.out.println("x * y = " + (x * y));

        //pembagian angka
        System.out.println("Dividing...");
        System.out.println("i / j = + " + ((float)i / j));
        System.out.println("x / y = + " + x / y);

        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the reminder...");
        System.out.println("i % j = " + i % j);
        System.out.println("x % y = " + x % y);

        //tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println("j + y = " + j + y);
        System.out.println("i + x = " + i + x);
    }
}

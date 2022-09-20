package tugas;

//Created By 21343050_Heri Ramadhan

public class Tugas2 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 23;
        int val3 = 5;

        int status = (val1 > val2) ? (val1 > val3 ? val1 : val3) : (val2 > val3 ? val2 : val3);

        // if (val1 > val2) {
        //     if (val1 > val3) {
        //         System.out.println(val1);
        //     } else {
        //         System.out.println(val3);
        //     }
        // } else {
        //     if (val2 > val3) {
        //         System.out.println(val2);
        //     } else {
        //         System.out.println(val3);
        //     }
        // }

        System.out.println("number 1 = "+ val1);
        System.out.println("number 2 = "+ val2);
        System.out.println("number 3 = "+ val3);
        System.out.println("Nilai tertingginya adalah angka = " + status);

    }
}

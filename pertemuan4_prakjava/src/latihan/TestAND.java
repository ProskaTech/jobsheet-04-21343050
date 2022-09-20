package latihan;

//Created By 21343050_Heri Ramadhan

public class TestAND {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        boolean test = true;

        //demonstrasi &&
        test = (i > j) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demonstrasi &
        test = (i > j) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        
    }
}

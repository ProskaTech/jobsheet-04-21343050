package latihan;

//Created By 21343050_Heri Ramadhan

public class KondisiOperator {
    public static void main(String[] args) {
        String status = "";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";

        //print status
        System.out.println(status);
    }
}

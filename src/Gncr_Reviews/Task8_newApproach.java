package Gncr_Reviews;

public class Task8_newApproach {
    public static void main(String[] args) {
        increaseAndWriteWithExceptionHandling("IN 1491 COLUMBUS SAILED THE OCEANBLUE");
        int sayi = 1941;
        for (int i = 0; i < 10; i++) {   //10 defa
            increaseAndWrite("IN " + (sayi + i) + " COLUMBUS SAILED THE OCEANBLUE");
        }
    }

    private static void increaseAndWrite(String s3) {
        if (s3 == null) {
            System.out.println("Lütfen doğru bir değer giriniz!");
            return;
        }

        String sayi = s3.substring(3, 7);
        int birFazlasi = Integer.parseInt(sayi) + 1;
        String output = s3.substring(0, 3) + birFazlasi + s3.substring(7);
        System.out.println(output);
    }

    private static void increaseAndWriteWithExceptionHandling(String s3) {
        try{
            String sayi = s3.substring(3, 7);
            int birFazlasi = Integer.parseInt(sayi) + 1;
            String output = s3.substring(0, 3) + birFazlasi + s3.substring(7);
            System.out.println(output);
        }catch (NullPointerException | NumberFormatException ex){
            System.out.println("Lütfen doğru bir değer giriniz!");
        }
    }
}
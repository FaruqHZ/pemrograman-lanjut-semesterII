package Latihan5;

public class m {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menghitung jumlah angka-angka selisih yang ditampilkan pada class (i) di atas");
        int total = 0;
        for (var indeks = 0; indeks < dataArray.length - 1; indeks++) {
            int selisih;
            if (dataArray[indeks] > dataArray[indeks + 1]) {
                selisih = dataArray[indeks] - dataArray[indeks + 1];
            } else {
                selisih = dataArray[indeks + 1] - dataArray[indeks];
            }

            total += selisih;

        }

        System.out.println(total);

    }
}

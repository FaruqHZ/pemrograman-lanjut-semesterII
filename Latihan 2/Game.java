// 1. Buatlah sebuah class dengan nama class-nya bebas

    // mendeklarasikan class Game
class Game {
// 2. Buatlah class tersebut beberapa variabel yang sesuai beserta tipe datanya

    // variabel yang dimiliki class Game
    String name;
    String developer;
    String genre;
    double size;

// 3. Buatlah minimal 2 buah konstruktor, boleh tanpa parameter dan/atau dengan parameter
    Game() {
        // constructor tanpa parameter
    }

    Game(String gameName, String gameDev, String gameGenre, double gameSize) {
        // constructor dengan parameter
        name = gameName;
        developer = gameDev;
        genre = gameGenre;
        size = gameSize;
    }

// 4. Buatlah minimal 3 buah method yang menyatakan aksi/operasi yang dapat dilakukan oleh
//    class tersebut. Method yang dibuat terdiri dari method void dan method non-void

    // method void untuk nge cek, apakah smartphone android (bukan iphone, hehee) pengguna, bisa memainkan gamenya atau tidak
    void compatibel(int ramHP, int versiAndroid){
        if (ramHP >= 4 && versiAndroid >= 8){
            System.out.println("Smartphone Anda compatibel dengan game ini");
        } else {
            System.out.println("Smartphone Anda tidak compatibel dengan game ini, jangan dimainkan!");
        }
    }

    // method non-void untuk menghasilkan review atau informasi tentang gamenya
    String dataGame(String gameName) {
        String info = "Review Game " + gameName + "\n" +
                "Nama Game       = " + name + "\n" +
                "Developer Game  = " + developer + "\n" +
                "Genre Game      = " + genre + "\n" +
                "Ukuran Game     = " + size;
        return info;
    }


    // method untuk menghitung waktu download gamenya, berapa lama jika kecepatan jaringannya segini atau segitu
    double downloadTime(String gameName, double size, double networkSpeed) {
        double time = size / networkSpeed;
        System.out.println("Waktu yang dibutuhkan untuk download game " + name + ", jika kecepatan jaringan " + networkSpeed + " MBps adalah " + time + " second");
        return time;
    }
}




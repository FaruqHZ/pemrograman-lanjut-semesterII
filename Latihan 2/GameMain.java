// 5. Setelah deklarasi class selesai, buatlah class Main dari class tersebut. Lakukan instansiasi
//    objek dari class tersebut dan panggil konstruktor dan method yang sudah dideklarasikan
//    sebelumnya.

public class GameMain {
    public static void main(String[] args) {

        // menginstansiasi objek game1 dari class Game dan memberinya method atau constructor
        Game game1 = new Game("Mobile Legends: Bang Bang", "Moonton", "MOBA, Strategi", 164);

        System.out.println(game1.dataGame("Mobile Legends: Bang Bang"));
        game1.downloadTime("Mobile Legends: Bang Bang", 164, 2);
        game1.compatibel(3, 9);

        System.out.println();

        // menginstansiasi objek game2 dari class Game, dengan cara lain dan memberinya method atau constructor
        Game game2 = new Game();
        game2.name = "PUBG";
        game2.developer = "Tencent";
        game2.genre = "FPS, Survival";
        game2.size = 1230;

        System.out.println(game2.dataGame("PUBG"));
        game2.downloadTime("PUBG", 1230, 3);
        game2.compatibel(4, 8);
    }
}

// 6. Jelaskan program yang sudah anda buat dengan gaya bahasa anda sendiri!

/**
 * Jadi, ini adalah program untuk mengetahui review atau informasi dari game android yang ada atau yang termasuk ke dalam data,
 * dan program ini juga bisa memberitahukan apakah android pengguna mampu memainkan game tersebut atau tidak,
 * serta juga bisa memberitahukan kepada pengguna, berapa lama waktu yang dibutuhkan untuk mendownload game tersebut dengan
 * kecepatan jaringan smartphone pengguna yang akan menjadi tolak ukurnya dan juga tentunya size game atau ukuran game yang akan didownload
 */
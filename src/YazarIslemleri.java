public class YazarIslemleri {
    private static Yazar[] yazarlar;
    static {
        yazarlar = new Yazar[5];
        yazarlar[0] = new Yazar("Reşat Nuri", "Güntekin");
        yazarlar[1] = new Yazar("Necip Fazıl", "Kısakürek");
        yazarlar[2] = new Yazar("Yakup Kadri", "Karaosmanoğlu");
        yazarlar[3] = new Yazar("Halit Ziya", "Uşaklıgil");
        yazarlar[4] = new Yazar("Yahya Kemal", "Beyatlı");
    }
    public static Yazar[] getYazarlar() {
        return YazarIslemleri.yazarlar;
    }
}
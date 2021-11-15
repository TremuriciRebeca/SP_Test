public class Main {

    public static void main(String[] args) {
        GIF gif1 = new GIF(128, "Cat 1");
        GIF gif2 = new GIF(128, "Cat 2");
        GIF gif3 = new GIF(128, "Cat 3");

        Videoclip video1 = new Videoclip(10230214, "Tzanca Uraganu - Rup topurile [videoclip oficial] 2021");
        Videoclip video2 = new Videoclip(24654114, "Tzanca Uraganu - Buzele cu rosu inchis [oficial video] 2021");

        Melodie melodie1 = new Melodie(44787, "Gipsy Casual - Kelushka (Dj Rynno & Dj Bonne Remix) (Official Music Video)");
        Melodie melodie2 = new Melodie(44787, "Tzanca Uraganu - Viata exclusivista [videoclip oficial] 2021");
        Melodie melodie3 = new Melodie(44787, "Iuliana Beregoi - Ne iubim (Official Video)");

        Playlist playlist1 = new Playlist(100, "Manele mentolate 2021 - 2022");
        playlist1.addElement(video1);
        playlist1.addElement(melodie2);
        playlist1.addElement(melodie3);

        Playlist playlist2 = new Playlist(100, "Altele");
        playlist2.addElement(video2);
        playlist2.addElement(melodie1);
        playlist2.addElement(gif1);
        playlist2.addElement(gif2);
        playlist2.addElement(gif3);

        playlist1.addElement(playlist2);




        playlist1.startElement();
    }

}

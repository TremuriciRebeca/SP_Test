import static java.lang.Thread.sleep;

public class GIF extends ElementMedia {
    public GIF(long sizeKB, String title) {
        super(sizeKB, title);
    }

    @Override
    int timpDescarcare() {
        return 1;
    }

    @Override
    long totalSize() {
        return this.sizeKB;
    }

    public void startElement() {
        System.out.println("GIF " + this.title + " downloading..");
        try {
            sleep(this.timpDescarcare() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("GIF " + this.title + " started!");
    }
}

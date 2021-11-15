import static java.lang.Thread.sleep;

public class Videoclip extends ElementMedia  {
    public Videoclip(long sizeKB, String title) {
        super(sizeKB, title);
    }

    @Override
    int timpDescarcare() {
        return 5;
    }

    @Override
    long totalSize() {
        return this.sizeKB;
    }

    public void startElement() {
        System.out.println("Video " + this.title + " downloading..");
        try {
            sleep(this.timpDescarcare() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Video " + this.title + " started!");
    }
}

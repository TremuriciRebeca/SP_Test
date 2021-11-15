import static java.lang.Thread.sleep;

public abstract class ElementMedia {
    protected long sizeKB;
    protected String title;

    abstract int timpDescarcare();
    abstract long totalSize();

    protected ElementMedia(long sizeKB, String title) {
        this.sizeKB = sizeKB;
        this.title = title;
    }

    abstract void startElement();
}

import java.util.ArrayList;

public class Playlist extends ElementMedia  {
    private ArrayList<ElementMedia> elements;

    protected Playlist(long sizeKB, String title) {
        super(sizeKB, title);
        this.elements = new ArrayList<>();
    }

    @Override
    int timpDescarcare() {
        return 0;
    }

    @Override
    long totalSize() {
        return this.sizeKB;
    }

    public void addElement(ElementMedia element) {
        this.elements.add(element);
    }

    public void startElement() {
        System.out.println("Playlist " + this.title + " downloading..");
        for (int i = 0; i < this.elements.size(); i++) {
           this.elements.get(i).startElement();
        }
        System.out.println("Playlist " + this.title + " started!");
        System.out.println("Playlist " + this.title + " finished!");
    }
}

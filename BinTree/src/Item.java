
public class Item {
    public int element;
    public int index;
    public Item right;
    public Item left;

    public Item(int element) {
        this.element = element;
        this.index = 0;
        this.right = null;
        this.left = null;
    }
}

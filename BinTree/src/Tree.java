
public class Tree {
    public Item head;
    public int size;

    public Tree() {
        head = null;
        size = 0;
    }

    public void AddToTree(Item item) {
        if (head == null) {
            head = item;
            size++;
            head.index = size;
        } else {
            if ((item.element > head.element) && (head.right == null)) {
                head.right = item;
                size++;
                head.right.index = size;
            } else {
                if ((item.element < head.element) && (head.left == null)) {
                    head.left = item;
                    size++;
                    head.left.index = size;
                } else if (item.element > head.element)
                    AddToLeft(head.left, item);
                else if (item.element < head.element) {
                    AddToRight(head.right, item);
                }


            }
        }
    }

    public void AddToLeft(Item left, Item item) {
        if ((item.element > left.element) && (left.right == null)) {
            left.right = item;
            size++;
            left.right.index = size;
        } else if ((item.element < left.element) && (left.left == null)) {
            left.left = item;
            size++;
            left.left.index = size;
        } else if (item.element > left.element) AddToRight(left.right, item);
        else if (item.element < left.element) AddToLeft(left.left, item);
    }

    public void AddToRight(Item right, Item item) {
        if ((item.element > right.element) && (right.right == null)) {
            right.right = item;
            size++;
            right.right.index = size;
        } else if ((item.element < right.element) && (right.left == null)) {
            right.left = item;
            size++;
            right.left.index = size;
        } else if (item.element > right.element) {
            AddToRight(right.right, item);
        }
        else if (item.element < right.element) AddToLeft(right.left, item);
    }


    public int get(int index) {
        if (size > 0) {
            if (head.index == index)
                return head.element;
            if (head.left.index == index)
                return head.left.element;
            if (head.right.index == index)
                return head.right.element;
        }
        return 0;
    }
}
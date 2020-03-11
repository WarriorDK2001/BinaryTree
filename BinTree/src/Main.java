public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6));
        tree.AddToTree(new Item(4));
        tree.AddToTree(new Item(10));
        tree.AddToTree(new Item(12));
        tree.AddToTree(new Item(2));
        tree.AddToTree(new Item(7));
        tree.AddToTree(new Item(5));
        System.out.println(tree.get(1));
        System.out.println(tree.get(2));
        System.out.println(tree.get(3));

    }
}

public class Bag<Product> {
   
    private Node<Product> first;    // beginning of bag
    private int n;               // number of elements in bag

    private static class Node<Product> {
        private Product product;
        private Node<Product> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(Product Product) {
        Node<Product> oldfirst = first;
        first = new Node<Product>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
}
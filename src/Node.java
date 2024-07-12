public class Node {
    private int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next= null;
    }

    public Node() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

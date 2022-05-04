import static java.lang.System.*;

class reverse1 {
    node head = null, newnode = null;

    class node {
        int d;
        node next = null;

        public node(int data) {
            d = data;
            next = null;
        }
    }

    public void push(int d) {
        node newnode = new node(d);
        if (head == null)
            head = newnode;
        else
            newnode.next = head;
        head = newnode;

    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.d);
            temp = temp.next;
        }
    }

    public void reverse() {
        node current, prev, next1;
        current = head.next;
        prev = head;
        prev.next = null;
        while (current != null) {
            next1 = current.next;
            current.next = prev;
            prev = current;
            current = next1;
        }
        head = prev;
    }

    static {
        out.println("STATIC!!!");
    }

    public static void main(String[] args) {
        out.println("HERE!!!");
        reverse1 r = new reverse1();
        r.push(5);
        r.push(8);
        r.push(90);
        r.push(89);
        r.print();
        r.reverse();
        r.print();
    }
}
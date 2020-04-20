class QueueMain{
    public static void main(String[] args) {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        Node1 n1 = new Node1(10);
        Node1 n2 = new Node1(208);
        Node1 n3 = new Node1(300);
        Node1 n4 = new Node1(406);
        Node1 n5 = new Node1(540);
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
        obj.enqueue(n5);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}

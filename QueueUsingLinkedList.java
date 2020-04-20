public class QueueUsingLinkedList {
    Node1 front;
    Node1 rear;
    public QueueUsingLinkedList(){
        front = null;
        rear = null;
    }
    public boolean isEmpty(){
        return rear == null;
    }
    public void enqueue(Node1 newnode){
        if(isEmpty()){
            front = newnode;
            rear = newnode;
        }else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }else{
            front = front.next;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node1 temp = front;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

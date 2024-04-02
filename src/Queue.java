public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    // WRITE ENQUEUE METHOD HERE //
    public void enqueue(int value){
        //enqueue: means inser node at last index
        //create a node
        Node newNode= new Node(value);
        //if we have empty queue

        if(length==0){
            first=newNode;
            last=newNode;
        }else{
            newNode.next=last;
            last=newNode;

        }
        length++;

    }
    ///////////////////////////////



    public Node dequeue(){
        //dequeue: means remove elemnt from first side
        // if list have one element to remove
        //edge case: Queue is empty
        Node temp=first;
        if(length==0){ return null;}
        if(length==1){
            first=null;
            last=null;
        }else {
            //If the length of the queue is greater than 1, perform the following tasks:
            // a. Update the first pointer of the queue to point to the next node.
            // b. Set the next attribute of the temp node to null.
            first=first.next;
            temp.next=null;
        }

        length--;

        return temp;
    }

}


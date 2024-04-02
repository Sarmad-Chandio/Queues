public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(2);

        System.out.println("Before enqueue():");
        System.out.println("--------------");
        myQueue.printList();

        myQueue.enqueue(1);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.printList();

        System.out.println("****Dequeu****");

        Queue queueDequeu = new Queue(2);
        queueDequeu.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(queueDequeu.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(queueDequeu.dequeue().value);
        // (0) Items - Returns null
        System.out.println(queueDequeu.dequeue());

        /*
            EXPECTED OUTPUT:

            Before enqueue():
            --------------
            First: 2
            Last: 2
            Length: 1

            Queue:
            2


            After enqueue():
            -------------
            First: 2
            Last: 1
            Length: 2

            Queue:
            2
            1

        */

    }

}
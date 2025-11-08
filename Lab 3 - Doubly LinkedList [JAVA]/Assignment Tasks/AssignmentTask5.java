public class AssignmentTask5 {

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
        Node currNode = dh.next;
        Node prevNode = dh;
        int sumOdd = 0;

        while (currNode != dh) {
            if ((Integer) currNode.elem % 2 != 0) {
                sumOdd += (Integer) currNode.elem;
                prevNode.next = currNode.next;
                currNode = currNode.next;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
            }
            
        }

        if (sumOdd > 0) {
            Node newNode = new Node(sumOdd);
            prevNode.next = newNode;
            newNode.next = dh;
        }
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}

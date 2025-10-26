// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int multipleOf = 13%size;
        size = (size/(multipleOf)) + 1;
        Character[] resArray = new Character[size];


        if (head.next == null) {
            return null;
        }
        temp = head.next;
        int indexList = 1;
        int indexArray = size - 1;
        while (temp != null) {
            if (indexList%multipleOf == 0) {
                resArray[indexArray--] = (Character)temp.elem;
            }
            temp = temp.next;
            indexList++;
        }

        return LinkedList.createList(resArray);
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}

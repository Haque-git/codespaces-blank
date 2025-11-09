/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        int length = key.length();
        int sum = 0;
        int index = (length % 2 == 0) ? 0 : 1;

        while (index < length) {
            sum += (int) key.charAt(index);
            index += 2;
        }

        return sum % ht.length;
        
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        int index = hashFunction(key);
        FruitNode newNode = new FruitNode(key, value);

        if (ht[index] == null) {
            ht[index] = newNode;
        } else {
            FruitNode current = ht[index];
            FruitNode previous = null;


            while (current != null) {
                if (current.fruit[0].equals(key)) {
                    current.fruit[1] = value;
                    return;
                }
                previous = current;
                current = current.next;
            }

            if (value >= (Integer)ht[index].fruit[1]) {
                newNode.next = ht[index];
                ht[index] = newNode;
            } else {
                current = ht[index];
                previous = null;
                while (current != null && value < (Integer)current.fruit[1]) {
                    previous = current;
                    current = current.next;
                }
                previous.next = newNode;
                newNode.next = current;
            }
        }
    }

}

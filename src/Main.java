import java.util.Random;
public class Main{
    public static void main(String[]args){
        System.out.println("Test for HashTable");
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);
        Random random = new Random();
        for(int i = 0; i<10000; i++){
            int id = random.nextInt(10000);
            String name = "Name" + random.nextInt(10000);
            MyTestingClass key = new MyTestingClass(id, name);
            Student value = new Student("Student" + i, 18 + random.nextInt(10));
            table.put(key, value);
        }
        table.printBucketSizes();
        System.out.println("BST:");
        BST<Integer, String> tree = new BST<>();
        tree.put(50, "A");
        tree.put(30, "B");
        tree.put(70, "C");
        tree.put(20, "D");
        tree.put(40, "E");
        tree.put(60, "F");
        tree.put(80, "G");
        System.out.println("BST size: " + tree.size());
        System.out.println("Value for key 40: " + tree.get(40));
        System.out.println("In-order traversal: ");
        for(var elem: tree){
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
        tree.delete(70);
        System.out.println("\n after deleting key: 70");
        System.out.println("BST size: " + tree.size());
        for(var elem : tree){
            System.out.println("key is "+ elem.getKey() + " and value is " + elem.getValue());
        }
    }
}





public class Main{
    public static void main(String[]args){
        MyArrayList<Integer>arrayList=new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.addFirst(70);
        arrayList.addLast(25);
        arrayList.add(2,8);
        System.out.println("MyArrayList:");
        for(Integer i:arrayList){
            System.out.print(i+" ");
        }
        System.out.println("item in index 2: " + arrayList.get(2));
        System.out.println("first element: " + arrayList.getFirst());
        System.out.println("last element: " + arrayList.getLast());
        arrayList.remove(2);
        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println("Array after deleting some elements:");
        for(Integer item:arrayList){
            System.out.print(item+" ");
        }
        System.out.println(arrayList.indexOf(20));
        System.out.println(arrayList.lastIndexOf(20));
        System.out.println(arrayList.exists(30));
        arrayList.clear();
        System.out.println(arrayList.size());

        MyLinkedList<Integer>linkedList=new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.addLast(40);
        linkedList.add(2,15);
        System.out.println("MyLinkedList:");
        for(Integer item:linkedList){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.remove(2);
        linkedList.removeFirst();
        linkedList.removeLast();
        for(Integer item:linkedList){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println(linkedList.indexOf(20));
        System.out.println(linkedList.lastIndexOf(20));
        System.out.println(linkedList.exists(30));
        linkedList.clear();
        System.out.println(linkedList.size());

        MyStack<Integer>stack=new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("MyStack:");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        MyQueue<Integer>queue=new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("MyQueue:");
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());

        MyMinHeap<Integer>heap=new MyMinHeap<>();
        heap.insert(30);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        System.out.println("MyMinHeap:");
        System.out.println(heap.getMin());
        System.out.println(heap.extractMin());
        System.out.println(heap.extractMin());
        System.out.println(heap.extractMin());
        System.out.println(heap.size());
    }
}





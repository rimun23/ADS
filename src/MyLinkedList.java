import java.util.Iterator;
public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;
        MyNode(T data) {
            this.data = data;
        }
    }
    private MyNode head;
    private MyNode tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    private MyNode getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }
    @Override
    public void add(T item) {
        addLast(item);
    }
    @Override
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
            return;
        }
        if (index == size) {
            addLast(item);
            return;
        }
        MyNode current = getNode(index);
        MyNode previous = current.prev;
        MyNode newNode = new MyNode(item);
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = current;
        current.prev = newNode;
        size++;
    }
    @Override
    public T get(int index) {
        return getNode(index).data;
    }
    @Override
    public T getFirst() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }
    @Override
    public T getLast() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        return tail.data;
    }
    @Override
    public void set(int index, T item) {
        getNode(index).data = item;
    }
    @Override
    public void removeFirst() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev.next = null;
            head.prev = null;
        }
        size--;
    }
    @Override
    public void removeLast() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
        size--;
    }
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        MyNode current = getNode(index);
        MyNode previous = current.prev;
        MyNode nextNode = current.next;
        previous.next = nextNode;
        nextNode.prev = previous;
        current.next = null;
        current.prev = null;
        size--;
    }
    @Override
    public int indexOf(Object object) {
        MyNode current = head;
        int index = 0;
        while (current != null) {
            if ((object == null && current.data == null) ||
                    (object != null && object.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object object) {
        MyNode current = tail;
        int index = size - 1;
        while (current != null) {
            if ((object == null && current.data == null) ||
                    (object != null && object.equals(current.data))) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }
    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode current = head;
        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }
    @Override
    public void clear() {
        MyNode current = head;
        while (current != null) {
            MyNode nextNode = current.next;
            current.prev = null;
            current.next = null;
            current = nextNode;
        }
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void sort() {
        if (size < 2) {
            return;
        }
        for (MyNode i = head; i != null; i = i.next) {
            for (MyNode j = head; j.next != null; j = j.next) {
                Comparable first = (Comparable) j.data;
                Comparable second = (Comparable) j.next.data;

                if (first.compareTo(second) > 0) {
                    T temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new RuntimeException("No more elements");
                }
                T value = current.data;
                current = current.next;
                return value;
            }
        };
    }
}
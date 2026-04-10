public class MyMinHeap<T extends Comparable<T>>{
    private MyArrayList<T>list;
    public MyMinHeap(){
        list=new MyArrayList<>();
    }
    public void insert(T item){
        list.add(item);
        heapifyUp(list.size()-1);
    }
    public T getMin(){
        if(isEmpty()){
            throw new RuntimeException("Heap is empty");
        }
        return list.get(0);
    }
    public T extractMin(){
        if(isEmpty()){
            throw new RuntimeException("Heap is empty");
        }
        T min=list.get(0);
        T last=list.getLast();
        list.set(0,last);
        list.removeLast();
        if(!isEmpty()){
            heapifyDown(0);
        }
        return min;
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
    public int size(){
        return list.size();
    }
    public void clear(){
        list.clear();
    }
    private void heapifyUp(int index){
        while(index>0){
            int parent=(index-1)/2;
            if(list.get(index).compareTo(list.get(parent))<0){
                swap(index,parent);
                index=parent;
            }else{
                break;
            }
        }
    }
    private void heapifyDown(int index){
        while(true){
            int left=index*2+1;
            int right=index*2+2;
            int smallest=index;
            if(left<list.size()&&list.get(left).compareTo(list.get(smallest))<0){
                smallest=left;
            }
            if(right<list.size()&&list.get(right).compareTo(list.get(smallest))<0){
                smallest=right;
            }
            if(smallest!=index){
                swap(index,smallest);
                index=smallest;
            }else{
                break;
            }
        }
    }
    private void swap(int i,int j){
        T temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}

import java.util.Arrays;

public class CISStack {

    // Array property.
    private Integer[] array;
    // Size property.
    private int size;

    // Pointer property
    private int pointer;
    // Constructor.
    public CISStack(int a){
        this.array = new Integer[a];
        this.size = 0;
        this.pointer = -1;
    }
    // Push. This method pushes a value onto the top of the stack.
    public void push(int a){
        array[size] = a;
        size +=1;
        pointer +=1;
    }
    // Pop. This method pops a value from the top of the stack.
    public int pop(){
        Integer temp = null;
        if(size > 0) {
            temp = array[pointer];
            array[pointer] = null;
            size -=1;
            pointer -=1;
        }
        return temp;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if(size < 1){
            return true;
        }
        return false;
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }
    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}

    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + Arrays.toString(array) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }
}

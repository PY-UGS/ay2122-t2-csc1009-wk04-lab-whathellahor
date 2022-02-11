public class StackOfIntegers {
    
    private int[] elements;
    private int size = 0;
    
    // Default constructor
    public StackOfIntegers(){
        this.elements = new int[size];
    }

    // Constructor to define specific size
    public StackOfIntegers(int size) {
        this.elements = new int[size];
    }

    public boolean empty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        return elements[size-1];
    }
    
    public void push(int value){
        elements[size] = value;
        size += 1;
    }
    
    public int pop(){
        int popValue = elements[size-1];
        elements[size-1] = 0;
        size -= 1;
        return popValue;
    }

    public int getSize(){
        return size;
    }
}
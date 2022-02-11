public class TestStackOfIntegers{
    public static void main (String[] args){

        int size = 10;

        StackOfIntegers stack = new StackOfIntegers(size);
        
        for (int i = 0; i< size; i++){
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }   
}
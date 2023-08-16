public class Stack {
    private int top;
    private final int size;

    private int[] stack;

    public Stack(int size){
        this.top = -1;
        this.size = size;
        this.stack = new int[size];
    }
    public void push(int data){
        if(top == size -1){
            System.out.println("Overflow");
        }else{
            top += 1;
            stack[top] = data;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack não está populado");
        }else{
            top--;
            stack[top] = 0;
        }

    }
    public void show(){
        if(top == -1){
            System.out.println("Stack não populado");
        }else{
            for(int i= top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }



}

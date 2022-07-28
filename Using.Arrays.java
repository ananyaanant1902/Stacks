
public class Stacks {
    static final int MAX=10; //maximum size of stack
    int top;
    int[] arr=new int[MAX];

    Stacks(){
        this.top=-1;
    }
  
//push
    public  void push(int data){
        if(top>(MAX-1)){
            System.out.println("Stack is OverFlowing");
            return;
        }
        else{
            top++;
            arr[top]=data;
            System.out.println("Value Executed");
        }
    }
  
//pop
    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else {
            top--;
            int x = arr[top];
            return x;
        }

    }
  
//peek
    public  int peek(){
        if(top<0){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        else{
            return arr[top];
        }
    }

//isEmpty
    public  boolean isEmpty(){
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }

//isFull
    public  boolean isFull(){
        if(top>=(MAX)){
            return true;
        }
        else{
            return false;
        }
    }
  
//size
    public  int size(){
        return (top+1);
    }

    public static void main(String[] args) {
        Stacks s=new Stacks();
        System.out.println(s.isEmpty());
        s.push(12);
        s.push(15);
        s.push(16);
        System.out.println(s.size());
        s.push(18);
        s.push(19);
        s.push(20);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}

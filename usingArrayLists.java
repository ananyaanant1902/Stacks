class StacksUsingArrayList{
    ArrayList<Integer> stacks=new ArrayList<Integer>();

    public void push(int data){
        stacks.add(data);
    }
    public int pop(){
        int top=stacks.size();

            System.out.println("value removed");
            int removed=stacks.get(top-1);
            stacks.remove(top-1);
            return removed;
    }
    public int peek(){
       return stacks.get(stacks.size()-1);
    }
    public boolean isEmpty(){
        if(stacks.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return stacks.size();
    }
}

public class Stacks {

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        StacksUsingArrayList s=new StacksUsingArrayList();
        System.out.println(s.isEmpty());
        s.push(12);
        s.push(15);
        s.push(16);
        System.out.println(s.size());
      //  s.push(18);
        s.push(19);
        s.pop();
        s.push(20);
        System.out.println(s.peek());
       // System.out.println(s.isFull());
        s.pop();
       // System.out.println(s.isFull());
        System.out.println(s.peek());
        System.out.println(s.size());
     //   System.out.println(s.isFull());

    }

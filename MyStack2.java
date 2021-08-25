package Stacks;

class Stack{
    int [] stack = new int[5];
    int top = 0;
    public void push(int data){
        if(top == 5){
            System.out.println("Stack is full!");   //Overflow
        }
        else {
            stack[top] = data;
            top++;
        }
    }
    public void show(){

        for(int items : stack){
            System.out.print(items + " ");
        }
    }
    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");  // UNDERFLOW
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
            return data;

    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean  isEmpty() {
        return top <= 0;
    }
}
public class MyStack2 {
    public static void main(String[] args) {
        Stack nums = new Stack();
        System.out.println(nums.isEmpty());
        nums.push(15);
        nums.push(8);
        nums.push(10);
        nums.push((4));
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        nums.show();
        System.out.println();
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
    }
}

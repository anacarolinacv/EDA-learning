import java.util.Scanner;

public class Pilha{
    private int[] array;
    private int top;

    public Pilha(int size){
        this.array = new int[size];
        top = -1;
    }

    public void push(int element){
        if(!isFull()) {
            this.array[++this.top] = element;

        }
        else{
            System.out.println("full");
        }
    }

    public void peek(){
        if(isEmpty())
            System.out.println("empty");
        else{
            System.out.println(this.array[top]);
        }
    }

    public void pop(){
        if(isEmpty())
            System.out.println("empty");
        else
            top--;
    }

    public void print(){
        String result = "";
        if(isEmpty())
            result = "empty";
        else {
            for (int i = 0; i < top; i++) {
                result += this.array[i] + " ";
            }
            result += this.array[top];
        }
        System.out.println(result);
    }


    private boolean isFull(){
        return this.top == array.length-1;
    }

    private boolean isEmpty(){
        return this.top == -1;
    }

}

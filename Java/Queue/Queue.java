import java.util.Arrays;

public class Queue {
    private static int VAZIO = -1;


    private Integer[] array;
    private int head;
    private int tail;
    private int elements;


    public Queue(int size){

        if (size <= 0) return;
        this.array = new Integer[size];
        tail = VAZIO;
        head = VAZIO;
        elements = 0;

    }

    public void element (){
        System.out.println(array[head]);
    }

    public void add (int element){
        if (!isFull()){
            if(head == -1 && tail == -1) {
                head = (head+1) % array.length;
            }
            tail = (tail+1) % array.length;
            array[tail] = element;
            elements++;
        }
        else
            System.out.println("full");;
    }

    public void remove(){
        if(!isEmpty()){
            head = (head + 1) % array.length ;
            elements--;
        }
        else
            System.out.println("empty");
    }

    public void print(){
        if(isFull())
            System.out.println("full");
        else if (isEmpty())
            System.out.println("empty");
        else{

            String array = Arrays.toString(Arrays.copyOfRange(this.array, head, tail+1));
            array = array.substring(1, array.length()-1);
            System.out.println(array.replaceAll(",", " "));
        }

    }

    private boolean isFull(){
        return elements == array.length;
    }

    private boolean isEmpty(){
        return elements == 0;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Pilha pilha = new Pilha(size);

        String[] option;
        do {
            option = sc.nextLine().split(" ");
            switch (option[0]) {
                case "push":
                    pilha.push(Integer.parseInt(option[1]));
                    break;
                case "peek":
                    pilha.peek();
                    break;
                case "pop":
                    pilha.pop();
                    break;
                case "print":
                    pilha.print();
                    break;
            }
        }while(!"end".equals(option[0]));


    }
}








import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int tamFila = sc.nextInt();
        Queue fila = new Queue(tamFila);

        sc.nextLine();
        String[] option;
        do {
            option = sc.nextLine().split(" ");
            if("add".equals(option[0])) {
                fila.add(Integer.parseInt(option[1]));
            }
            else if("element".equals(option[0])){
                fila.element();
            }
            else if("remove".equals(option[0])){
                fila.remove();
            }
            else if("print".equals(option[0])){
                fila.print();
            }
        }
        while(!("end".equals(option)));
    }
}

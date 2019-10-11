public class BubbleSort {

    public static void bubbleSort(int [] array){

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length -1 ; j++){
                if (array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {5,4,3,2,1,0};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

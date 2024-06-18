package dataStructure;

public class Pilha {

    private int[] array;
    private int top;
    private int height;

    public Pilha(int height) {
        this.height = height;
        array = new int[height];
        top = -1;
    }

    public void push(int elemento) {
        if (top == height - 1) {
            System.out.println("A pilha está cheia");
            return;
        }
        array[++top] = elemento;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("A pilha está vazia.");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("A pilha está vazia.");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }


    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);


        pilha.push(60);

        System.out.println("Topo: " + pilha.peek());

        while (true){
            int Removido = pilha.pop();
            if (Removido == -1) break;
            System.out.println("Removido: " + Removido);
        }
    }
}

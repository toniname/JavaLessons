package java_core_grom.mateAkademi.treni.forsobes.Exercise2;

public class BreadthFirstSearch {
    private final int[] array;
    private final int size = 10;
    private int head;
    private int tail;
    private int count;

    public BreadthFirstSearch() {
        array = new int[size];
        tail = -1;
        count = 0;
        head = 0;

    }

    public void insert(int v) {  //insert graph heads
        if (tail == size - 1) {
            tail = -1;
        }
        array[++tail] = v;
        count++;

    }

    public int remove() {  //method for removing graph heads
        if (head == size) {
            head = 0;
        }
        count--;
        return array[head++];
    }

    public boolean isEmpty() { //puts the label empty
        return count == 0;
    }
}



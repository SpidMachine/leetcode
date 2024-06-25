public class ArrayList {
    private int[] arr;
    private int count;
    private int sizeOfArray;

    ArrayList () {
        arr = new int[1];
        count = 0;
        sizeOfArray = 1;
    }

    public int[] add(int num) {
        if (count == sizeOfArray) {
            growSize();
        }

        arr[count] = num;
        count++;

        return arr;
    }

    public int[] remove(int index) {
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[count - 1] = 0;
        count--;

        return arr;
    }

    private int growSize() {
        int[] temp = new int[sizeOfArray * 2];

        for (int i = 0; i < sizeOfArray; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        sizeOfArray *= 2;

        return sizeOfArray;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public int[] addIndex(int index, int num) {
        if (count == sizeOfArray) {
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = num;
        count++;

        return arr;
    }

    public int get(int index) {
        if (index < 0 || index > count) {
            return -1;
        }

        return arr[index];
    }
}

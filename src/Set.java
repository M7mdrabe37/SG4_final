public class Set {
    private int[] arr;
    final int maxLength = 5;
    private int lastIndex;

    public Set() {
        arr = new int[maxLength];
        lastIndex = 0;
        for (int i = 0; i < maxLength; i++) {
            arr[i] = 0;
        }
    }

    public void show() {
        System.out.print("[");
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.print("...]");
    }

    public boolean isMember(int num) {

        for (int i = 0; i < lastIndex; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean add(int num) {
        if (lastIndex == maxLength) {
            return false;
        }

        if (isMember(num)) {
            return false;
        }

        arr[lastIndex] = num;
        lastIndex += 1;
        return true;
    }

    public boolean isEmpty() {
        return lastIndex == 0;
    }

    public boolean isFull() {
        return lastIndex == maxLength;
    }

    public void remove(int num) {
        int index = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (num == arr[i]) {
                index = i;
            }
        }
        for (int i = index; i < lastIndex - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[lastIndex] = 0;
        lastIndex = lastIndex - 1;

    }
}
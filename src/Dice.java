public class Dice {
    int[] results;

    public Dice() {
        results = new int[6];
    }

    public int throwDice() {
        return (int) (Math.random() * 6);
    }

    public void throw1000() {
        for (int i = 0; i < 1000; i++) {
            int face = throwDice();
            results[face] = results[face] + 1;
        }
    }

    public void showResults() {
        for (int i = 0; i < results.length; i++) {
            System.out.println("face" + (i + 1) + ":" + results[i]);
        }
    }

    public int getMax() {
        int max = results[0];

        for (int i = 0; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
            }
        }
        return max;
    }

    public int countNum(int num) {
        int count = 0;

        for (int i = 0; i < results.length; i++) {
            if (results[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int[] maxFace() {
        int max = getMax();
        int maxcount = countNum(max);
        int[] maxFaces = new int[maxcount];
        int maxFacesLastIndex = 0;

        for (int i = 0; i < results.length; i++) {
            if (results[i] == max) {
                maxFaces[maxFacesLastIndex] = i + 1;
                maxFacesLastIndex++;
            }

        }
        return maxFaces;
    }


    public int getMost() {
        int First = 1;
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = First + (int) (Math.random() * 6);
        }
        int a = 0;
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;

                if (count > maxcount) {
                    maxcount = count;
                    a = arr[j];
                }
            }
        }
        return a;
    }
}
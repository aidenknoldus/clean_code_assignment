public class ArrayHandler {
    private int[] array;
    private int numIndexes;

    public ArrayHandler(int arr[], int n) {
        this.array = arr;
        this.numIndexes = n;
    }

    public int getLowestNumInArray() {
        int maxIndex = getMaxIndex();
        int lowestVal;

        if (isFirstElementOnly()) {
            return array[0];
        }

        lowestVal = this.array[0];
        for (int i = 1; i < maxIndex; i++) {
            int currentVal = this.array[i];

            if (currentVal < lowestVal) {
                lowestVal = currentVal;
            }
        }
        return lowestVal;
    }

    public int getHighestNumInArray() {
        int maxIndex = getMaxIndex();
        int highestVal;

        if (isFirstElementOnly()) {
            return array[0];
        }

        highestVal = this.array[0];
        for (int i = 1; i < maxIndex; i++) {
            int currentVal = this.array[i];

            if (currentVal > highestVal) {
                highestVal = currentVal;
            }
        }
        return highestVal;
    }

    public int getMaxIndex() {
        if (!isValidNumIndexes()) {
            return this.array.length;
        } else {
            return this.numIndexes;
        }
    }

    public boolean isValidNumIndexes() {
        return this.numIndexes <= this.array.length;
    }

    public boolean isFirstElementOnly() {
        return this.array.length == 1 && this.numIndexes >= 1;
    }
}

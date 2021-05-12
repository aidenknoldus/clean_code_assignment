public class main {
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int s = 6;
        ArrayHandler arrayHandler = new ArrayHandler(arr, s);
        try {
            System.out.printf("\nThe lowest value is %d", arrayHandler.getLowestNumInArray());
            System.out.printf("\nThe highest value is %d", arrayHandler.getHighestNumInArray());
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}

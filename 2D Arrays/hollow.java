public class hollow {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();

        }

    }
}

/*

1 2 3 

7 8 9 

 * 
 */
public class Main {
    public static void main(String[] args) {

        int[][] matrix3 = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        int[][] dup = new int[4][4];

        for (int i = 0; i < matrix3.length; i++)
        {
            for (int j = 0; j < matrix3[i].length; j++)
            {
                System.out.print( matrix3[i][j]  + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix3.length; i++)
        {
            for (int j = 0; j < matrix3[i].length; j++)
            {
                dup[i][j] = matrix3[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < dup.length; i++)
        {
            for (int j = 0; j < dup[i].length; j++)
            {
                System.out.print( dup[i][j]  + "\t");
            }
            System.out.println();
        }
    }
}
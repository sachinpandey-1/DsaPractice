package arraymediam;

public class SetMatrixZero {
  public static void main(String[] args) {
            int[][] matrix = {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            };
            setZeros(matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }

        public static void setZeros(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean col0 = false;

            //  Pehle column 0 ko check karo aur baki matrix ke flags mark karo


            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    col0 = true;
                }
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            //  Matrix ke andar wale hisse ko (1,1 se lekar m,n tak) zero set karo


            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Ab pehle row 0 ko zero set karo
            if (matrix[0][0] == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            //  Sabse aakhiri mein pehle column 0 ko zero set karo
            if (col0) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }


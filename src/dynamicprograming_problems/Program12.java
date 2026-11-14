package dynamicprograming_problems;

public class Program12 {
    final static int INF = 99999;
    final static int nV = 4;

    public static void main(String[] args) {
        int[][] graph = {{0,3,INF,5},{2,0,INF,4},{INF,1,0,INF},{INF,INF,2,0}};
        solve(graph);
    }

    private static void solve(int[][] graph) {
        int[][] matrix = new int[nV][nV];
        for(int i=0;i<nV;i++)
        {
            for(int j=0;j<nV;j++)
            {
                matrix[i][j] = graph[i][j];
            }
        }

        for(int row=0;row<nV;row++)
        {
            for(int i=0;i<nV;i++)
            {
                for(int j=0;j<nV;j++)
                {
                    if(matrix[i][j] > (matrix[i][row]+matrix[row][j]))
                    {
                        matrix[i][j]  = matrix[i][row]+matrix[row][j];
                    }
                }
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0;i<nV;i++)
        {
            for(int j=0;j<nV;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }

    }


}

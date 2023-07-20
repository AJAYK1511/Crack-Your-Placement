class Solution {
    public void rotate(int[][] matrix) {
        int a=matrix.length;
        //int arr[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=i;j<a;j++)
            {
                if(i!=j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
                //matrix[i][j]=matrix[j][i];
            }
        }
        for(int j=0;j<a;j++)
        {
           int low=0;
           int high=a-1;
           while(low<high)
           {
               int temp=matrix[j][low];
               matrix[j][low]=matrix[j][high];
               matrix[j][high]=temp;
               low++;
               high--;
           }
        }
        //System.out.print("Hello");
        //return arr;
    }
}
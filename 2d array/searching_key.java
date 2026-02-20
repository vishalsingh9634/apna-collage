public class searching_key {
    public static boolean search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==key){
                System.out.println("found element ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30},
                        {40,50,60},
                        {70,80,90}};
        int key=50;    
        search(matrix, key);            
    }
    
}
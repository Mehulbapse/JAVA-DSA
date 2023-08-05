package Recursion;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == word.charAt(0) && help(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean help(char[][] b,String word, int start ,int r,int c){
        if(word.length()<=start){
            return true;
        }

        if(r<0 ||c<0 || r>=b.length || c>=b[0].length || b[r][c]=='0' || b[r][c]!=word.charAt(start)){
            return false;
        }

        char tmp = b[r][c];
        b[r][c] = '0';

        if( help(b,word,start+1,r+1,c) ||
                help(b,word,start+1,r-1,c) ||
                help(b,word,start+1,r,c+1) ||
                help(b,word,start+1,r,c-1)
        ){
            return true;
        }

        b[r][c] = tmp;
        return false;

    }

    public static void main(String[] args) {
        char[][] array ={
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        WordSearch result = new WordSearch();
        System.out.println(result.exist(array,word));
    }
}

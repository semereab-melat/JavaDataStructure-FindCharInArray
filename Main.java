class Main {
  //Consider the program below. Complete the findChar2DArray method so that it finds the first instance of the searched character c2f, prints the location to screen and generates the expected output as detailed below.

public static void main(String[] args) {
    
  char [][]a = new char[][]{{'a','b','c'},{'d','d','d'},{'g','h','i'}};
    
    findChar2DArray(a,'b');
    findChar2DArray(a,'d');
    findChar2DArray(a,'z');
  }
  
public static boolean findChar2DArray(char[][] a, char c2f) {

        boolean found = false;
        for (int r = 0; r < a.length; r++) {

            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] == c2f) {
                    found = true;
                    System.out.println("Char: " + a[r][c] + " @ " + (r + ", " + c))                   
                    return found;
                }//if
                else {
                    System.out.println("Char: " + c2f + " not found!");
                    found = false;
                    return found;
                }
                }//for
            }//for
        return found;
    }//findChar2DArray()


/*Expected Output :

Char: b @ (0,1)
Char: d @ (1,0)
Char: z not found*/

}
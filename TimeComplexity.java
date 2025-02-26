/*
 * Reference:
 * Laaksonen, A. (2018). Competitive programmer's handbook. CSES. https://cses.fi/book/book.pdf
*/


public class TimeComplexity{
  public static void main(String[] args){

  /*
  * What is Time Complexity?
   *
   * Time complexity is an estimation of how much time the algorithm
  * will be use for input.
  *
  * It is denoted by O(...) where the dots will represent a function
  */

  // For example, one loop means O(n)
  int n = 5;
  for (int i = 0; i<=n; i++){
      // code
    }

  // Two loops means O(n^2)
  for (int i = 0; i<=n; i++){
    for(int j = 1; j<=n; j++){
      // code
    }
  }

  }
}

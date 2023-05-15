
public class TwoAime {

  public static void main(String[] args) {

    int[][] arrs0 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };
    int[][] arrs1 = new int[2][3];
    int[][] arrs2 = new int[2][];

    for (int i = 0; i < arrs2.length; i++) {
      arrs2[i] = new int[i + 1];
      for (int j = 0; j < arrs2[i].length; j++) {
        arrs2[i][j] = i + 1;
      }
    }
  }

}
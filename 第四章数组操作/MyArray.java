public class MyArray {

  // java中数组是多个相同数组的组合类似于TS中的元组
  public static void main(String[] args) {

    int[] arr = { 11, 99, 3, 445, 6, 7 }; // 方式1

    double arr0[] = { 99, 66, 74, 13.5, 4 };

    int[] arr1 = new int[arr0.length]; // 方式2

    double arr3[]; // 方式3
    arr3 = new double[5];

    String[] strs = { "he", "op", "你好" };

    for (int i = 0; i < arr.length; i++) {

      System.out.println(strs[i]);

      System.out.println(arr0[i]);

      System.out.println(arr[i]);

      System.out.println(arr1[i]);

      System.out.println(arr3[i]);

    }

  }
}
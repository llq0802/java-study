public class PropertiesDetail {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "llq";
    p1.speak();
    p1.calc(10);
    int returnRes = p1.getSum(1, 1);

  }
}

class Person {
  String name;
  int age;
  double height;

  public void speak() {
    System.out.println("wo shi yi ge hao ren");
  }

  public void calc(int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
      res += i;
    }
    System.out.println("res = " + res);

  }

  public int getSum(int num1, int num2) {
    return num1 + num2;

  }

}

class MyTool {

  public void printArr(int[][] arr) {

    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr[i].length; j++) {

        System.out.println(arr[i][j]);

      }

    }

  }

  public void hanoi(int n, String a, String b, String c) {
    if (n == 1) {
      System.out.println(a + "--->" + c);
    } else {
      hanoi(n - 1, a, c, b); // 第一步把n-1个模块 从塔1(a)移动到塔2(b)
      System.out.println(a + "--->" + c);
      hanoi(n - 1, b, a, c); // 第二步把n-1个模块 从塔2(b)移动到塔3(c)
    }
  }

}

// /**
//  * 方法重载
//  */
public class OverLoad {

  public static void main(String[] args) {
    MyTool myTool = new MyTool();
    int count = myTool.getNum(1, 2);
    System.out.println(count);

  }

}

class MyTool {

  public int getNum(int n1, int n2) {
    return n1 + n2;
  }

  /**
   * 可变参数本质是一个数组
   * 
   * @param int... nums
   * @return int
   */
  public int getNum2(int... nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      res += nums[i];
    }
    return res;
  }

}

class Person {

  String name;
  int age;
  double height = 1.80;

  /**
   * Person 的构造器
   * 不能写返回类型
   * 可实现重载
   * 构造器的名字必须跟类名一样
   */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void say() {
    System.out.println(this.height);
  }

}
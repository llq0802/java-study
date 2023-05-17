import java.util.Scanner;

public class SeqSeach {
  public static void main(String[] args) {

    String[] names = { "llq", "qwe", "asd", "zxc" };
    Scanner myScanner = new Scanner(System.in);
    int index = -1;
    String findName = myScanner.next();

    // String类型是 对象 比较的时候不能直接 == 而是用equals方法
    for (int i = 0; i < names.length; i++) {
      if (findName.equals(names[i])) {
        System.out.println("找到了" + index);
        index = i;
        break;
      }
    }

  }
}


import java.util.Scanner;

public class MySanner {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入名字");
    String name = myScanner.next();
    System.out.println("请输入年龄");
    int age = myScanner.nextInt();
    System.out.println(name + '\t' + age);

  }
}

public class AAA {
  public static void main(String[] args) {
    Client client = new Client();
    int[] arr = { 1, 2, 3 };
    int res1 = client.getNum2(arr);
    int res2 = client.getNum2(11, 22, 33);
    System.out.println(res1);
    System.out.println(res2);
  }
}

class Client {
  public int getNum() {
    return 2;
  }

  public int getNum2(int... nums) {
    // System.out.println(nums.length);
    return nums.length;
  }
}
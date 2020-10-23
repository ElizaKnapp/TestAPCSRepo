public class Demo {
  public static void main(String[] args) {
/* FIX AFTER
    int n = 5;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    printLoop(n);
*/
  int[] arr1 = {5};
  int[] arr2 = {6, 7};
  int[] arr3 = {5, 7, 8};
  int[] arr4 = {5, 2, 87, 3};
  int[] arr5 = {1, 2, 8, 3, 68};

  int[][] bigArr = new int[5][];
  bigArr[0] = arr1;
  bigArr[1] = arr2;
  bigArr[2] = arr3;
  bigArr[3] = arr4;
  bigArr[4] = arr5;

  System.out.println(arrayDeepToString(bigArr).replace("}, ","},\n "));

  }

  public static void printLoop(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print(i + 1);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    if (arr.length == 0) return "{}";
    String ans = "{";
    for (int i = 0; i < arr.length - 1;i++) {
      ans += Integer.toString(arr[i]) + ", ";
    }
    return ans + Integer.toString(arr[arr.length - 1]) + "}";
  }

  public static String arrayDeepToString(int[][] arr) {
    String ans = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      ans += arrToString(arr[i]) + ", ";
    }
    ans += arrToString(arr[arr.length - 1]) + "}";
    return ans;
  }

}

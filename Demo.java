public class Demo {
  public static void main(String[] args) {

    int n = 5;
    if (args.length != 0) n = Integer.parseInt(args[0]);
    printLoop(n);

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

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      arr[i] = new int[(int)(Math.random() * (cols + 1))];
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

}

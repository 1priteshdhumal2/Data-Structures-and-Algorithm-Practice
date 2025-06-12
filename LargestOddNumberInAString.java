public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String s = "5347";
        int stringLength = s.length();
    String largest = "";
    for (int i = 0; i <= stringLength; i++) {
      for (int j = i; j <= stringLength; j++) {
        String subStr = s.substring(i, j);
        System.out.println(subStr);
        if (!subStr.startsWith("0")
            && (subStr.endsWith("1")
                || subStr.endsWith("3")
                || subStr.endsWith("5")
                || subStr.endsWith("7")
                || subStr.endsWith("9"))) {
          if (largest.compareTo(subStr) < 0 && subStr.length() > largest.length()) {
            largest = subStr;
            System.out.println("largest" + largest);
            System.out.println(("5347").compareTo("7"));
          }
        }
      }
    }
    }
}

public class Main {
  public static void main(String[] args) {
    final var input = "0123456789";

    StringBuilder output = new StringBuilder();
    for (int i = input.toCharArray().length - 1; i >= 0; i--) {
      output.append(input.charAt(i));
    }

    System.out.println(output);
  }
}

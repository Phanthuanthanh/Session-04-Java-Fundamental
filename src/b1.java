import java.util.Scanner;

public class b1 {

    public static String formatAuthorName(String author) {
        author = author.trim().replaceAll("\\s+", " ");
        String[] words = author.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(
                    Character.toUpperCase(word.charAt(0))
                            + word.substring(1).toLowerCase()
                            + " "
            );
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine()
                .trim()
                .replaceAll("\\s+", " ")
                .toUpperCase();

        System.out.print("Nhập tên tác giả: ");
        String author = formatAuthorName(sc.nextLine());

        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine()
                .trim()
                .replaceAll("\\s+", " ");

        System.out.println("\nKết quả:");
        System.out.println(bookName + " - Tác giả: " + author);

        sc.close();
    }
}

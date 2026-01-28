import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b2 {

    public static void main(String[] args) {
        String description = "Sách lập trình Java cơ bản. Kệ: A12-03, dành cho sinh viên CNTT.";

        if (description.contains("Kệ:")) {
            Pattern pattern = Pattern.compile("Kệ:\\s*([^,\\n]+)");
            Matcher matcher = pattern.matcher(description);

            if (matcher.find()) {
                String shelfCode = matcher.group(1).trim();
                System.out.println("Mã vị trí kệ: " + shelfCode);
            }

            // Thay thế từ khóa
            String newDescription =
                    description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mô tả mới:");
            System.out.println(newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}

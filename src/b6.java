import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b6 {

    public static void main(String[] args) {

        String review =
                "Cuốn sách này nội dung khá xau và một số phần rất TE. "
                        + "Tuy nhiên tổng thể vẫn ổn và phù hợp cho sinh viên năm nhất.";

        String[] blacklist = {"xau", "te", "phan cam"};

        // Tạo regex blacklist
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuffer filtered = new StringBuffer();

        while (matcher.find()) {
            String badWord = matcher.group();
            String stars = "*".repeat(badWord.length());
            matcher.appendReplacement(filtered, stars);
        }
        matcher.appendTail(filtered);

        String result = filtered.toString();

        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex));
            sb.append("...");
            result = sb.toString();
        }

        System.out.println(result);
    }
}

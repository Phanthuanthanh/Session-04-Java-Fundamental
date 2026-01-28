public class b3 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        long startSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("BÁO CÁO MƯỢN SÁCH\n");
        sb.append("Ngày tạo: 24/01/2026\n");

        for (String t : transactions) {
            sb.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();

        System.out.println(sb.toString());
        long startStr = System.currentTimeMillis();

        String report = "BÁO CÁO MƯỢN SÁCH\n";
        report += "Ngày tạo: 24/01/2026\n";

        for (String t : transactions) {
            report += "Giao dịch: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();

        System.out.println(
                "Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB)
        );
        System.out.println(
                "Số thời gian thực thi đối với String: " + (endStr - startStr)
        );
    }
}

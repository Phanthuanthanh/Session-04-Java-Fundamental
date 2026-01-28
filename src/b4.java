public class b4 {

    public static void main(String[] args) {

        String cardCode = "TV202312345";

        if (!cardCode.matches("^[A-Z]{2}.*")) {
            System.out.println("Lỗi: Thiếu hoặc sai tiền tố (phải là 2 chữ cái viết hoa)");
        }
        else if (!cardCode.startsWith("TV")) {
            System.out.println("Lỗi: Thiếu tiền tố TV");
        }
        else if (!cardCode.matches("^TV\\d{4}.*")) {
            System.out.println("Lỗi: Năm không hợp lệ");
        }
        else if (!cardCode.matches("^TV\\d{4}\\d{5}$")) {
            System.out.println("Lỗi: Phải có đúng 5 chữ số ở cuối");
        }
        else {
            System.out.println("Mã thẻ hợp lệ");
        }
    }
}

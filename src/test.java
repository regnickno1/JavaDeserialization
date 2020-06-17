import java.io.*;

public class test {

    // Bien instance nay la nhin thay cho bat ky lop con nao.
    public String ten;

    // Bien hocphi la chi nhin thay cho lop Student.
    private double hocphi;

    // Bien ten duoc gan trong constructor.
    public test(String tenSV) {
        ten = tenSV;
    }

    // Bien hocphi duoc gan mot gia tri.
    public void setHocPhi(double hp) {
        hocphi = hp;
    }

    // Phuong thuc nay in chi tiet ve Student.
    public void inThongTin() {
        System.out.println("Ho va ten: " + ten);
        System.out.println("Hoc phi: " + hocphi);
    }

    public static void main(String[] args) {
        test sv1 = new test("Nguyen Van Doan");
        sv1.setHocPhi(4000);
        sv1.inThongTin();
    }
}
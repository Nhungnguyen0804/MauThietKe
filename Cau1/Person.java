package Cau1;
import java.util.ArrayList;
import java.util.List;

public class Person implements PersonComponent {
    private String ten;
    private String ngayThangNamSinh;

    private String gioiTinh;

    private boolean ketHon;


    public Person(String ten, String ngayThangNamSinh, String gioiTinh) {
        super();
        this.ten = ten;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.gioiTinh = gioiTinh;

        this.ketHon = false;
    }

    public void KetHon(Person other) {
        boolean check = true;
        setKetHon(check);
        other.setKetHon(check);
    }

    public void setKetHon(boolean ketHon) {
        this.ketHon = ketHon;
    }
    @Override
    public void showPersonInfo() {
        String res = "Person :[ Name: " + ten + ", ";
        res += "Ngay thang nam sinh: " + ngayThangNamSinh + ", ";
        res += "Gioi tinh: " + gioiTinh + ", ";
        res += "Tinh trang hon nhan: ";
        if (ketHon == false) {
            res += "chua ket hon";
        } else {
            res += "da ket hon";
        }
        res += "]";
        System.out.println(res);
    }

    public boolean getKetHon() {
        return ketHon;
    }



}

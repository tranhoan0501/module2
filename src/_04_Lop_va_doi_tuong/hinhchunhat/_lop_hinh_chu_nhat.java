package _04_Lop_va_doi_tuong.hinhchunhat;

public class _lop_hinh_chu_nhat {
    double width, height;
    public _lop_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}


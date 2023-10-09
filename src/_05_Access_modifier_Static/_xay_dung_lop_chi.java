package _05_Access_modifier_Static;

public class _xay_dung_lop_chi {
    private String name="john";
    private String classes="C02";
    public _xay_dung_lop_chi(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        _xay_dung_lop_chi student1 = new _xay_dung_lop_chi();
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        student1.setName("Tran Hoan");
        student1.setClasses("A0623I1");
        System.out.println("------------------------------------------");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}

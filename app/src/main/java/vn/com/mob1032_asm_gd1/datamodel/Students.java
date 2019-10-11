package vn.com.mob1032_asm_gd1.datamodel;

public class Students {
    int student_id;
    String student_name;
    String student_class_name;
    public Students(){};
    public Students(int student_id, String student_name, String student_class_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_class_name = student_class_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_class_name() {
        return student_class_name;
    }

    public void setStudent_class_name(String student_class_name) {
        this.student_class_name = student_class_name;
    }
}

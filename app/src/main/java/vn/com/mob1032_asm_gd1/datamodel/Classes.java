package vn.com.mob1032_asm_gd1.datamodel;

public class Classes {
    int order;
    String class_id;
    String class_name;

    public Classes(String class_id, String class_name) {
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}

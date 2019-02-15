package com.example.aya.juclinic;

public class Student {
   private String Stu_id;
   private String Stu_name;
   private   String Stu_Colleage;
   private String Stu_major;

    public Student(){}

    public Student(String stu_id, String stu_name, String stu_Colleage, String stu_major) {
        Stu_id = stu_id;
        Stu_name = stu_name;
        Stu_Colleage = stu_Colleage;
        Stu_major = stu_major;
    }

    public String  getStu_id() {
        return Stu_id;
    }

    public String getStu_name() {
        return Stu_name;
    }

    public String getStu_Colleage() {
        return Stu_Colleage;
    }

    public String getStu_major() {
        return Stu_major;
    }

    public void setStu_id(String stu_id) {
        Stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }

    public void setStu_Colleage(String stu_Colleage) {
        Stu_Colleage = stu_Colleage;
    }

    public void setStu_major(String stu_major) {
        Stu_major = stu_major;
    }
}

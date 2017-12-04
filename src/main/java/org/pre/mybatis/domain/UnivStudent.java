package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class UnivStudent implements Serializable {
    private int studno;
    private String name;
    private String id;
    private int grade;
    private String jumin;
    private String birthday;
    private String tel;
    private int height;
    private int weight;
    private int deptno1;
    private int deptno2;

    private int itemStart;
    private int itemSizePerPage;

    public UnivStudent() {
    }
    
    public UnivStudent(int studno, String name, String id, int grade, String jumin, String birthday, String tel, int height, int weight, int deptno1, int deptno2, int itemStart, int itemSizePerPage) {
        this.studno = studno;
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.jumin = jumin;
        this.birthday = birthday;
        this.tel = tel;
        this.height = height;
        this.weight = weight;
        this.deptno1 = deptno1;
        this.deptno2 = deptno2;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setStudno(int studno) {
        this.studno = studno;
    }

    public int getStudno() {
        return this.studno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public String getJumin() {
        return this.jumin;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setDeptno1(int deptno1) {
        this.deptno1 = deptno1;
    }

    public int getDeptno1() {
        return this.deptno1;
    }

    public void setDeptno2(int deptno2) {
        this.deptno2 = deptno2;
    }

    public int getDeptno2() {
        return this.deptno2;
    }

    public void setItemStart(int itemStart) {
        this.itemStart = itemStart;
    }

    public int getItemStart() {
        return this.itemStart;
    }

    public void setItemSizePerPage(int itemSizePerPage) {
        this.itemSizePerPage = itemSizePerPage;
    }

    public int getItemSizePerPage() {
        return this.itemSizePerPage;
    }
}
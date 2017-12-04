package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Professor implements Serializable {
    private int profno;
    private String name;
    private String id;
    private String position;
    private int pay;
    private String hiredate;
    private int bonus;
    private int deptno;
    private String email;

    private int itemStart;
    private int itemSizePerPage;

    public Professor() {
    }
    
    public Professor(int profno, String name, String id, String position, int pay, String hiredate, int bonus, int deptno, String email, int itemStart, int itemSizePerPage) {
        this.profno = profno;
        this.name = name;
        this.id = id;
        this.position = position;
        this.pay = pay;
        this.hiredate = hiredate;
        this.bonus = bonus;
        this.deptno = deptno;
        this.email = email;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setProfno(int profno) {
        this.profno = profno;
    }

    public int getProfno() {
        return this.profno;
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

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getPay() {
        return this.pay;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getHiredate() {
        return this.hiredate;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getDeptno() {
        return this.deptno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
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
package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class UnivDepartment implements Serializable {
    private int deptno;
    private String dname;
    private int part;

    private int itemStart;
    private int itemSizePerPage;

    public UnivDepartment() {
    }
    
    public UnivDepartment(int deptno, String dname, int part, int itemStart, int itemSizePerPage) {
        this.deptno = deptno;
        this.dname = dname;
        this.part = part;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getDeptno() {
        return this.deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return this.dname;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public int getPart() {
        return this.part;
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
package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Dept implements Serializable {
    private int deptno;
    private String dname;

    private int itemStart;
    private int itemSizePerPage;

    public Dept() {
    }
    
    public Dept(int deptno, String dname, int itemStart, int itemSizePerPage) {
        this.deptno = deptno;
        this.dname = dname;
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
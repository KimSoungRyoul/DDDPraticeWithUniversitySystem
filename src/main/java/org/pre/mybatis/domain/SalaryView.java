package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class SalaryView implements Serializable {
    private String ename;
    private int deptno;

    private int itemStart;
    private int itemSizePerPage;

    public SalaryView() {
    }
    
    public SalaryView(String ename, int deptno, int itemStart, int itemSizePerPage) {
        this.ename = ename;
        this.deptno = deptno;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return this.ename;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getDeptno() {
        return this.deptno;
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
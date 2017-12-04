package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class EmpDno4 implements Serializable {
    private int eno;
    private String ename;

    private int itemStart;
    private int itemSizePerPage;

    public EmpDno4() {
    }
    
    public EmpDno4(int eno, String ename, int itemStart, int itemSizePerPage) {
        this.eno = eno;
        this.ename = ename;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getEno() {
        return this.eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return this.ename;
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
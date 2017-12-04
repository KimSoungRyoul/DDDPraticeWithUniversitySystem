package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Emp implements Serializable {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private String hiredate;
    private int sal;
    private int comm;

    private int itemStart;
    private int itemSizePerPage;

    public Emp() {
    }
    
    public Emp(int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int itemStart, int itemSizePerPage) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getEmpno() {
        return this.empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return this.ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public int getMgr() {
        return this.mgr;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getHiredate() {
        return this.hiredate;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getSal() {
        return this.sal;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getComm() {
        return this.comm;
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
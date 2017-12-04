package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Orders implements Serializable {
    private int orderid;
    private int custid;
    private int bookid;
    private int saleprice;

    private int itemStart;
    private int itemSizePerPage;

    public Orders() {
    }
    
    public Orders(int orderid, int custid, int bookid, int saleprice, int itemStart, int itemSizePerPage) {
        this.orderid = orderid;
        this.custid = custid;
        this.bookid = bookid;
        this.saleprice = saleprice;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getOrderid() {
        return this.orderid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public int getCustid() {
        return this.custid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getBookid() {
        return this.bookid;
    }

    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }

    public int getSaleprice() {
        return this.saleprice;
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
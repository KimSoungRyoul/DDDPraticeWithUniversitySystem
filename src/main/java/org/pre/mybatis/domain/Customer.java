package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Customer implements Serializable {
    private int custid;
    private String name;
    private String address;

    private int itemStart;
    private int itemSizePerPage;

    public Customer() {
    }
    
    public Customer(int custid, String name, String address, int itemStart, int itemSizePerPage) {
        this.custid = custid;
        this.name = name;
        this.address = address;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public int getCustid() {
        return this.custid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
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
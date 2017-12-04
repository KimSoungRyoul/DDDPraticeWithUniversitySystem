package org.pre.mybatis.domain;

import java.io.Serializable;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public class Book implements Serializable {
    private int bookid;
    private String bookname;
    private String publisher;

    private int itemStart;
    private int itemSizePerPage;

    public Book() {
    }
    
    public Book(int bookid, String bookname, String publisher, int itemStart, int itemSizePerPage) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.publisher = publisher;
        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getBookid() {
        return this.bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return this.bookname;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
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
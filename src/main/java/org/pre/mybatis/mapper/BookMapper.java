package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Book;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface BookMapper {
    public List<Book> list(Book book);
    public Book select(Book book);
    public void insert(Book book);
    public void update(Book book);
    public void delete(Book book);
}

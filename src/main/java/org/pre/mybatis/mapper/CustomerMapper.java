package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Customer;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface CustomerMapper {
    public List<Customer> list(Customer customer);
    public Customer select(Customer customer);
    public void insert(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
}

package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Orders;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface OrdersMapper {
    public List<Orders> list(Orders orders);
    public Orders select(Orders orders);
    public void insert(Orders orders);
    public void update(Orders orders);
    public void delete(Orders orders);
}

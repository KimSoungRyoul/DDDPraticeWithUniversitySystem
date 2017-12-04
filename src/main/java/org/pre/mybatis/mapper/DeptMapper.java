package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Dept;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface DeptMapper {
    public List<Dept> list(Dept dept);
    public Dept select(Dept dept);
    public void insert(Dept dept);
    public void update(Dept dept);
    public void delete(Dept dept);
}

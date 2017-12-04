package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Emp;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface EmpMapper {
    public List<Emp> list(Emp emp);
    public Emp select(Emp emp);
    public void insert(Emp emp);
    public void update(Emp emp);
    public void delete(Emp emp);
}

package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.EmpDno4;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface EmpDno4Mapper {
    public List<EmpDno4> list(EmpDno4 empDno4);
    public EmpDno4 select(EmpDno4 empDno4);
    public void insert(EmpDno4 empDno4);
    public void update(EmpDno4 empDno4);
    public void delete(EmpDno4 empDno4);
}

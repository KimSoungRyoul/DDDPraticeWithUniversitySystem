package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.EmpDno3;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface EmpDno3Mapper {
    public List<EmpDno3> list(EmpDno3 empDno3);
    public EmpDno3 select(EmpDno3 empDno3);
    public void insert(EmpDno3 empDno3);
    public void update(EmpDno3 empDno3);
    public void delete(EmpDno3 empDno3);
}

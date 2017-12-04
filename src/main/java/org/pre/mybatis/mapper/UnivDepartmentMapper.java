package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.UnivDepartment;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface UnivDepartmentMapper {
    public List<UnivDepartment> list(UnivDepartment univDepartment);
    public UnivDepartment select(UnivDepartment univDepartment);
    public void insert(UnivDepartment univDepartment);
    public void update(UnivDepartment univDepartment);
    public void delete(UnivDepartment univDepartment);
}

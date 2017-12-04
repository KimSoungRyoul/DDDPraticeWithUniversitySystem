package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.TblDepartment;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface TblDepartmentMapper {
    public List<TblDepartment> list(TblDepartment tblDepartment);
    public TblDepartment select(TblDepartment tblDepartment);
    public void insert(TblDepartment tblDepartment);
    public void update(TblDepartment tblDepartment);
    public void delete(TblDepartment tblDepartment);
}

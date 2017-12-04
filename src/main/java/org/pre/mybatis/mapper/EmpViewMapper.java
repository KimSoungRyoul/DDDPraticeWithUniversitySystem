package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.EmpView;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface EmpViewMapper {
    public List<EmpView> list(EmpView empView);
    public EmpView select(EmpView empView);
    public void insert(EmpView empView);
    public void update(EmpView empView);
    public void delete(EmpView empView);
}

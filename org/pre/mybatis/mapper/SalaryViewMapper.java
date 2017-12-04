package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.SalaryView;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface SalaryViewMapper {
    public List<SalaryView> list(SalaryView salaryView);
    public SalaryView select(SalaryView salaryView);
    public void insert(SalaryView salaryView);
    public void update(SalaryView salaryView);
    public void delete(SalaryView salaryView);
}

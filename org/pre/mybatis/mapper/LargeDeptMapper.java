package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.LargeDept;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface LargeDeptMapper {
    public List<LargeDept> list(LargeDept largeDept);
    public LargeDept select(LargeDept largeDept);
    public void insert(LargeDept largeDept);
    public void update(LargeDept largeDept);
    public void delete(LargeDept largeDept);
}

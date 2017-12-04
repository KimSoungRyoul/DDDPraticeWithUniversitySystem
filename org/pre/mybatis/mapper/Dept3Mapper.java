package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Dept3;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface Dept3Mapper {
    public List<Dept3> list(Dept3 dept3);
    public Dept3 select(Dept3 dept3);
    public void insert(Dept3 dept3);
    public void update(Dept3 dept3);
    public void delete(Dept3 dept3);
}

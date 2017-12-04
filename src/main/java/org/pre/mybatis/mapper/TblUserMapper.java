package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.TblUser;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface TblUserMapper {
    public List<TblUser> list(TblUser tblUser);
    public TblUser select(TblUser tblUser);
    public void insert(TblUser tblUser);
    public void update(TblUser tblUser);
    public void delete(TblUser tblUser);
}

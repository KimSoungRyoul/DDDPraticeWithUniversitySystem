package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.UnivStudent;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface UnivStudentMapper {
    public List<UnivStudent> list(UnivStudent univStudent);
    public UnivStudent select(UnivStudent univStudent);
    public void insert(UnivStudent univStudent);
    public void update(UnivStudent univStudent);
    public void delete(UnivStudent univStudent);
}

package org.pre.mybatis.mapper;

import java.util.List;
import org.pre.mybatis.domain.Professor;

/**
 * @author https://www.facebook.com/groups/mybatis/
 */
public interface ProfessorMapper {
    public List<Professor> list(Professor professor);
    public Professor select(Professor professor);
    public void insert(Professor professor);
    public void update(Professor professor);
    public void delete(Professor professor);
}

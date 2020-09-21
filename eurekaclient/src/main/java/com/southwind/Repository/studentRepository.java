package com.southwind.Repository;
import com.southwind.entity.student;

import java.util.Collection;
public interface studentRepository {
    public Collection<student> findAll();
    public student findById(long id);
    public void saveOrUpdate(student student);
    public void deleteById(long id);
}

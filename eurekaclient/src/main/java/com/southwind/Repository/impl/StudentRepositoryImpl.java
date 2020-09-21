package com.southwind.Repository.impl;

import com.southwind.entity.student;
import com.southwind.Repository.studentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
class StudentRepositoryImpl implements studentRepository {

    private static Map<Long,student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new student(1L,"张三",22));
        studentMap.put(2L,new student(2L,"李四",23));
        studentMap.put(3L,new student(3L,"王五",24));
    }

    @Override
    public Collection<student> findAll() {
        return studentMap.values();
    }

    @Override
    public student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
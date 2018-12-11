/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.work.model.Student;
import java.util.List;

/**
 *
 * @author baki
 */
public interface StudentDao {
    public void addStudent(Student student);
    public void deleteStudent(int studentId);
    public void updateStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(int studentId);
}

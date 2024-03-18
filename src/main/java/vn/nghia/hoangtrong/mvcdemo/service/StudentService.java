package vn.nghia.hoangtrong.mvcdemo.service;

import vn.nghia.hoangtrong.mvcdemo.entity.Student;
import vn.nghia.hoangtrong.mvcdemo.rest.StudentController;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student getStudentById(int id);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudentById(int id);

}

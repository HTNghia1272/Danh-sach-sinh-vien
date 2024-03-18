package vn.nghia.hoangtrong.mvcdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.nghia.hoangtrong.mvcdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

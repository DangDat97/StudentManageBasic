package eadtest.ead.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import eadtest.ead.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    List<Student> findByNameContaining(String name);

    Page<Student> findByTenContaining(String keyword, Pageable pageable);

}

package in.nit.raghu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.raghu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}

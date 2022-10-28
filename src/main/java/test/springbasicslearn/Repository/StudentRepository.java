package test.springbasicslearn.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.springbasicslearn.Entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
}

package Repository;

import entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

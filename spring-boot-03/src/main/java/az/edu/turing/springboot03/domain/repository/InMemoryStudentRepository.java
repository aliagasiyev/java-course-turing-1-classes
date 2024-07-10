package az.edu.turing.springboot03.domain.repository;

import az.edu.turing.springboot03.domain.entit.StudentEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    private List<StudentEntity> students;

    @PostConstruct
    public void init() {
        students = new ArrayList<>();
        students.add(new StudentEntity(1L, "Ali", 20, true, 88.1));
        students.add(new StudentEntity(2L, "Vaqif", 20, true, 89.0));
        students.add(new StudentEntity(3L, "Bob", 20, true, 77.0));
        students.add(new StudentEntity(4L, "Jack", 20, true, 88.2));
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        Long id = student.getId();
        Optional<StudentEntity> optionalStudent = findById(id);
        if (optionalStudent.isEmpty()) {
            students.add(student);
        }
        else {
            optionalStudent.ifPresent(studentEntity -> {
                studentEntity.setId(student.getId());
                studentEntity.setName(student.getName());
                studentEntity.setAge(student.getAge());
                studentEntity.setGender(student.getGender());
                studentEntity.setGrade(student.getGrade());
            });
        }
        return student;
    }

    @Override
    public List<StudentEntity> findAll() {
        return students;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {
        students.removeIf(student -> student.getId().equals(id));

    }
}

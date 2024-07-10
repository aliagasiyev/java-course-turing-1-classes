package az.edu.turing.springboot03.service;

import az.edu.turing.springboot03.domain.entit.StudentEntity;
import az.edu.turing.springboot03.domain.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity student) {
      return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}

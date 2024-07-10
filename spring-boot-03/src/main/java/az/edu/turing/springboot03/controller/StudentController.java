package az.edu.turing.springboot03.controller;

import az.edu.turing.springboot03.domain.entit.StudentEntity;
import az.edu.turing.springboot03.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentEntity> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        log.info("DELETE -> api/v1/students/{}", id);
        try {
            studentService.deleteById(id);
            ResponseEntity.ok("Student deleted successfully" + id);
        } catch (Exception e) {
            log.error("Error deleting student with id {}: {}", id, e.getMessage());
            ResponseEntity.badRequest().body("Error deleting student with id " + id);
        }
    }
    @PostMapping("/{id}")
    public StudentEntity save(StudentEntity student) {
        return studentService.save(student);
    }

}

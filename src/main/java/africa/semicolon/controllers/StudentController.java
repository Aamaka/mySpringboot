package africa.semicolon.controllers;

import africa.semicolon.data.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Amaka",
                        LocalDate.of(2002, Month.MARCH, 6),
                        "fayhvor@gmail.com",
                        20
                )
        );
    }
}
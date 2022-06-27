package africa.semicolon.data.models;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private long Id;
    @NonNull
    private String name;
    @NonNull
    private LocalDate dob;
    @NonNull
    private String email;
    @NonNull
    private int age;
}

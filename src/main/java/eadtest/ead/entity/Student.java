package eadtest.ead.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 33, min = 1, message = "Length must be greater than 1 and less than 33")
    private String name;
    @Size(max = 33, min = 1, message = "Score must be greater than 0 and less than 100")
    @NotBlank(message = "Score is mandatory")
    private int score;
    @Size(max = 10, min = 0, message = "Credit must be greater than 0 and less than 10")
    private float credit;

    @Pattern(regexp = "^(A|B|C)$", message = "Grade must be A or B or C")
    private char grade;

    @NotBlank(message = "Gender is mandatory")
    private boolean gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateReport;

    public String getDateCreate() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dateReport);

    }
}

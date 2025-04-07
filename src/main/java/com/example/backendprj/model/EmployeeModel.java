package com.example.backendprj.model;


import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EmployeeModel {

    private  Long empId;

    @NotNull(message = "not be empty")
    private String firstName;

    @NotNull(message = "enter this field")
    private String lastName;

    @NotNull(message = "enter this field")
    private String phoneNumber;

    @NotNull(message = "enter this field")
    private String email;

    @NotNull(message = "enter this field")
    private String address;

    @NotNull(message = "enter this field")
    private String aadharNumber;

    private Date createdDate;

}

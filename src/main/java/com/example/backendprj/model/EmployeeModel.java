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

    private String lastName;

    private String phoneNumber;

    private String email;

    private String address;

    private String aadharNumber;

    private Date createdDate;

}

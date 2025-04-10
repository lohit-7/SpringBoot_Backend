package com.example.backendprj.model;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StaffModel {

    private  Long empId;

    @NotNull(message = "not be empty")
    private String firstName;

    @NotNull(message = "enter this field")
    private String lastName;

    @NotNull(message = "enter this field")
    private String email;

    @NotNull(message = "enter this field")
    private String phoneNumber;

    @NotNull(message = "enter this field")
    private String jobRole;

    @NotNull(message = "enter this field")
    private String jobType;
}

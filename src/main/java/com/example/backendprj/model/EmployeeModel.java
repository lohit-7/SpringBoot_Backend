package com.example.backendprj.model;

import jakarta.persistence.Column;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String address;

    private String aadharNumber;

    private Date createdDate;

    private Date updatedDate;
}

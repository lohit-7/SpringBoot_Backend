package com.example.backendprj.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Table(name = "Employees")
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long empId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "aadharNumber")
    private String aadharNumber;

}

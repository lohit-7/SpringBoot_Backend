package com.example.backendprj.mapper;

import com.example.backendprj.domain.StaffEntity;
import com.example.backendprj.model.StaffModel;

public class staffMapper {

    public static StaffEntity addModelToEntity(StaffModel staffModel){
        return StaffEntity.builder()
                .firstName(staffModel.getFirstName())
                .lastName(staffModel.getLastName())
                .email(staffModel.getEmail())
                .phoneNumber(staffModel.getPhoneNumber())
                .jobRole(staffModel.getJobRole())
                .jobType(staffModel.getJobType())
                .build();
    }

    public static StaffModel getModelFromEntity(StaffEntity staffEntity){
        StaffModel staff = new StaffModel();
       staff.setEmpId(staffEntity.getStaffId());
       staff.setFirstName(staffEntity.getFirstName());
       staff.setLastName(staffEntity.getLastName());
       staff.setEmail(staffEntity.getEmail());
       staff.setPhoneNumber(staffEntity.getPhoneNumber());
       staff.setJobRole(staffEntity.getJobRole());
       staff.setJobType(staffEntity.getJobType());

        return staff;

    }
}

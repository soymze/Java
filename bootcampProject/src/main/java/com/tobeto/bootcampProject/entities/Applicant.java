package com.tobeto.bootcampProject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="applicants")
@EqualsAndHashCode(callSuper = true)
public class Applicant extends User{

    @Column(name = "about")
    private String about;

}

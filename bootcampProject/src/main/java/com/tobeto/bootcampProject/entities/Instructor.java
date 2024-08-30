package com.tobeto.bootcampProject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="instructors")
@EqualsAndHashCode(callSuper = true)
public class Instructor extends User{

    @Column(name = "companyName")
    private String companyName;

    @OneToOne(mappedBy = "employee")
    private List<Instructor> instructors;
}

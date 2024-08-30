package com.tobeto.bootcampProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
@EqualsAndHashCode(callSuper = true)
public class Employee extends User{

    @Column(name = "position")
    private String position;


}

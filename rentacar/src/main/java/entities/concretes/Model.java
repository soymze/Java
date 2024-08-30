package entities.concretes;

import core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "models")
public class Model extends BaseEntity<Integer> {

    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name="brandId")
    private Brand brand;
    @OneToMany(mappedBy = "brand")
    private List<Model> models;
}

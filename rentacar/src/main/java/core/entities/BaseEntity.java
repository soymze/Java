package core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity <T>{

    private T id;
    @Column (name = "createdDate")
    private LocalDateTime createdDate;
    @Column (name = "updatedDate")
    private LocalDateTime updatedDate;
    @Column (name = "deletedDate")
    private LocalDateTime deletedDate;
}

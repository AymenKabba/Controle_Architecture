package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    public int id_Pc;
    public String proce ;
    public String ram ;
    public String hardDrive ;
    public float price ;
    public String macAddress ;
}

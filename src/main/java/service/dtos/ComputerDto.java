package service.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ComputerDto {
    public String proce ;
    public String ram ;
    public String hardDrive ;
    public float price ;
    public String macAddress ;
}

package src.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "UserRegister")
public class UserRegisterEntity {

    @Id
    private String studentId;
    private String userName;
    private String email;
    private String country;
    private String pNumber;
    private String password;
    private String reenterPassword;
}

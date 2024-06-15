package src.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {

    private String studentId;
    private String userName;
    private String email;
    private String country;
    private String pNumber;
    private String password;
    private String reenterPassword;
}

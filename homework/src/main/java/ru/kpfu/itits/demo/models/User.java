package ru.kpfu.itits.demo.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 20, min = 3, message = "Имя должно быть от 3 до 20 символов")
    @NotEmpty(message = "Введите имя")
    private String name;
    @Email(message = "Email выглядит не оч")
    private String email;
    private String hash_password;
    @Enumerated(value= EnumType.STRING)
    private Role role;

}

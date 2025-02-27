package ru.smartskills.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column
    private String surname;

    @Column
    private String name;

    @Column
    private String patronymic;

    @Email
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    @Size(min = 12, max = 12)
    private String phone;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String address;

    @Column
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column
    private LocalDateTime createdAt; // Дата и время создания профиля

}

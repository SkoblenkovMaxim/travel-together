package ru.smartskills.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String surname;
    private String name;
    private String patronymic;
    private String email;
    private String phone;
    private String country;
    private String city;
    private String address;

}

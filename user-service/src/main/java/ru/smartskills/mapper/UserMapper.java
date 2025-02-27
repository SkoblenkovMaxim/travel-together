package ru.smartskills.mapper;

import org.springframework.stereotype.Component;
import ru.smartskills.dto.UserDto;
import ru.smartskills.model.User;

import java.time.LocalDateTime;

@Component
public class UserMapper {

    public User toUser(UserDto userDto) {
        User user = User.builder()
                .surname(userDto.getSurname())
                .name(userDto.getName())
                .patronymic(userDto.getPatronymic())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .country(userDto.getCountry())
                .city(userDto.getCity())
                .address(userDto.getAddress())
                .password()
                .createdAt(LocalDateTime.now())
                .build();
    }

}

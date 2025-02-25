package ru.smartskills.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.smartskills.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByIdIn(List<Long> ids);

    User findByEmail(String email);

    User findByPhone(String phone);

    User findByEmailAndPhone(String email, String phone);

    boolean existsByEmail(String email);

    boolean existsByPhone(String phone);
}

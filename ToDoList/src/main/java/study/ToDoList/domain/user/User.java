package study.ToDoList.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Entity
public class User {
    @Id
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private LocalDate birth;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Hometown hometown;

    @Column(nullable = false)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Builder
    public User(String name, Gender gender, LocalDate birth, Hometown hometown, String loginId, String password) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.loginId = loginId;
        this.password = password;
    }

}

package study.ToDoList.web.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.ToDoList.domain.user.Gender;
import study.ToDoList.domain.user.Hometown;
import study.ToDoList.domain.user.User;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class SignupRequestDto {
    private String name;
    private Gender gender;
    private LocalDate birth;
    private Hometown hometown;
    private String loginId;
    private String password;

    @Builder
    public SignupRequestDto(String name, Gender gender, LocalDate birth, Hometown hometown, String loginId, String password) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.loginId = loginId;
        this.password = password;
    }

    public User toEntity() {
        return User.builder()
                .name(name)
                .gender(gender)
                .birth(birth)
                .hometown(hometown)
                .loginid(loginId)
                .password(password).build();
    }
}

package study.ToDoList.web;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import study.ToDoList.domain.user.Gender;
import study.ToDoList.domain.user.Hometown;
import study.ToDoList.service.user.UserService;
import study.ToDoList.web.dto.request.SignupRequestDto;
import study.ToDoList.web.dto.response.DefaultRes;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    @PostMapping("/api/user/signup")
    public DefaultRes signup(
            @RequestParam String name,
            @RequestParam Gender gender,
            @RequestParam("birth") @DateTimeFormat(pattern = "MM-dd-yyyy")LocalDate birth,
            @RequestParam Hometown hometown,
            @RequestParam String loginId,
            @RequestParam String password) {
        SignupRequestDto signupRequestDto = SignupRequestDto.builder()
                .name(name)
                .gender(gender)
                .birth(birth)
                .hometown(hometown)
                .loginId(loginId)
                .password(password).build();

        return userService.signup(signupRequestDto);
    }

    @PostMapping("/api/user/signin")
    public DefaultRes signin() {

        return null;
    }

}

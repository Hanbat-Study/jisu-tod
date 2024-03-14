package study.ToDoList.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.ToDoList.service.user.UserService;
import study.ToDoList.web.dto.response.DefaultRes;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    @PostMapping("/api/user/signup")
    public DefaultRes signup() {

        return null;
    }

    @PostMapping("/api/user/signin")
    public DefaultRes signin() {

        return null;
    }

}

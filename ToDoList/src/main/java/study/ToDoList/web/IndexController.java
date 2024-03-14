package study.ToDoList.web;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import study.ToDoList.service.user.UserService;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final UserService uesrService;
    private final HttpSession httpSession;

}

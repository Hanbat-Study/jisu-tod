package study.ToDoList.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.ToDoList.domain.user.User;
import study.ToDoList.domain.user.UserRepository;
import study.ToDoList.web.dto.request.SignupRequestDto;
import study.ToDoList.web.dto.response.DefaultRes;
import study.ToDoList.web.dto.response.StatusCode;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public DefaultRes signup(SignupRequestDto signupRequestDto) {
        User user = signupRequestDto.toEntity();
        userRepository.save(user);

        return DefaultRes.res(StatusCode.OK, "회원가입 완료", user);
    }

}

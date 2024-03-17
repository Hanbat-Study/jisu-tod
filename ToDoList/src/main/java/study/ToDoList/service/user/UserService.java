package study.ToDoList.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.ToDoList.domain.user.User;
import study.ToDoList.domain.user.UserRepository;
import study.ToDoList.web.dto.request.SigninRequestDto;
import study.ToDoList.web.dto.request.SignupRequestDto;
import study.ToDoList.web.dto.response.DefaultRes;
import study.ToDoList.web.dto.response.StatusCode;

import java.util.Optional;

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

    @Transactional
    public DefaultRes signin(SigninRequestDto signinRequestDto) {
        Optional<User> user = findByloginid(signinRequestDto.getLoginId());
        System.out.println(user.get().getLoginid());
        System.out.println(user.get().getPassword());
        if(user == null || !signinRequestDto.getPassword().equals(user.get().getPassword()))
            return DefaultRes.res(StatusCode.OK, "로그인 실패", null);

        return DefaultRes.res(StatusCode.OK, "로그인 성공", null);
    }

    public Optional<User> findByloginid(String loginId) {
        Optional<User> user = userRepository.findByLoginid(loginId);

        return user;
    }
}

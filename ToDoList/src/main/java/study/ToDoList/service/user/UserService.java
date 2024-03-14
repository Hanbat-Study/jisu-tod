package study.ToDoList.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.ToDoList.domain.user.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
}

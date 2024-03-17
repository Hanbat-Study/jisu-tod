package study.ToDoList.web.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SigninRequestDto {
    private String loginId;
    private String password;

    @Builder
    public SigninRequestDto(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}

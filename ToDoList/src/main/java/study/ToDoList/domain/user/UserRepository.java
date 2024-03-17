package study.ToDoList.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM users WHERE loginid = :loginId", nativeQuery = true)
    Optional<User> findByLoginid(@Param("loginId") String loginid);
}

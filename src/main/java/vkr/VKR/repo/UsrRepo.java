package vkr.VKR.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vkr.VKR.models.User;

public interface UsrRepo extends JpaRepository<User, Long> {
}

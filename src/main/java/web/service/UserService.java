package web.service;

import web.model.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}

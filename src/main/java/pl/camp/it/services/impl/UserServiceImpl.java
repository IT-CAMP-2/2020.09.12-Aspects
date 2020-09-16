package pl.camp.it.services.impl;

import org.springframework.stereotype.Service;
import pl.camp.it.model.User;
import pl.camp.it.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser1() {
        return new User(1, "mateusz", "mateusz");
    }

    @Override
    public User getUser2() {
        return new User(2, "janusz", "janusz");
    }

    @Override
    public User getUser3() {
        return new User(3, "wiesław", "wiesław");
    }
}

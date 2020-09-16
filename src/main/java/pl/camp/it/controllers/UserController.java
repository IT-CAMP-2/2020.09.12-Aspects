package pl.camp.it.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.camp.it.model.User;
import pl.camp.it.services.IUserService;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/user1", method = RequestMethod.GET)
    public User getUser1() {
        User user = this.userService.getUser1();

        return user;
    }

    @RequestMapping(value = "/user2", method = RequestMethod.GET)
    public User getUser2() {
        User user = this.userService.getUser2();

        return user;
    }

    @RequestMapping(value = "/user3", method = RequestMethod.GET)
    public User getUser3() {
        User user = this.userService.getUser3();

        return user;
    }
}

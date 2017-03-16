package me.phuongtm;

import me.phuongtm.dto.UserDTO;
import me.phuongtm.mappers.UserMapper;
import me.phuongtm.models.User;

/**
 * Created by phuongtm on 3/16/2017.
 */
public class Application {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("hello");
        user.setPassword("123456");
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        System.out.println(userDTO);
    }

}

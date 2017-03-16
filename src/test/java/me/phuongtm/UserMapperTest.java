package me.phuongtm;

import me.phuongtm.dto.UserDTO;
import me.phuongtm.mappers.UserMapper;
import me.phuongtm.models.User;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by phuongtm on 3/16/2017.
 */

public class UserMapperTest {

    @Test
    public void shouldMappingCorrectly() throws Exception {
        final String username = "username";
        final String password = "password";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        System.out.println(userDTO);
        assertThat(userDTO.getUserName()).isEqualTo(username);
        assertThat(userDTO.getPassWord()).isEqualTo(null);
    }
}

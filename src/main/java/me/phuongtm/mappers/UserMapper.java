package me.phuongtm.mappers;

import me.phuongtm.dto.UserDTO;
import me.phuongtm.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by phuongtm on 3/16/2017.
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "username", target = "userName"),
            @Mapping(source = "password", target = "passWord", ignore = true)
    })
    UserDTO userToUserDTO(User user);

}

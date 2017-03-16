package me.phuongtm.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by phuongtm on 3/16/2017.
 */
@Data
@ToString
@NoArgsConstructor
public class UserDTO {

    private String userName;
    private String passWord;

}

package com.org.prj.services.external;

import com.org.prj.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> getUsersList();
}

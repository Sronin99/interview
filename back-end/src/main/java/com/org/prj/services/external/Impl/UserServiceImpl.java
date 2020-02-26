package com.org.prj.services.external.Impl;

import com.org.prj.beans.User;
import com.org.prj.dto.UserDto;
import com.org.prj.services.external.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends RestTemplate implements UserService {

    @Value("${service.user}")
    private String wsUrl;

    @Override
    public List<UserDto> getUsersList() {
        User[] users;
        try {
            users = this.getForObject(wsUrl, User[].class);
        } catch (Exception e) {
            throw new RuntimeException("Error while calling Users List Service", e);
        }

        return getUsersDtosFromUsers(users);
    }

    private List<UserDto> getUsersDtosFromUsers(User[] users) {
        List<UserDto> result =
                Arrays.asList(users).isEmpty() ? new ArrayList<>() :
                Arrays.stream(users)
                        .filter(Objects::nonNull)

                        .map(u -> new UserDto(u.getUserId(), u.getId(), u.getTitle(), u.getBody()))

                        .limit(50)

                        .sorted(Comparator.comparing(UserDto::getTitle))

                        .collect(Collectors.toList());

        return result;
    }
}

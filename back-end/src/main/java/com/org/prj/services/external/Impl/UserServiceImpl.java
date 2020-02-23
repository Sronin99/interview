package com.org.prj.services.external.Impl;

import com.org.prj.beans.User;
import com.org.prj.dto.UserDto;
import com.org.prj.services.external.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends RestTemplate implements UserService {

    @Override
    public List<UserDto> getUsersList() {
        String url = getUsersListServiceUrl();
        User[] users;
        try {
            users = this.getForObject(url, User[].class);
        } catch (Exception e) {
            throw new RuntimeException("Error while calling Users List Service", e);
        }

        return getUsersDtosFromUsers(users);
    }

    // TODO
    private List<UserDto> getUsersDtosFromUsers(User[] users) {
        return new ArrayList<>();
    }

    private String getUsersListServiceUrl() {
        return "https://jsonplaceholder.typicode.com/posts";
    }
}

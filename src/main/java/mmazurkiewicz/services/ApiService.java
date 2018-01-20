package mmazurkiewicz.services;

import mmazurkiewicz.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}

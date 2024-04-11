package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();


    public void saveUser(User user);


    public void deleteUser(Long id);

    public User getUserById(Long id);


    public void updateUser(Long id, User updatedUser);
}

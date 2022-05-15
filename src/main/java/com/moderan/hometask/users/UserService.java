package com.moderan.hometask.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        String password = user.getPassword();
        String hashedPasString = new BCryptPasswordEncoder().encode(password);
        user.setPassword(hashedPasString);

        return userRepository.save(user);
    }

    public List<User> getUsersWithRole(String role) { return userRepository.findByRole(role); }

    
}

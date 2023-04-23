package com.inditex.masterwwsc;
import entity.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import java.util.List;

@RestController
public class DemoController {
     private UserRepository saludoRepository;
     @PostMapping("/user")
     User newUser(@RequestBody User newUser){
        return saludoRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return saludoRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return saludoRepository.findById(id)
                .orElseThrow(()-> new SaludoNotFoundException(id));
    }
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return saludoRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return saludoRepository.save(user);
                }).orElseThrow(()-> new SaludoNotFoundException(id));
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if (!saludoRepository.existsById(id)){
            throw new SaludoNotFoundException(id);
        }
        saludoRepository.deleteById(id);
        return "User with " + id + " has been deleted";
    }
}

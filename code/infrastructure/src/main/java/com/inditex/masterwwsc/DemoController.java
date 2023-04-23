package com.inditex.masterwwsc;
import entity.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;
import usecase.in.GetUserUseCase;

import java.util.List;

@RestController
public class DemoController {
     public UserRepository userRepository;
        @PostMapping("/user")
     User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    public DemoController(GetUserUseCase getUserUseCase) {
        this.getUserUseCase = getUserUseCase;
    }

    public List<User> getAllUsers() {
        return getUserUseCase.findAll();
    }
    public GetUserUseCase getUserUseCase;
    DemoController demoController = new DemoController(getUserUseCase);


    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()-> new SaludoNotFoundException(id));
    }
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(()-> new SaludoNotFoundException(id));
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if (!userRepository.existsById(id)){
            throw new SaludoNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with " + id + " has been deleted";
    }
}

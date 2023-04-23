package com.inditex.masterwwsc;
import com.inditex.masterwwsc.SaludoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
     private SaludoRepository saludoRepository;
    @GetMapping(value = "/hello", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Saludo> sayHello(){
        return ResponseEntity.ok(new Saludo());
    }
    @PostMapping("/user")
      Saludo newUser(@RequestBody Saludo newUser){
        return saludoRepository.save(newUser);
    }

    @GetMapping("/users")
    List<Saludo> getAllUsers(){
        return saludoRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Saludo getUserById(@PathVariable Long id){
        return saludoRepository.findById(id)
                .orElseThrow(()-> new SaludoNotFoundException(id));
    }
    @PutMapping("/user/{id}")
    Saludo updateUser(@RequestBody Saludo newUser,@PathVariable Long id){
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

package br.com.senacsp.tads.stads4na.library.presentation;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senacsp.tads.stads4na.library.domainmodel.repository.User;
import br.com.senacsp.tads.stads4na.library.service.UserService;



@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping //http://localhost:8080/api/users
//    @RequestMapping(produces = "json", method = RequestMethod.GET)
    public ResponseEntity<List<User>> fetchAllUsers() {
        return ResponseEntity.ok().body(this.userService.findAll());
        
    }
    //http://localhost:8080/api/users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<User> fetchbyId(@PathVariable UUID id) {
        User user = this.userService.findById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        
            return ResponseEntity.ok(user);
        }
        
    }
}

package br.com.senacsp.tads.stads4na.library.domainmodel.repository;


import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

@Component  
public class NonPersistentUserRepository implements UserRepository<User, UUID>{
    
    private final List<User> interalData = new ArrayList<>();

    public NonPersistentUserRepository() {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            User user = new User(
                UUID.randomUUID(),
                faker.name().fullName(),
                faker.internet().emailAddress(),
                faker.internet().password()
            );
            this.interalData.add(user);
        }
        
       }

    @Override
    public List<User> findAll() {
        return this.interalData.stream().toList();
        
        
    }

    
    


}

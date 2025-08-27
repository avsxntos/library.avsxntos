package br.com.senacsp.tads.stads4na.library.service;

import br.com.senacsp.tads.stads4na.library.domainmodel.repository.NonPersistentUserRepository;
import br.com.senacsp.tads.stads4na.library.domainmodel.repository.User;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor


public class UserServiceImpl implements UserService {

    private final NonPersistentUserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> resultset = new ArrayList<>();
        resultset.addAll(this.userRepository.findAll());
        return this.userRepository.findAll();
    }  
}

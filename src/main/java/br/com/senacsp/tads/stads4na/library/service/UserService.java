package br.com.senacsp.tads.stads4na.library.service;

import br.com.senacsp.tads.stads4na.library.domainmodel.repository.NonPersistentUserRepository;
import br.com.senacsp.tads.stads4na.library.domainmodel.repository.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;
@Service


public interface UserService {

    List<User> findAll();

}

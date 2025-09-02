package br.com.senacsp.tads.stads4na.library.domainmodel.repository;

import java.util.List;

public interface UserRepository<T, ID> {
    List<User> findAll();

    

}

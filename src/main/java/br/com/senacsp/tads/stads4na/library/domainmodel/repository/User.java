package br.com.senacsp.tads.stads4na.library.domainmodel.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor

public class User {
    private @Setter @Getter UUID id;
    private @Setter @Getter String nome;
    private @Setter @Getter String email;
    private @Setter @Getter String password;
}

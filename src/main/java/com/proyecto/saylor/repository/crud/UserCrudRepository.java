package com.proyecto.saylor.repository.crud;

import java.util.Optional;
import com.proyecto.saylor.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author BrayandFuyo
 */
//Interfaz
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}

package com.api.CRUD.repositories;

import com.api.CRUD.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository es algo adicional para poder realizar ciertas consultas de forma más sencilla
@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long>{
}

package com.nadhem.produit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nadhem.produit.model.Users;

@Component
public interface userJpaRespository extends JpaRepository<Users,Long>{

	Users findByName(String name);

}

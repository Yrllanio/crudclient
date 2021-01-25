package com.yrllanio.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yrllanio.crudclient.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

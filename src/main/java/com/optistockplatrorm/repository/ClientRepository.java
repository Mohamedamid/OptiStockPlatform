package com.optistockplatrorm.repository;

import com.optistockplatrorm.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {

    boolean existsByEmail(String email);
}

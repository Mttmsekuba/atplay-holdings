package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.entity.Client;

/**
 * author Mamoloko
 * Date: 07/09/2020
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

package com.contabancaria.contaBancariaAPI.repository;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaModel, Long> {

}

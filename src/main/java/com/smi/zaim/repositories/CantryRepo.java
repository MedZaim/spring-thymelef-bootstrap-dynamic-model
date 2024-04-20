/**
 * @author : Mohamed Zaim
 * @mailto : mohamed.zaim97@gmail.com
 * @created : 20/04/2024, Saturday
 **/


package com.smi.zaim.repositories;

import com.smi.zaim.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantryRepo extends JpaRepository<Country, Integer> {

}

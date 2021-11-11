package com.developer.msscbeer.inventory.repositories;

import com.developer.msscbeer.inventory.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created By Rohit on 11-11-2021.
 */

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
    List<BeerInventory> findAllByBeerId(UUID beerId);

}

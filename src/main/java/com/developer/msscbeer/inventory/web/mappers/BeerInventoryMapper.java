package com.developer.msscbeer.inventory.web.mappers;

import com.developer.msscbeer.inventory.domain.BeerInventory;
import com.developer.msscbeer.inventory.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;
/**
 * Created By Rohit on 11-11-2021.
 */

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
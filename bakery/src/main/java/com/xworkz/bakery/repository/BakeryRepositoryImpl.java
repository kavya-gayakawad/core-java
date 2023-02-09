package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepositoryImpl implements BakeryRepository {

	public BakeryRepositoryImpl() {
    System.out.println("created "+this.getClass().getSimpleName());
}

	@Override
	public boolean save(BakeryDTO dto) {
    System.out.println("running save in repository impl");		
    return false;
	}

}

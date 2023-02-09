package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepository;
@Service
public class BakeryServiceImpl implements BakeryService {
	
@Autowired
private BakeryRepository repository;

public BakeryServiceImpl() {
System.out.println("created " + this.getClass().getSimpleName());
}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
    System.out.println("created validate and save in Bakery " + dto);
    boolean save = this.repository.save(dto);
    System.out.println("Saved in repo " + save);
    return false;
	}

}

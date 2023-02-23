package com.xworkz.airplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airplane.entity.AirplaneEntity;

@Repository
public class AirplaneRepositoryImpl implements AirplaneRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public  AirplaneRepositoryImpl() {
	System.out.println("created " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(AirplaneEntity entity) {
	System.out.println("running save in repository..."); 
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	manager.persist(entity);
	transaction.commit();
	manager.close();
	return true;
		
	}
    @Override
	
	public AirplaneEntity findById(int id) {
	System.out.println("Find by id in repo " + id);
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	AirplaneEntity airplaneEntity = manager.find(AirplaneEntity.class, id);
	manager.close();
	
		return airplaneEntity;
	}

}

package com.xworkz.bridge.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.bridge.entity.BridgeEntity;

@Repository
public class BridgeRepositoryImpl implements BridgeRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BridgeRepositoryImpl() {
    System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BridgeEntity entity) {
	System.out.println("running save in repository...");
	
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	manager.persist(entity);
    transaction.commit();
	manager.close();
	return true;
	}
	
	@Override
	
	public BridgeEntity findById(int id) {
	System.out.println("Find by id in repo " + id);
	
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	BridgeEntity bridgeEntity = manager.find(BridgeEntity.class, id);
	manager.close();
	
	return bridgeEntity; 
	

}
}

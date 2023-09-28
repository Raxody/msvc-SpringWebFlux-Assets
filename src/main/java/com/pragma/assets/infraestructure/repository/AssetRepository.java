package com.pragma.assets.infraestructure.repository;

import com.pragma.assets.infraestructure.entity.AssetEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends ReactiveMongoRepository<AssetEntity,String> {

}

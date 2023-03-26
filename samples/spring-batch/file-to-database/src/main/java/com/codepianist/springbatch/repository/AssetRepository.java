package com.codepianist.springbatch.repository;

import com.codepianist.springbatch.model.entity.AssetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface AssetRepository extends CrudRepository<String, AssetEntity> {
}

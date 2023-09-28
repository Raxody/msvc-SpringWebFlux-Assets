package com.pragma.assets.infraestructure.adapter;

import com.pragma.assets.domain.model.entity.Asset;
import com.pragma.assets.domain.port.dao.AssetDAO;
import com.pragma.assets.infraestructure.entity.mapper.AssetMapper;
import com.pragma.assets.infraestructure.repository.AssetRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class AssetDaoImpl implements AssetDAO {
    private final AssetRepository assetRepository;
    private final AssetMapper assetMapper;

    public AssetDaoImpl(AssetRepository assetRepository, AssetMapper assetMapper) {
        this.assetRepository = assetRepository;
        this.assetMapper = assetMapper;
    }
    @Override
    public Flux<Asset> getAllAssets() {
        return assetRepository.findAll().map(assetMapper::entityToAsset);
    }
}

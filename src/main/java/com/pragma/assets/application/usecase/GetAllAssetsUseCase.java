package com.pragma.assets.application.usecase;

import com.pragma.assets.domain.model.entity.Asset;
import com.pragma.assets.domain.port.dao.AssetDAO;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class GetAllAssetsUseCase {
    private final AssetDAO assetDAO;

    public GetAllAssetsUseCase(AssetDAO assetDAO) {
        this.assetDAO = assetDAO;
    }

    public Flux<Asset> execute() {
        return this.assetDAO.getAllAssets();
    }
}

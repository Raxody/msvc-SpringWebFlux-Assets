package com.pragma.assets.domain.port.dao;

import com.pragma.assets.domain.model.entity.Asset;
import reactor.core.publisher.Flux;

public interface AssetDAO {
    Flux<Asset> getAllAssets();

}

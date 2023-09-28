package com.pragma.assets.infraestructure.entity.mapper;

import com.pragma.assets.domain.model.entity.Asset;
import com.pragma.assets.infraestructure.entity.AssetEntity;

public interface AssetMapper {

    Asset entityToAsset(AssetEntity assetEntity);

}

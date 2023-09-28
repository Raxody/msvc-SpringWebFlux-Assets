package com.pragma.assets.infraestructure.controller;

import com.pragma.assets.application.usecase.GetAllAssetsUseCase;
import com.pragma.assets.domain.model.entity.Asset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AssetController {
    private final GetAllAssetsUseCase getAllAssetsUseCase;

    public AssetController(GetAllAssetsUseCase getAllAssetsUseCase) {
        this.getAllAssetsUseCase = getAllAssetsUseCase;
    }

    @GetMapping("/assetss")
    public Flux<Asset> getAllAssets(){
        return getAllAssetsUseCase.execute();
    }


}

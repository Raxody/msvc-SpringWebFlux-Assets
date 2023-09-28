package com.pragma.assets.infraestructure.entity.mapper;

import com.pragma.assets.domain.model.entity.*;
import com.pragma.assets.infraestructure.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AssetMap implements AssetMapper {

    @Override
    public Asset entityToAsset(AssetEntity assetEntity) {
        if (assetEntity instanceof ComputerEntity) {
            return computerEntityToAsset((ComputerEntity) assetEntity);
        } else if (assetEntity instanceof ScreenEntity) {
            return screenEntityToAsset((ScreenEntity) assetEntity);
        } else if (assetEntity instanceof TechnologicalEntity) {
            return technologicalEntityToAsset((TechnologicalEntity) assetEntity);
        } else if (assetEntity instanceof MaintenanceEntity) {
            return maintenanceEntityToAsset((MaintenanceEntity) assetEntity);
        } else if (assetEntity instanceof FurnitureEntity) {
            return furnitureEntityToAsset((FurnitureEntity) assetEntity);
        } else if (assetEntity instanceof LicenseEntity) {
            return licenseEntityToAsset((LicenseEntity) assetEntity);
        } else if (assetEntity instanceof AbstractEntity) {
            return abstractEntityToAsset((AbstractEntity) assetEntity);
        }
        return assetEntityToAsset(assetEntity);
    }

    private Asset computerEntityToAsset(ComputerEntity computerEntity) {
        Asset computer = new Computer();
        BeanUtils.copyProperties(computerEntity, computer);

        return computer;
    }

    private Asset screenEntityToAsset(ScreenEntity screenEntity) {
        Asset screen = new Screen();
        BeanUtils.copyProperties(screenEntity, screen);
        return screen;
    }

    private Asset technologicalEntityToAsset(TechnologicalEntity technologicalEntity) {
        Asset technological = new Technological();
        BeanUtils.copyProperties(technologicalEntity, technological);
        return technological;
    }

    private Asset furnitureEntityToAsset(FurnitureEntity furnitureEntity) {
        Asset furniture = new Furniture();
        BeanUtils.copyProperties(furnitureEntity, furniture);
        return furniture;
    }

    private Asset maintenanceEntityToAsset(MaintenanceEntity maintenanceEntity) {
        Asset maintenance = new Maintenance();
        BeanUtils.copyProperties(maintenanceEntity, maintenance);
        return maintenance;
    }

    private Asset abstractEntityToAsset(AbstractEntity abstractEntity) {
        Asset assetAbstract = new Abstract();
        BeanUtils.copyProperties(abstractEntity, assetAbstract);
        return assetAbstract;
    }

    private Asset licenseEntityToAsset(LicenseEntity licenseEntity) {
        Asset license = new License();
        BeanUtils.copyProperties(licenseEntity, license);
        return license;
    }


    private Asset assetEntityToAsset(AssetEntity assetEntity) {
        Asset asset = new Asset();
        BeanUtils.copyProperties(assetEntity, asset);
        return asset;
    }
}

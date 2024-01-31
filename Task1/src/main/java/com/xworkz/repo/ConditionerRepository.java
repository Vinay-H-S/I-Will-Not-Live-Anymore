package com.xworkz.repo;

import com.xworkz.entity.ConditionerEntity;

import java.util.Collections;
import java.util.List;

public interface ConditionerRepository {

    void save(ConditionerEntity entity);

    void saveAll(List<ConditionerEntity> list);

    default void updateLiquidVolumeByBrand(String brand,int liquidVolume){

    }

    default void updateHairTypeByBrand(String brand,String hairType){

    }

    default List<ConditionerEntity> findAllByBrand(String brand){
        return Collections.emptyList();
    }
    default List<ConditionerEntity> findAllHairType(String hairType){
        return Collections.emptyList();
    }

    default List<ConditionerEntity>  findScentById(int id){
        return Collections.emptyList();
    }

    default List<Integer> getAllSize(){
        return Collections.emptyList();
    }

    default List<String> getAllBrand(){
        return Collections.emptyList();
    }
}

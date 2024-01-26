package com.xworkz.repo;

import com.xworkz.entity.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {

    Integer save(TempleEntity templeEntity);

    void saveAll(List<TempleEntity> list);

    default List<TempleEntity> findAllByLocation(String name) {
        return Collections.emptyList();

    }

    default List<TempleEntity> findAllByEntryFeeGreaterThan(double fee) {
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date) {
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
        return Collections.emptyList();
    }

    default TempleEntity findById(int id) {
        return null;
    }

    default List<TempleEntity> findByIdAndMainGOd(int id, String mainGod) {
        return Collections.emptyList();
    }

    long findTotal();

    TempleEntity findTempleByMaxEntryFee();

    default void updateLocationByName(String location, String name) {

    }

   default void upadteEntryFeeByName(double fee,String name){

    }

    default void updateLocationAndDimensionById(String location,String dimension,int id){

    }

    default void updateAllVipEntry(boolean vipEntry,List<Integer> ids){

    }

    default void deleteByName(String name){

    }
}

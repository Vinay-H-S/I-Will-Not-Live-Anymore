package com.xworkz.repo;

import com.xworkz.entity.TempleEntity;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {

    Integer save(TempleEntity templeEntity);

    void saveAll(List<TempleEntity> list);

  default   List<TempleEntity> findAllByLocation(String name){
        return Collections.emptyList();

    }

   default List<TempleEntity> findAllByEntryFeeGreaterThan(double fee){
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByEntryFeeBetween(double startFee,double endFee){
        return Collections.emptyList();
    }

    default  List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date){
      return Collections.emptyList();
    }

    default  List<TempleEntity> findAllByMainGodAndLocation(String mainGod,String location){
      return  Collections.emptyList();
    }

   default TempleEntity findById(int id)
    {
     return null;
    }
}

package com.xworkz.boot;

import com.xworkz.entity.ConditionerEntity;
import com.xworkz.repo.ConditionerRepository;
import com.xworkz.repo.ConditionerRepositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionerRunner {

    public static void main(String[] args) {

        ConditionerEntity conditionerEntity = new ConditionerEntity("Dove", "All", 180, "India", 203, "Hair Fall Rescue");

        ConditionerRepository conditionerRepository = new ConditionerRepositoryImpl();
        conditionerRepository.save(conditionerEntity);

        List<ConditionerEntity> list = new ArrayList<>(Arrays.asList(new ConditionerEntity("L Oreal", "Curly", 180, "India", 190, "Fresh"), new ConditionerEntity("TREsemme", "Frezzy,Dry", 195, "India", 233, "Argan Oil"), new ConditionerEntity("Dr Batra's", "Dry", 150, "USA", 285, "Unscented"), new ConditionerEntity("Khadi Natural", "Frezzy,Dry", 195, "India", 233, "Amla"), new ConditionerEntity("Re'equil", "Curly", 220, "USA", 320, "Murumuru")));

        conditionerRepository.saveAll(list);

        conditionerRepository.updateLiquidVolumeByBrand("TREsemme", 310);

        conditionerRepository.updateHairTypeByBrand("Re'equil", "Curly,Dry");

        List<ConditionerEntity> entityList = conditionerRepository.findAllByBrand("TREsemme");
        System.out.println(entityList);

        List<ConditionerEntity> entityList1 = conditionerRepository.findAllHairType("Frezzy,Dry");
        System.out.println(entityList1);

        List<ConditionerEntity> entityList2 = conditionerRepository.findScentById(1);
        System.out.println(entityList2);

        List<Integer> entityList3 = conditionerRepository.getAllSize();
        System.out.println("All Size : " + entityList3);

        List<String> entityList4 = conditionerRepository.getAllBrand();
        System.out.println("All Brand : " + entityList4);

    }
}

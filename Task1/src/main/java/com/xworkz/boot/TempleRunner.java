package com.xworkz.boot;

import com.xworkz.entity.TempleEntity;
import com.xworkz.repo.TempleRepository;
import com.xworkz.repo.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TempleRunner {

    public static void main(String[] args) {
        TempleEntity templeEntity = new TempleEntity("Sharadamba Temple", "Srigeri", 100, true, LocalDate.of(2024, 01, 12), "Sharadamba", "50*30");

        TempleEntity templeEntity1 = new TempleEntity("Sigandur Temple", "Sigandur", 150, true, LocalDate.of(2024, 02, 21), "Sigandur chowdeshwari", "100*60");
        TempleEntity templeEntity2 = new TempleEntity("Moorudeshwara Temple", "Moorudeshwara", 200, true, LocalDate.of(2024, 01, 18), "Shiva", "200*100");
        TempleEntity templeEntity3 = new TempleEntity("Annapoorneshwari Temple", "Horandau", 310, false, LocalDate.of(2024, 02, 9), "Annapoorneshawari", "100*90");
        TempleEntity templeEntity4 = new TempleEntity("Ganapathi Temple", "Hidagunji", 120, false, LocalDate.of(2024, 02, 22), "Ganapathi", "120*100");

        List<TempleEntity> list = Arrays.asList(templeEntity1, templeEntity2, templeEntity3, templeEntity4);

        TempleRepository templeRepository = new TempleRepositoryImpl();
//        templeRepository.save(templeEntity);
//        templeRepository.saveAll(list);
//
//        List<TempleEntity> list1 = templeRepository.findAllByLocation("srigeri");
//        list1.forEach(loc -> System.out.println(loc));
//
//        List<TempleEntity> list2 = templeRepository.findAllByEntryFeeGreaterThan(100);
//        list2.forEach(fee -> System.out.println(fee));
//
//        List<TempleEntity> list3 = templeRepository.findAllByInaguratedDateGreaterThan(LocalDate.of(2024, 02, 6));
//        list3.forEach(dt -> System.out.println(dt));

        TempleEntity id = templeRepository.findById(2);
        System.out.println(id);

//        List<TempleEntity> fee = templeRepository.findAllByEntryFeeBetween(100, 300);
//        fee.forEach(z -> System.out.println(z));
//
//        List<TempleEntity> temple = templeRepository.findAllByMainGodAndLocation("Sharadamba", "Srigeri");
//        temple.forEach(t -> System.out.println(t));
//
//        List<TempleEntity> tem = templeRepository.findByIdAndMainGOd(1, "Sharadamba");
//        tem.forEach(t -> System.out.println(t));
//
//        long total = templeRepository.findTotal();
//        System.out.println("Total :" + total);
//
//        TempleEntity maxFee = templeRepository.findTempleByMaxEntryFee();
//        System.out.println(maxFee);
//
//        templeRepository.updateLocationByName("Shrigiri", "Sharadamba Temple");
//
//        templeRepository.upadteEntryFeeByName(500, "Ganapathi Temple");
//
//        templeRepository.updateLocationAndDimensionById("Edagungi", "150*180", 5);
//
//        List<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        templeRepository.updateAllVipEntry(true, integers);

//        templeRepository.deleteByName("Moorudeshwara Temple");

    }
}

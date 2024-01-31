package com.xworkz.boot;

import com.xworkz.entity.EmailEntity;
import com.xworkz.repo.EmailRepository;
import com.xworkz.repo.EmailRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Slf4j
public class AllEntityRunner {

    public static void main(String[] args) {

//        EmailEntity emailEntity=new EmailEntity(1,"Banglore","vinayshudedar@gmail.com","darshanr@gmail.com"
//                ,"venu@gmail.com","chandanv@gmail.com", LocalDate.of(2024,01,10));
//        EmailEntity emailEntity1=new EmailEntity(2,"Shivamogga","jeevan@gmail.com","dravid@gmail.com"
//                ,"harshith@gmail.com","hareesha@gmail.com", LocalDate.of(2024,01,21));
//
//        EmailRepository emailRepository=new EmailRepositoryImpl();
//        emailRepository.save(emailEntity);
//        emailRepository.save(emailEntity1);
//
//        TravelEntity travelEntity = new TravelEntity(1, "Shivamogga", "Goa", 10000d, 350,
//                "Trip", LocalTime.of(07, 25), LocalDate.of(2024, 01, 11),
//                LocalDate.of(2024, 01, 18));
//        TravelEntity travelEntity1 = new TravelEntity(2, "Banglore", "Kerala", 15000d, 400,
//                "Trip", LocalTime.of(10, 10), LocalDate.of(2024, 02, 12),
//                LocalDate.of(2024, 02, 22));
//
//        TravelRepository travelRepository=new TravelRepositoryImpl();
//        travelRepository.save(travelEntity);
//        travelRepository.save(travelEntity1);
        EmailEntity emailEntity1 = new EmailEntity("Udupi", "vinayshudedar@gmail.com", "darshanr@gmail.com", "venu@gmail.com", "chandanv@gmail.com", LocalDate.of(2024, 01, 10));
        EmailEntity emailEntity2 = new EmailEntity("Manipal", "gopal@gmail.com", "virat@gmail.com", "harshith@gmail.com", "hareesha@gmail.com", LocalDate.of(2024, 01, 21));
        EmailEntity emailEntity3 = new EmailEntity("Goa", "yalla@gmail.com", "dhoni@gmail.com", "harshith@gmail.com", "hareesha@gmail.com", LocalDate.of(2024, 01, 21));

        List<EmailEntity> emailEntities= Arrays.asList(emailEntity1,emailEntity2,emailEntity3);
        EmailRepository emailRepository=new EmailRepositoryImpl();
//        emailRepository.saveAll(emailEntities);
       List<EmailEntity> list= emailRepository.findAll("Manipal");
       list.forEach(add-> System.out.println(add));


    }
}

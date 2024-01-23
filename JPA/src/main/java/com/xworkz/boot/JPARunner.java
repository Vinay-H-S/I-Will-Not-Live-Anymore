package com.xworkz.boot;

import com.xworkz.boot.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;

public class JPARunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        ArrayList<FilmEntity> filmEntities = new ArrayList<>(Arrays.asList(new FilmEntity(1, "Leo", "Vijay", "Trisha", 280), new FilmEntity(2, "Akash", "Puneeth RajKumar","Ramya",1.2),new FilmEntity(3,"Robert","Darshan","Asha Bhat",2.5),new FilmEntity(4,"KGF","Yash","Srineedhi Sheety",100),new FilmEntity(5,"Kotigobba 3","Sudeep","Rachitha Ram",50)));

       ArrayList<TrafficEntity> trafficEntities=new ArrayList<>(Arrays.asList(new TrafficEntity(1,"Blinker","LED","12-DC","Red"),new
               TrafficEntity(2,"Alpha","Polypor","10-DC","Green"),new TrafficEntity(3,"Dilogo",
               "LED","25-DC","Yellow")));

       ArrayList<SportsEntity> sportsEntities=new ArrayList<>(Arrays.asList(new SportsEntity(1,"Cricket","CSK","Chennai"),new
               SportsEntity(2,"Cricket","RCB","Karnataka"),new SportsEntity(3,"Cricket","KKR","Kolkota"),new SportsEntity(4,"Cricket","SRH","Hydrabad"),new SportsEntity(5,
               "Cricket","MI","Mumbai")));


       ArrayList<ShopEntity> shopEntities=new ArrayList<>(Arrays.asList(new ShopEntity(1,"Boat","Kiran","Banglore"),
               new ShopEntity(2,"Noise","Harshith","Manglore"),new ShopEntity(3,"Iphone","Jeevan",
                       "Bhadravathi"),new ShopEntity(4,"One Plus","Hareesh","Chitradurga"),new ShopEntity(5,"Realme",
                       "venu","Shimoga")));

       ArrayList<OceanEntity> oceanEntities = new ArrayList<>(Arrays.asList(new OceanEntity(1,"Indian Ocean",16000,"India"),
               new OceanEntity(2,"Bay of bengal",12000,"Srilanka"),new OceanEntity(3,"Peacific Ocean",2100,"Africa"),
       new OceanEntity(4,"The sea murmur",12320,"Canada"),new OceanEntity(5,"The North Atlantic",31200,"Ataltic")));

       et.begin();
       for(FilmEntity films:filmEntities){
          em.persist(films);
       }

       for(TrafficEntity traffics:trafficEntities){
           em.persist(traffics);
       }

       for (SportsEntity sports:sportsEntities){
           em.persist(sports);
       }

       for(ShopEntity shops:shopEntities){
           em.persist(shops);
       }

       for(OceanEntity oceans:oceanEntities){
           em.persist(oceans);
       }
       et.commit();
        System.out.println("All Data is Committed.....!!!!");
        emf.close();
        em.close();


    }
}

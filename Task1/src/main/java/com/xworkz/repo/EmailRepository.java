package com.xworkz.repo;

import com.xworkz.entity.EmailEntity;

import java.util.Collections;
import java.util.List;

public interface EmailRepository {
    Integer save(EmailEntity emailEntity);

   default void saveAll(List<EmailEntity> list){

   }

   default List<EmailEntity> findAll(String address){
       return Collections.emptyList();
   }
}

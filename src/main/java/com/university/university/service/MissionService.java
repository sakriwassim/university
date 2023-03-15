package com.university.university.service;

import com.university.university.model.entity.Mission;
import com.university.university.repository.MissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MissionService {
    @Autowired
    private MissionRepo missionRepo ;


    public  Mission getMissionById(Integer id ){
        Optional<Mission> emp = missionRepo.findById(id);
        return emp.orElse(null);
    }

    public  Mission addMission(Mission mission, Integer idAddress){

        Mission added = missionRepo.save(mission);
        return added;
    }

    public  Mission updateMission(Mission mission, Integer idAdress){

        Mission updated = missionRepo.save(mission);
        return updated;
    }


    public  Collection<Mission> getAllMission(){
         Collection<Mission> list = missionRepo.findAll();
       return list;
    }

    public  void deleteMission(Integer id){
         this.missionRepo.deleteById(id);


    }










}


package com.university.university.controller;
import com.university.university.model.entity.Mission;
import com.university.university.model.entity.Mission;
import com.university.university.service.EmpService;
import com.university.university.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class MissionController {

    @Autowired
    private MissionService missionService ;


    @GetMapping("/Missions/{id}")
    public Mission getMissionById(@PathVariable("id") Integer id){
      return missionService.getMissionById(id);
    }
    @PostMapping("/Missions")
    public Mission addMission(@RequestBody Mission mission, @RequestParam Integer idAdress){
        return missionService.addMission(mission, idAdress);
    }
    @PutMapping ("/Missions")
    public Mission updateMission(@RequestBody Mission mission,@RequestBody Integer idAdress){
        return missionService.updateMission(mission , idAdress);
    }

    @GetMapping("/Missions")
    public Collection<Mission> getAllMissions(){
        return missionService.getAllMission();
    }

    @DeleteMapping("/Missions/{id}")
    public void deleteMission(@PathVariable("id") Integer id){
        missionService.deleteMission(id);
    }

}

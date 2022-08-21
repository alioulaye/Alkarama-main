package com.projet.mtproject.service;

import com.projet.mtproject.DAO.PointRetraitRepository;
import com.projet.mtproject.model.PointRetrait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointRetraitService {
    @Autowired
    private PointRetraitRepository pointRetraitRepository;
    public Boolean save(PointRetrait pointRetrait){

        if(pointRetrait==null){
            return false;
        }else {
            pointRetraitRepository.save(pointRetrait);
            return true;
        }
    }

    public List<PointRetrait>liste(){
        return pointRetraitRepository.findAll();
    }
}


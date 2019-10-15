package com.yuansen.project.service.impl;

import com.yuansen.project.dataobject.LySite.LySite;
import com.yuansen.project.repository.LySiteRepository;
import com.yuansen.project.service.LySiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.service.impl
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 10:13
 * @Description: ${Description}
 */
@Service
public class LySiteServiceImpl implements LySiteService {
    @Autowired
    private LySiteRepository repository;
    @Override
    public LySite findOne(Integer id){
        return repository.findById(id).orElse(null);
    }
    @Override
    public List<LySite> findAll(){
        return repository.findAll();
    }
    @Override
    public LySite save(LySite lySite){
        return repository.save(lySite);
    }
    @Override
    public void deleteById(Integer id){
        repository.deleteById(id);
    }

}
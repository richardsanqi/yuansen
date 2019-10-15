package com.yuansen.project.service;

import com.yuansen.project.dataobject.LySite.LySite;

import java.util.List;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.service
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 10:12
 * @Description: ${Description}
 */
public interface LySiteService {
    LySite findOne(Integer id);
    List<LySite> findAll();

    LySite save(LySite lySite);
    void deleteById(Integer id);
}

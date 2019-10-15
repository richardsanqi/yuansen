package com.yuansen.project.dataobject.LySite;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.dataobject.LySite
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 08:45
 * @Description: ${Description}
 */
@Entity
@Data
@DynamicUpdate
public class LySite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    站点id
    private Integer id;
    //    站点
    private String site;
    //    站点描述
    private  String sitedescription;
    //    创建用户
    private String byuser;
    //    站点名称
    private String sitename;
    //    站点创建时间
//    private Date createTime;
//    站点状态
    private Integer state;
    public LySite(){
    }

    public LySite(String site, String sitedescription,String byuser ,String sitename, Integer state) {
        this.site = site;
        this.sitedescription = sitedescription;
        this.byuser=byuser;
        this.sitename = sitename;
        this.state = state;
    }
}
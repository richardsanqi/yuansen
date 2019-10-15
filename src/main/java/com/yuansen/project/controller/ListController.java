package com.yuansen.project.controller;

import com.yuansen.project.dataobject.LySite.LySite;
import com.yuansen.project.service.LySiteService;
import com.yuansen.project.utils.LayUiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.controller
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 14:24
 * @Description: ${Description}
 */
@Controller
public class ListController {
        @Autowired
    LySiteService lySiteService;
       @RequestMapping("list")
       public String list() {
           return "index3";
      }

        @RequestMapping("query")
        @ResponseBody
        public LayUiResponse getlist()
        {
            List<LySite> list=lySiteService.findAll();
            LayUiResponse layuiResponse = new LayUiResponse();
            layuiResponse.setData(list);
            layuiResponse.setCount(list.size());
            return layuiResponse;
        }
    @RequestMapping("workshop/list")
    public String lysitelist() {
        return "fragment/laiuibody";
    }
}



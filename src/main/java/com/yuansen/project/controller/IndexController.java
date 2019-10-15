package com.yuansen.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.controller
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 08:52
 * @Description: ${Description}
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}


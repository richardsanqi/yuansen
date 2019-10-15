package com.yuansen.project.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: yuansen
 * @BelongsPackage: com.yuansen.project.utils
 * @Author: 里皮不爱吃香菜
 * @CreateTime: 2019-10-14 19:50
 * @Description: ${Description}
 */
@Data
public class LayUiResponse implements Serializable {
    private int code = 0;
    private String msg = "";
    private long count;
    private Object data;

    @Override
    public String toString() {
        return "LayuiResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}

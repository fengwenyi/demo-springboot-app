package com.fengwenyi.demo_springboot_app.common.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * 公共Bean，数据校验封装
 * @author Erwin Feng
 * @since 2019/8/29 16:55
 */
@Getter
@Setter
public class DataCheckBean<T> implements Serializable {

    private static final long serialVersionUID = -3238157355839921246L;

    /** 数据 */
    private T data;

    /**
     * 需要校验的数据
     * 如：设备编号，校验IP，校验MAC等等
     * */
    private Map<String, Object> checkMap;

    /**
     * 请求相关的数据
     * 如：请求IP，请求时间，请求URL，请求参数等等
     */
    private Map<String, Object> otherData;

}

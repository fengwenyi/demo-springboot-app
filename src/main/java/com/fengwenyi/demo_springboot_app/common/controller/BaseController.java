package com.fengwenyi.demo_springboot_app.common.controller;

import com.fengwenyi.demo_springboot_app.component.base.LibDate;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.util.HtmlUtils;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Erwin Feng
 * @since 2019/8/29 17:25
 */
public class BaseController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
        binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(text == null ? null : HtmlUtils.htmlEscape(text.trim()));
            }

            @Override
            public String getAsText() {
                Object value = getValue();
                return value != null ? value.toString() : "";
            }
        });

        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(LibDate.parseDate(text));
            }
        });

        // Timestamp 类型转换
        binder.registerCustomEditor(Timestamp.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                Date date = LibDate.parseDate(text);
                setValue(date == null ? null : new Timestamp(date.getTime()));
            }
        });
    }

}

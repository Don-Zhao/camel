package com.camel.config;

import com.camel.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

public class LogFilterRegistrationBean extends FilterRegistrationBean<LogFilter> {
    public LogFilterRegistrationBean() {
        super();
        this.setFilter(new LogFilter());
        this.addUrlPatterns("/*");
        this.setName("logFilter");
        this.setOrder(1);
    }
}

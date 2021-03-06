package com.zuicoding.platform.blog.core;

import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * Created by Stephen.lin on 2017/6/15.<br/>
 * Description : <p></p>
 **/
@Configuration
public class VelocityConfig {

    @Bean(name="velocityViewResolver")
    public VelocityLayoutViewResolver createVelocityLayoutViewResolver(VelocityProperties properties){
        VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver();
        resolver.setPrefix(properties.getPrefix());
        resolver.setSuffix(properties.getSuffix());
        resolver.setDateToolAttribute(properties.getDateToolAttribute());
        resolver.setNumberToolAttribute(properties.getNumberToolAttribute());
        resolver.setContentType(properties.getContentType().toString());
        resolver.setExposeSpringMacroHelpers(properties.isExposeSpringMacroHelpers());
        resolver.setExposeRequestAttributes(properties.isExposeRequestAttributes());
        resolver.setRequestContextAttribute(properties.getRequestContextAttribute());
        resolver.setLayoutUrl("/WEB-INF/pages/layout/layout.vm");

        return resolver;
    }
}

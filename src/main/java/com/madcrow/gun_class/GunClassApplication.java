package com.madcrow.gun_class;

import com.madcrow.gun_class.Controllers.UploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.io.File;
import java.util.Locale;

@SpringBootApplication
public class GunClassApplication {

    public static void main(String[] args)
    {
        new File(UploadController.userUploadDirectory).mkdir();
        new File(UploadController.postUploadDirectory).mkdir();
        SpringApplication.run(GunClassApplication.class, args);
    }

    @Bean
    public LocaleResolver localeResolver()
    {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

}

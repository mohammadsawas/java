package com.memorynotfound.mail.confugration;

import com.memorynotfound.mail.Application;
import com.memorynotfound.mail.service.EmailService;
import com.memorynotfound.mail.model.Mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfugriation {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private EmailService emailService;

    @Bean
    ApplicationRunner applicationRunner() throws Exception{
        return applicationArguments -> {
            log.info("Spring Mail - Sending Email with Inline Attachment Example");

            Mail mail = new Mail();
            mail.setFrom("no-reply@memorynotfound.com");
            mail.setTo("mohammad.sawas2016@gmail.com");
            mail.setSubject("Sending Email with Inline Attachment Example");
            mail.setContent("welcome bro");

            emailService.sendSimpleMessage(mail);
        };
    }
}

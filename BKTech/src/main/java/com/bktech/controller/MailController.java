package com.bktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bktech.dto.MailDto;
import com.bktech.service.MailService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MailController {
	
	private final MailService mailService;

    @GetMapping("/mail")
    public String dispMail() {
        return "contact";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto) {
        mailService.mailSend(mailDto);
    }

}

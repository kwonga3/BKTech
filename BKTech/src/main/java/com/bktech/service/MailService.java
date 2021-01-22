//package com.bktech.service;
//
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//import com.bktech.dto.MailDto;
//
//import lombok.AllArgsConstructor;
//
//@Service
//@AllArgsConstructor
//public class MailService {
//
//	private JavaMailSender mailSender;
//    private static final String FROM_ADDRESS = "kwonga3@naver.com";
//
//    public void mailSend(MailDto mailDto) {
//    	SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(mailDto.getAddress());
//        message.setFrom(MailService.FROM_ADDRESS);
//        message.setSubject(mailDto.getSubject());
//        message.setText(mailDto.getMessage());
//
//        mailSender.send(message);
//    }
//}

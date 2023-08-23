//package com.demo.controlller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.services.EmailService;
//
//@RestController
//@RequestMapping("/api")
//public class EmailController {
//
//	@Autowired
//    private EmailService emailService;
//
////    @Autowired
////    public EmailController(EmailService emailService) {
////        this.emailService = emailService;
////    }
//
////    @PostMapping("/send/{to}/{subject}/{text}")
////    public void sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
////        emailService.sendEmail(to, subject, text);
////    }
//    
////    @PostMapping("/send/{to}/{subject}/{text}")
////    public void sendEmail(@PathVariable String to, @PathVariable String subject, @PathVariable String text) {
////        emailService.sendEmail(to, subject, text);
////    }
//	
//    
//    @PostMapping("/send/{to}")
//    public void sendEmail(@PathVariable String to) {
//    	String subject = "Test Mail";
//    	String msg = "Hi...";
//        emailService.sendEmail(to, subject,msg );
//    }
//	
//}
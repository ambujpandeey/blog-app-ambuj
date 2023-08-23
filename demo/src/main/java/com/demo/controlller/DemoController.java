package com.demo.controlller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class DemoController {

	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@PostMapping("/userData")
	public ResponseEntity<?> uploadImageWithJson(@RequestParam("file") MultipartFile file,
			@RequestParam("user") String user) {

		this.logger.info("logger Information...");
		this.logger.info("file Info: {} ", file);
		this.logger.info(" User Details: {} ", user);

		return ResponseEntity.ok(user);
	}

	@PostMapping("/uploadMultipleFile")
	public ResponseEntity<?> uploadMultipleFile(@RequestParam("files") MultipartFile[] files) {

		this.logger.info("No of file uploaded: {} ", files.length);

		return ResponseEntity.ok("files uploaded successfully");
	}
}

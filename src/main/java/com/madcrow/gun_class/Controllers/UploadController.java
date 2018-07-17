package com.madcrow.gun_class.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class UploadController {

    public static String userUploadDirectory = System.getProperty("user.dir")+"/images_post_uploads/";
    public static String postUploadDirectory = System.getProperty("user.dir")+"/images_user_uploads/";

    @RequestMapping(value = "user/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadUserImage(@RequestParam("file")MultipartFile file) throws IOException {

        File contentFile = new File(userUploadDirectory + file.getOriginalFilename());
        contentFile.createNewFile();
        FileOutputStream fileOut = new FileOutputStream(contentFile);
        fileOut.write(file.getBytes());
        fileOut.close();
        return new ResponseEntity<>("file is uploaded successfully", HttpStatus.OK);
    }


    @RequestMapping(value = "post/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadPostImage(@RequestParam("file")MultipartFile file) throws IOException {

        File contentFile = new File(postUploadDirectory + file.getOriginalFilename());
        contentFile.createNewFile();
        FileOutputStream fileOut = new FileOutputStream(contentFile);
        fileOut.write(file.getBytes());
        fileOut.close();
        return new ResponseEntity<>("file is uploaded successfully", HttpStatus.OK);
    }
}

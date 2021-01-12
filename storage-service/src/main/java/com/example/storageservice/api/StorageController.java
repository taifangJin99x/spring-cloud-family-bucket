package com.example.storageservice.api;

import com.example.storageservice.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.storageservice.api-> StorageController
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:21
 * @version: 1.0
 * @todo:
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    StorageService storageService;

    @GetMapping("/getStorage")
    public String getStorage() {

        return storageService.selectOne();
    }
    @GetMapping("/test")
    public String test() {
        log.info("TEST");
        return storageService.selectOne();
    }
}

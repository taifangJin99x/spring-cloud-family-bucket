package com.example.storageservice.service;

import com.example.storageservice.repository.StorageDao;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: com.example.storageservice.service-> StorageService
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:22
 * @version: 1.0
 * @todo:
 */
@Service
public class StorageService {
    @Autowired
    StorageDao storageDao;
    public String selectOne() {
       return storageDao.selectById("1").toString();

    }
}

package com.example.storageservice.repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.storageservice.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @className: com.example.storageservice.repository-> StorageMapper
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:23
 * @version: 1.0
 * @todo:
 */
@Mapper
@Repository
public interface StorageDao extends BaseMapper<Storage> {
}

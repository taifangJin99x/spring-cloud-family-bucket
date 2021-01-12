package com.example.storageservice.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @className: com.example.storageservice.entity-> Storage
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:18
 * @version: 1.0
 * @todo:
 */
@Data
@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage {
    private Long id;
    private String commodityCode;
    private Long count;
}

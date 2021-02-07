package com.xin.springcloud.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class DiscussPost {

    private int id;

    private int userId;

    private String title;

    private String content;

    private int type;

    private int status;

    private Date createTime;

    private int commentCount;

        private double score;
}

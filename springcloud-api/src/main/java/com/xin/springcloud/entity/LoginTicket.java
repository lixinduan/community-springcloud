package com.xin.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;

}

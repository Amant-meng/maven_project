package com.ym.entity.message;

import lombok.Data;

import java.util.Date;

@Data
public class TextMessage {
    //开发者微信号
    private String toUserName;
    //发送方帐号（一个OpenID）
    private String fromUserName;
    //消息创建时间 （整型）
    private Date createTime;
    //消息类型，文本为text
    private String msgType;
    //文本消息内容
    private String content;
    //消息id，64位整型
    private String msgId;
}

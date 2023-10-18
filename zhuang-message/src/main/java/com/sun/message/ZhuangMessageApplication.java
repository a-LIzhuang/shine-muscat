package com.sun.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ZhuangMessageApplication {

    public static void main(String[] args){
        SpringApplication.run(ZhuangMessageApplication.class,args);
        System.out.println("ஐﾞ*^O^*ﾞஐ  认证授权中心启动成功   ஐﾞ╭(╯ε╰)╮ﾞஐ  \n" +
                "   ,--,            \n" +
                ",---.'|            \n" +
                "|   | :      ,---, \n" +
                ":   : |   ,`--.' | \n" +
                "|   ' :   |   :  : \n" +
                ";   ; '   :   |  ' \n" +
                "'   | |__ |   :  | \n" +
                "|   | :.'|'   '  ; \n" +
                "'   :    ;|   |  | \n" +
                "|   |  ./ '   :  ; \n" +
                ";   : ;   |   |  ' \n" +
                "|   ,/    '   :  | \n" +
                "'---'     ;   |.'  \n" +
                "          '---'   ");
    }

}

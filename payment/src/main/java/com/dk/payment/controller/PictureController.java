package com.dk.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: TODO
 * @Author dk
 * @Date 2020/4/13 20:41
 **/
@RestController
@Slf4j
public class PictureController {

    private String url="G:/geogleDown/test2.png";

    /**
     * IO流读取图片 by:long
     * @return
     */
    @RequestMapping(value = "/getimg", method = RequestMethod.GET)
    public String IoReadImage( HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        ServletOutputStream out = null;
        log.info("start.................................");
        long t1=System.currentTimeMillis();
        FileInputStream ips = null;
        try {
            //获取图片存放路径
            String imgPath =url;
            ips = new FileInputStream(new File(imgPath));
            response.setContentType("multipart/form-data");
            out = response.getOutputStream();
            //读取文件流
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = ips.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
            out.flush();
            long t2=System.currentTimeMillis();
            log.info("end................................."+(t2-t1));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            out.close();
            ips.close();
        }

        return null;
    }


    /**
     * IO流读取图片 by:long
     * @return
     */
    @RequestMapping(value = "/getimg1", method = RequestMethod.GET)
    public String IoReadImage1( HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        ServletOutputStream out = null;
        log.info("start.................................");
        long t1=System.currentTimeMillis();
        FileInputStream ips = null;
        try {
            //获取图片存放路径
            String imgPath =url;
            ips = new FileInputStream(new File(imgPath));
            response.setContentType("multipart/form-data");
            out = response.getOutputStream();
            //读取文件流
            int len = 0;
            byte[] buffer = new byte[1024 * 10 *2];
            while ((len = ips.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
            out.flush();
            long t2=System.currentTimeMillis();
            log.info("end11................................."+(t2-t1));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            out.close();
            ips.close();
        }

        return null;
    }
}

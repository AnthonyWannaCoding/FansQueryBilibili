package com.anthony.fansQueryBilibili.service;

import com.alibaba.fastjson.JSONObject;
import com.anthony.fansQueryBilibili.config.HttpUtils;
import com.anthony.fansQueryBilibili.entity.FansQueryEntity;
import com.anthony.fansQueryBilibili.entity.JsonTest;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class FansQueryService {

    @Resource
    private MailService mailService;
    public void fansQuery() throws Exception {

        String vmid = "484734287";
        String host = "https://api.bilibili.com/x/relation/stat?vmid="+vmid+"&jsonp=jsonp";
        String path = "";
        String method = "get";
        HashMap<String,String> headers = new HashMap<>();
        HashMap<String,String> querys = new HashMap<>();

        HttpResponse httpResponse=HttpUtils.doGet(host, path, method, headers, querys);

        System.out.println("HttpResponse"+httpResponse);

        if(httpResponse.getStatusLine().getStatusCode()==200){
            System.out.println("Successful");

            String s = EntityUtils.toString(httpResponse.getEntity());
            System.out.println(s+"s");

            JsonTest person = JSONObject.parseObject(s,JsonTest.class);

            for (FansQueryEntity datum : person.getData()){
                System.out.println("fans:"+datum.getFollower());

                if (!(datum.getFollower()==null)){
                    String to="1306437455@qq.com";
                    String subject="follower is updating";
                    String content= datum.getFollower();
                    mailService.send(to,subject,content);
                }
            }
        }
    }
}

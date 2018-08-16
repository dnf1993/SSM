package com.zhouwen.main.get.controller;

import com.zhouwen.main.common.utils.spring.ApplicationContextUtil;
import com.zhouwen.main.get.service.WebMagicEntryService;
import com.zhouwen.main.get.webmagic.WebMagicPageProcessor;
import com.zhouwen.main.get.webmagic.WebMagicPipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.codecraft.webmagic.Spider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * @ClassName WebMagicEntryController
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/14 14:05
 */
@RequestMapping("/webmagic/entry")
@Controller
public class WebMagicEntryController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private WebMagicEntryService webMagicEntryService;

   /* @RequestMapping("start")
    @ResponseBody
    public void startWebMagic(){
        TbWebmagicConfigure conf = new TbWebmagicConfigure();
        conf.setType("WEBMAGIC_START_URL");
        conf.setName("webmagic_start_url");
        String URL = "";
        List<TbWebmagicConfigure> list = webMagicEntryService.getWebMagicConfigureByCondition(conf);
        if(list.size()!=1){
            logger.error("爬虫地址配置错误");
        }else {
            URL = list.get(0).getValue();
        }
        WebMagicPipline pipline = ApplicationContextUtil.getBean(WebMagicPipline.class);
        Spider.create(new WebMagicPageProcessor()).addUrl(URL).addPipeline(pipline).thread(5).run();
    }*/
}

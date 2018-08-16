package com.zhouwen.main.get.service.impl;

import com.zhouwen.main.get.service.WebMagicEntryService;
import com.zhouwen.main.get.webmagic.WebMagicPageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

/**
 * @ClassName WebMagicEntryServiceImpl
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/14 14:07
 */
@Service
public class WebMagicEntryServiceImpl implements WebMagicEntryService {


    /*@Autowired
    TbWebmagicConfigureMapper configureMapper;

   *//**
     * 条件运行webmagic
     * @param tbWebmagicConfigure ----获取地址
     * @param pipline ----------------数据的存储
     *//*
    @Override
    public void runWebMagic(TbWebmagicConfigure tbWebmagicConfigure, Object pipline) {
        String URL = tbWebmagicConfigure.getValue();
        Pipeline pip = (Pipeline)pipline;
        Spider.create(new WebMagicPageProcessor()).addUrl(URL).addPipeline(pip).thread(5).run();
    }

    *//**
     * 条件查询配置列表
     * @param conf
     * @return
     *//*
    @Override
    public List<TbWebmagicConfigure> getWebMagicConfigureByCondition(TbWebmagicConfigure conf) {
        List<TbWebmagicConfigure> list = configureMapper.selectByExample(conf);
        return list;
    }*/
}

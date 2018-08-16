package com.zhouwen.main.get.webmagic;

import com.zhouwen.main.common.utils.spring.ApplicationContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Map;

/**
 * @ClassName WebMagicPipline
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/14 16:25
 */
public class WebMagicPipline implements Pipeline {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void process(ResultItems resultItems, Task task) {
        logger.error("get page: " + resultItems.getRequest().getUrl());
        //遍历所有结果，输出到控制台，上面例子中的"author"、"name"、"readme"都是一个key，其结果则是对应的value
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            logger.error(entry.getKey() + ":\t" + entry.getValue());
        }
        //获取dao层接口
        //ApplicationContextUtil.getBean();
    }
}

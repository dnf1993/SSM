package com.zhouwen.main.get.webmagic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

/**
 * @ClassName WebMagicPageProcessor
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/14 14:58
 */
public class WebMagicPageProcessor implements PageProcessor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
        String s = page.getHtml().xpath("//*[@id=\"turnRed\"]/div/ul").toString();
        logger.error(s);
        String s1 = page.getHtml().xpath("//*[@id=\"turnRed\"]/div/ul/li[1]").toString();
        logger.error(s1);
    }

    @Override
    public Site getSite() {
        return site;
    }

}

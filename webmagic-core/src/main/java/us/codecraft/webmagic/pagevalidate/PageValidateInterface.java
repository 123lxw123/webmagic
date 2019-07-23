package us.codecraft.webmagic.pagevalidate;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;

/**
 * 验证page是否成功
 * @author jike
 */
public interface PageValidateInterface {
    /**
     * 验证请求是否成功，如果不成功就抛出异常
     * @param page 下载的数据
     * @param site 爬虫目标网站
     * @throws RuntimeException 如果验证失败则抛出异常
     */
    void validate(Page page, Site site) throws RuntimeException;
}

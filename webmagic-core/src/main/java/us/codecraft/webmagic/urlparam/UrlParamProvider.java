package us.codecraft.webmagic.urlparam;

import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;

/**
 * @author jike
 */
public interface UrlParamProvider {
    /**
     * 动态生成url
     * @param request 原始请求
     * @param task 爬虫任务
     * @return 返回新url
     */
    String getUrlWithParam(Request request, Task task);
}

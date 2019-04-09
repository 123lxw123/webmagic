package us.codecraft.webmagic.pagevalidate;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;

/**
 * @author jike
 * @date 2019-04-09
 */
public class PageStatCodeValidator implements PageValidateInterface {

    /**
     * 返回不是期望的 statusCode 时是否抛出异常
     */
    private boolean throwExceptionWhenUnacceptedStatCode;

    public PageStatCodeValidator(boolean throwExceptionWhenUnacceptedStatCode) {
        this.throwExceptionWhenUnacceptedStatCode = throwExceptionWhenUnacceptedStatCode;
    }

    @Override
    public void validate(Page page, Site site) throws RuntimeException {
        if (throwExceptionWhenUnacceptedStatCode && !site.getAcceptStatCode().contains(page.getStatusCode())) {
            throw new RuntimeException("UnacceptStatCode:" + page.getStatusCode());
        }
    }
}

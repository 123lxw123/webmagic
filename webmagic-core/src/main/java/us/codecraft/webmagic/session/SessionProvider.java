package us.codecraft.webmagic.session;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;

public interface SessionProvider {
    /**
     * Return session to Provider when complete a download.
     *
     * @param session the download session
     * @param request the download request
     * @param page    the download result
     * @param exception    the download exception
     * @param task    the download task
     */
    void returnSession(Session session, Request request, Page page, Exception exception, Task task);

    /**
     * Get a session for task by some strategy.
     *
     * @param request the download request
     * @param task    the download task
     * @return session
     */
    Session getSession(Request request, Task task);
}

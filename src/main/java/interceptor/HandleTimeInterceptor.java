package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * <p/>
 * Created by libing on 2016/9/12.
 */


/**
 * 打印 程序执行时间
 *
 * @author libing
 * @since 16/7/4 上午10:35.
 */
public class HandleTimeInterceptor implements HandlerInterceptor {
	
  private static final Logger log = LoggerFactory.getLogger(HandleTimeInterceptor.class);

  private static final String START_TIME = "start_time";

  private static final String SESSION_ID = "sessionId";

  private static final String HANDLE_TIME = "handle_time";

  public boolean preHandle(HttpServletRequest req, HttpServletResponse response, Object handler) throws Exception {
  //public boolean preHandle(HttpServletRequest req, HttpServletResponse response, Object handler) throws Exception {
    if (log.isDebugEnabled()) {
      String sessionId = req.getRequestedSessionId();
      req.setAttribute(START_TIME, System.currentTimeMillis());
      req.setAttribute(SESSION_ID, sessionId);
      //log.debug("sessionId:{}; {} URL: {}", sessionId, req.getMethod(), req.getRequestURI());
    }

    String username =  (String)req.getSession().getAttribute("username");   
    if(username == null){  
    	req.getRequestDispatcher("/WEB-INF/content/login.jsp").forward(req, response);  
        return false;  
    } else {
        return true;     
    }
    //return true;
  }

  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    if (log.isDebugEnabled()) {
      Long start = (Long) request.getAttribute(START_TIME);
      request.setAttribute(HANDLE_TIME, System.currentTimeMillis() - start);
    }
  }

  public void afterCompletion(HttpServletRequest req, HttpServletResponse response, Object handler,
      Exception ex) throws Exception {
    if (log.isDebugEnabled()) {
      String sessionId = (String) req.getAttribute(SESSION_ID);
      Long start = (Long) req.getAttribute(START_TIME);
      long end = System.currentTimeMillis();
      long span = end - start;
      log.debug("sessionId:{}; {} URL: {}; consume {}ms", sessionId, req.getMethod(),
          req.getRequestURI(), span);
    }
  }

}

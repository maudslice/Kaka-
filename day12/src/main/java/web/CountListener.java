package web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountListener
 *
 */
public class CountListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public CountListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    //session对象创建之后，容器调用该方法
    //HttpSessionEvent 事件对象
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	/**
    	 * 
    	 * 思路：通过上下文对象获取数据
    	 * 		通过session获取上下文对象
    	 * 			通过事件对象获取session
    	 */
    	HttpSession session = se.getSession();
    	System.out.println("sessionID:" + session.getId());
    	ServletContext sctx = session.getServletContext();
    	
    	Integer count = (Integer)sctx.getAttribute("count");
    	if (count == null) {
			count = 1;
		}else {
			count ++;
		}
    	sctx.setAttribute("count", count);
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("sessionDestroyed方法");
    	HttpSession session = se.getSession();
    	System.out.println("sessionID:" + session.getId());
    	ServletContext sctx = session.getServletContext();
    	Integer count = (Integer)sctx.getAttribute("count");
    	count --;//人数减一
    	sctx.setAttribute("count", count);
    }
	
}

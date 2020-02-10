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
    //session���󴴽�֮���������ø÷���
    //HttpSessionEvent �¼�����
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	/**
    	 * 
    	 * ˼·��ͨ�������Ķ����ȡ����
    	 * 		ͨ��session��ȡ�����Ķ���
    	 * 			ͨ���¼������ȡsession
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
    	System.out.println("sessionDestroyed����");
    	HttpSession session = se.getSession();
    	System.out.println("sessionID:" + session.getId());
    	ServletContext sctx = session.getServletContext();
    	Integer count = (Integer)sctx.getAttribute("count");
    	count --;//������һ
    	sctx.setAttribute("count", count);
    }
	
}

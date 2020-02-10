package web;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dao.UserDao;
import entity.User;

/**
 * Application Lifecycle Listener implementation class CacheListener
 *
 */
public class CacheListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public CacheListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("kaka!");
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	/**
    	 * ��ѯ�û��б�
    	 * �󶨵�servlet������ 
    	 * 
    	 */
    	UserDao dao = new UserDao();
    	try {
			List<User> users = dao.findAll();
			//�����ݰ���Servlet�����ģ�����������һֱ���ڶ���˭�����Է���
			ServletContext sctx = sce.getServletContext();
			sctx.setAttribute("users", users);
			System.out.println("���û���Ϣ�󶨵���Servlet������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}

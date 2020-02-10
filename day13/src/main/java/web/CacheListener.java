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
    	 * 查询用户列表
    	 * 绑定到servlet上下文 
    	 * 
    	 */
    	UserDao dao = new UserDao();
    	try {
			List<User> users = dao.findAll();
			//将数据绑定在Servlet上下文，上下文数据一直存在而且谁都可以访问
			ServletContext sctx = sce.getServletContext();
			sctx.setAttribute("users", users);
			System.out.println("将用户信息绑定到了Servlet上下文");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}

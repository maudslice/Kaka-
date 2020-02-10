package test;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
//注解方式 IOC/DI:
//@AutoAutowired
//@Resource
//@Component注解，即表明此类是bean
//效果相同，使用其中一种即可


//@Component("p")
public class Product {
	private int id;
//	因为配置从applicationContext.xml中移出来了，所以属性初始化放在属性声明上进行了。
//	private String name="product 1";
    private String name;
//  @AutoAutowired
//    @Resource(name = "c")
    private Category category;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Category getCategory() {
        return category;
    }
//  @AutoAutowired
    public void setCategory(Category category) {
        this.category = category;
    }

}

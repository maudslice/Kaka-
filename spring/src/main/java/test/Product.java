package test;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
//ע�ⷽʽ IOC/DI:
//@AutoAutowired
//@Resource
//@Componentע�⣬������������bean
//Ч����ͬ��ʹ������һ�ּ���


//@Component("p")
public class Product {
	private int id;
//	��Ϊ���ô�applicationContext.xml���Ƴ����ˣ��������Գ�ʼ���������������Ͻ����ˡ�
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

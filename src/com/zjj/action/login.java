package com.zjj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
/**
 * Created by zhaojj on 15/11/3.
 */

public class login extends ActionSupport{
    private String paytime;
    private String content;
    private float amount;
    private int payType;
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String execute(){
        money_note temp=new money_note();
        temp.setPaytime(paytime);
        temp.setAmount(amount);
        temp.setContent(content);
        temp.setPayType(payType);

        // if(username.equals("admin")&&password.equals("123456"))
        //   return "success";
        //return "fail";
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = login.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.zjj.mapping.money_noteMapping.add";//映射sql的标识字符串
        result=session.insert(statement,temp);
        session.commit();
        //执行查询返回一个唯一user对象的sql
        return "success";
    }


}

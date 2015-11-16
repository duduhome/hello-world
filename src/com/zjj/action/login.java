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
    private String num;
    private money_note result;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public money_note getResult() {
        return result;
    }

    public void setResult(money_note result) {
        this.result = result;
    }

    public String execute(){
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
        String statement = "com.zjj.mapping.money_noteMapping.getid";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        result = session.selectOne(statement, num);
        return "success";
    }


}

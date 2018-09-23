package com.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.wedding.entity.Hotel;
import com.wedding.entity.User;
import com.wedding.impl.HotelImpl;
import com.wedding.serviceImpl.HotelPageServiceImpl;
import com.wedding.serviceImpl.ServiceImpl;

public class Test {

	@org.junit.Test
	public void test() throws SQLException {
		ComboPooledDataSource pooledDataSource=new ComboPooledDataSource();
		Connection connection= pooledDataSource.getConnection();
		System.out.println(connection);
	}
	@org.junit.Test
	public void test1(){
		//�������ӳ�
		ComboPooledDataSource pool = new ComboPooledDataSource();
		//����SQLִ����
		QueryRunner runner = new QueryRunner(pool);
		try {
			//��ѯ��������,����1 SQL��䣬����2 �������Ĳ�����ʵ��������ͣ�����3 ��ռλ������
			List<User> users = (List<User>) runner.query("select * from tb_user", new BeanListHandler(User.class));
			for(User user : users){
				System.out.println("user--->"+user);
			}
			//��ѯ��������
			User user = (User) runner.query("select * from tb_user where user_id=?", new BeanHandler(User.class),1);
			System.out.println("����user--->"+user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@org.junit.Test
	public void test2(){
		ServiceImpl s=new ServiceImpl();
		User user=s.findUserByTel("222");
		System.out.println("��ѯ"+user);
	}

}

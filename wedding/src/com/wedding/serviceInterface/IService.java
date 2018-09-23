package com.wedding.serviceInterface;

import java.util.List;

import com.wedding.entity.User;

public interface IService {
	/**
	 * ��¼ҵ���߼�
	 * @param userTel
	 * @param password
	 * @return
	 */
	public User login(String userTel,String password);
	/**
	 * ע��ҵ���߼�
	 * @param user
	 */
	public void register(User user);
	/**
	 * ����
	 * @param user
	 */
	public void update(User user);
	/**
	 * ɾ��
	 * @param id
	 */
	public void delete(int id);
	/**
	 * ͨ��id��ѯ�û�
	 * @param id
	 * @return
	 */
	public User findUserById(int id);
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	public List<User> findAllUsers();
	
	public User findUserByTel(String user_tel);
}
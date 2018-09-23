package com.wedding.DaoInterface;

import java.util.List;

import com.wedding.entity.User;

public interface DaoI {
	/**
	 * ����û�
	 * @param user
	 */
	void addUser(User user);
	/**
	 * �����û�����user_idΪ���������������ֶ�
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * ɾ���û�
	 * @param user_id
	 */
	void deleteUser(int user_id);
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	List<User> selectAllUsers();
	/**
	 * ͨ��id��ѯ�û�
	 * @param user_id
	 * @return
	 */
	User selectUserById(int user_id);
	/**
	 * ͨ���绰��ѯ�û�
	 * @param user_tel
	 * @return
	 */
	User selectUserByTel(String user_tel);
}

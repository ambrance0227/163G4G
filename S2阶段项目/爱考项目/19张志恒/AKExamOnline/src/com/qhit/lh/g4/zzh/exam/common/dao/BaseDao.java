/**
 * 
 */
package com.qhit.lh.g4.zzh.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.g4.zzh.exam.common.utils.HibernateSessionFactory;

/**
 * @author 张志恒
 * TODO
 * 2017年12月29日上午11:09:24
 */
public class BaseDao {
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}

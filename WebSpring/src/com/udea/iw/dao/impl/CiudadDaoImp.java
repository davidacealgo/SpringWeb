package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Criteria;
import com.udea.iw.dto.Ciudad;
import com.udea.iw.exception.Exceptions;

public class CiudadDaoImp {
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Ciudad> obtener() throws Exceptions{ 
		
		List<Ciudad> lista = new ArrayList<Ciudad>();
		Session session = null;
		
		try{
			session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			lista = criteria.list();
		}catch(HibernateException e){
			throw new Exceptions("Error consultando ciudades",e);
		}
		return lista;
	} 
	
	/*Metodo Largo
	public Ciudad obtener(long codigo) throws Exceptions{
		
		Ciudad ciudad = new Ciudad();
		Session session = null;
		
		try{
			session = DataSource.getInstance().getSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			criteria.add(Restrictions.eq("codigo", codigo));	//Condición de consultas
			ciudad =  (Ciudad)criteria.uniqueResult(); 	//Se hace casting para volver tipo ciudad y debe devolver un unico resultado
		}catch(HibernateException e){
			throw new Exceptions("Error consultando ciudad",e);
		}
		return ciudad;
	}*/
	
		public Ciudad obtener(long codigo) throws Exceptions{
				Ciudad ciudad = new Ciudad();
				Session session = null;
				try{
					session = sessionFactory.getCurrentSession();
					ciudad = (Ciudad)session.load(Ciudad.class, codigo);	//load retorna una excepcion si no lo encuentra
					//ciudad = (Ciudad)session.get(Ciudad.class, codigo);   //get retorna null si no lo encuentra
				}catch(HibernateException e){
					throw new Exceptions("Error consultando ciudad",e);
				}
				return ciudad;
		}
		
		public void guardar(Ciudad ciudad) throws Exceptions{
			Session session = null;
			try{
				session = sessionFactory.getCurrentSession();
				session.saveOrUpdate(ciudad);
			}catch(HibernateException e){
				throw new Exceptions("Error al realizar la transacción",e);
			}
		}
		
		public void borrar(Ciudad ciudad) throws Exceptions{
			Session session = null;
			try{
				session = sessionFactory.getCurrentSession();
				session.delete(ciudad);
			}catch(HibernateException e){
				throw new Exceptions("Error al realizar la transacción",e);
			}
		}
		
		
 }

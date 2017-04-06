package com.udea.iw.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.iw.dao.impl.CiudadDaoImp;
import com.udea.iw.dto.Ciudad;
import com.udea.iw.exception.Exceptions;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional	//
@ContextConfiguration(locations = "classpath:BeanConfigurationFile.xml")	//Archivo de configuracion de xml
public class CiudadDaoTest {
	@Autowired //facilita la inyeccion en spring y inicializa la variable
	CiudadDaoImp ciudad = null;
	@Test
	public void testObtener() { //Test para el metodo obtener()
			List<Ciudad> lista = null; //Se guarda el query
			try {
				lista = ciudad.obtener();
				assertTrue(lista.size()>0);  //Envia solo si la lista tiene datos
			}catch(Exceptions e) {
				e.printStackTrace(); //Envia el error 
				fail(e.getMessage());  //Mensaje de error
			}
		}

}

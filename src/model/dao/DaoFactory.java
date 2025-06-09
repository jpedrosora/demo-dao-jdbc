package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
//classe que ira conter operações estaticas para implementar os daos
	
	//a classe ira expor um metodo que retorna o tipo da interface, mas internamente instanciara a implementação
	//protege a implementacao e deixa somente a interface
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
	
	
}

package dao;

import java.util.List;

import domain.PointBean;

public class ShapeDAOImpl implements ShapeDAO{
	public static ShapeDAO instance = new ShapeDAOImpl();
	public static ShapeDAO getInstance() {
		return instance;
	}
	private ShapeDAOImpl() {}

	@Override
	public List<PointBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	

}


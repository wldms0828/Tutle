package dao;

import java.util.List;

import domain.UnitBean;

public class StarcraftDAOImpl implements StarcraftDAO{
	public static StarcraftDAO instance = new StarcraftDAOImpl();
	public static StarcraftDAO getInstance() {
		return instance;
	}
	private StarcraftDAOImpl() {}


	@Override
	public List<UnitBean> listUnit() {
		// TODO Auto-generated method stub
		return null;
	}

}

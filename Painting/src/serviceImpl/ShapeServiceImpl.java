package serviceImpl;
import domain.PointBean;
import java.util.List;

import dao.ShapeDAOImpl;
import service.ShapeService;
import java.util.ArrayList;
public class ShapeServiceImpl implements ShapeService{
	public static ShapeService instance = new ShapeServiceImpl();
	public static ShapeService getInstance() {
		return instance;
	}
	private ShapeServiceImpl() {}
	@Override
	public List<PointBean> list() {
		
		return ShapeDAOImpl.getInstance().list();
	}
	
	
}

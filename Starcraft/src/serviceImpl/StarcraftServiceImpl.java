package serviceImpl;
import java.util.ArrayList;
import java.util.List;
import domain.UnitBean;
import service.*;
public class StarcraftServiceImpl implements StarcraftService{
	List<UnitBean> unit ;
	public StarcraftServiceImpl() {
		unit = new ArrayList<>();
	}
	public List<UnitBean> listUnit() {
		return unit;
	}
}

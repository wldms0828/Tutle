package dao;

public class TvDAOImpl implements TvDAO {
	public static TvDAO instance = new TvDAOImpl();
	public static TvDAO getInstance() {
		return instance;
	}
	private TvDAOImpl() {}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String channelUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String channelDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String text(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return null;
	}

}

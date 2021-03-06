package serviceImpl;
import service.TvService;
import domain.CaptionTvBean;
public class TvServiceImpl implements TvService{
	CaptionTvBean tv;
	public TvServiceImpl() {
		tv = new CaptionTvBean();
	}
	@Override
	public void powerOn() {
		tv.setPower(true);
		
	}

	@Override
	public void powerOff() {
		tv.setPower(false);

	}

	@Override
	public String channelUp() {
		String cu = "";
		tv.setChannel(tv.getChannel()+1);
		return cu="채널이"+tv.getChannel() +"변경되었습니다.";
	}

	@Override
	public String channelDown() {
		//tv.setChannel();
		return String.valueOf(tv.getChannel());
	}
	@Override
	public String text(String t) {
		tv.setText(t);
		return t;
	}
	@Override
	public String result() {
		String res = "[ 채널은 " + tv.getText() + tv.getChannel() + "번 입니다. ]";
		return res;
	}
	
}

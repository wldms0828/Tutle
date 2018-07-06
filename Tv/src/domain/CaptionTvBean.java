package domain;

public class CaptionTvBean extends TvBean{
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "CaptionTvBean [text=" + text + ", power=" + power + ", channel=" + channel + "]";
	}

	
	
}

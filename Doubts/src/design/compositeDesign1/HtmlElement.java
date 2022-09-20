package design.compositeDesign1;
//
public class HtmlElement extends HtmlTag{

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	public HtmlElement(String tagName){
		this.tagName=tagName;
		this.startTag="";
		this.endTag="";
		this.tagBody="";
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getStartTag() {
		return startTag;
	}

	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}

	public String getEndTag() {
		return endTag;
	}

	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}

	public String getTagBody() {
		return tagBody;
	}

	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	@Override
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	}
	
}

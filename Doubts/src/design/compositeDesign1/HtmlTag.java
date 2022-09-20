package design.compositeDesign1;

import java.util.List;

import design.compositeDesign1.HtmlTag;

public abstract class HtmlTag {
// we need tag Name, setStartTag
	public abstract void generateHtml();
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void addChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void removeChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public List<HtmlTag>getChildren(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
}

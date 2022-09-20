package design.compositeDesign1;

import java.util.ArrayList;
import java.util.List;

import design.compositeDesign1.HtmlTag;

public class HtmlParentElement extends HtmlTag{

	private String tagName;
	private String startTag; 
	private String endTag;
	private List<HtmlTag>childrenTag;
	
	public HtmlParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<HtmlTag>();
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
	public List<HtmlTag> getChildrenTag() {
		return childrenTag;
	}
	public void setChildrenTag(List<HtmlTag> childrenTag) {
		this.childrenTag = childrenTag;
	}
	
	@Override
	public void addChildTag(HtmlTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	@Override
	public void removeChildTag(HtmlTag htmlTag){
		childrenTag.remove(htmlTag);
	}
	
	
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}
	
}

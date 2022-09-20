package design.compositeDesign1;

import design.compositeDesign1.HtmlParentElement;
import design.compositeDesign1.HtmlTag;

//HtmlTag is being extended from HtmlElement and HtmlParentElement
public class TestCompositePattern {
	public static void main(String[] args) {
//parentElement is having only the children tag and not the tagBody
		HtmlTag parenthtmltag = new HtmlParentElement("<html>");
		parenthtmltag.setStartTag("<html>");
		parenthtmltag.setEndTag("</html>");
		HtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		parenthtmltag.addChildTag(p1);
		HtmlTag tag1 = new HtmlElement("<p>");
		tag1.setStartTag("<p>");
		tag1.setEndTag("</p>");
		tag1.setTagBody("this is first para");
		p1.addChildTag(tag1);
		HtmlTag tag2 = new HtmlElement("<p>");
		tag2.setStartTag("<p>");
		tag2.setEndTag("</p>");
		tag2.setTagBody("This is second para");
		p1.addChildTag(tag2);
		parenthtmltag.generateHtml();
		
	}
}

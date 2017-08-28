package com.usedmarket.web.command;
import lombok.Data;

@Data
public class Command implements Commandable {
	protected String dir, action, page, view;

	@Override
	public void process() {
		this.view="/WEB-INF/view/"+dir+"/"+page+".jsp";
	}
	

}

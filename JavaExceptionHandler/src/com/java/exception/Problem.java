package com.java.exception;

import java.io.Serializable;

public class Problem  implements Serializable {
   private static final long serialVersionUID = 1L;

   private String type = "about:blank";

   private String title;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

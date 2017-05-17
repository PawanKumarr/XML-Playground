package com.pawan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Duke {
	private String language;
	private int age;
	
	public Duke(String language, int age) {
		super();
		this.language = language;
		this.age = age;
	}

	public Duke() {
		super();
	}

	@Override
	public String toString() {
		return "Duke [language=" + language + ", age=" + age + "]";
	}
	
}

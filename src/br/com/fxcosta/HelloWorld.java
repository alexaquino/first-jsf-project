package br.com.fxcosta;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1l;
	
	private String name;

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param nome
	 */
	public void setName(String name) {
		this.name = name;
	}
}

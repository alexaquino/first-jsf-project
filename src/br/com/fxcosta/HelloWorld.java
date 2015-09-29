package br.com.fxcosta;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloBean")
@RequestScoped
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1l;
	
	public String name;

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

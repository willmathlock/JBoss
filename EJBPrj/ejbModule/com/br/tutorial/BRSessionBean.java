package com.br.tutorial;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class BRSessionBean {

	public String BRSessionBeanMethod() {
		return "BRSessionBeanMethod executed...";
	}
}

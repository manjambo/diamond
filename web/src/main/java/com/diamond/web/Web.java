/**
 * 
 */
package com.diamond.web;

import com.diamond.control.Control;
import com.diamond.model.Model;

/**
 * @author mark
 *
 */
public class Web {
	public void show(final String web){
		Model model = new Model();
		Control control = new Control();
		
		model.lookup(web+".model");
		control.control(web+".control");
	}
}

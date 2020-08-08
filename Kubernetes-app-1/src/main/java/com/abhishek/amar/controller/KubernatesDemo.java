/**
 * 
 */
package com.abhishek.amar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abhishek Amar
 *
 */
@RestController
@RequestMapping("/kubernates")
public class KubernatesDemo {
	@GetMapping("/demo")
	public String show() {
		return "hello world";
	}
}

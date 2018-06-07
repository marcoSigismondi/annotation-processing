package com.sigismondi.marco.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ToString {
	
	STYLE style() default STYLE.JSON;

	public enum STYLE{
		STANDARD, JSON;
	}
}

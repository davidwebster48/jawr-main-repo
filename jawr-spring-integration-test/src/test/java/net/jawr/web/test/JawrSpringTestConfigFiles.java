package net.jawr.web.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.TYPE} )
public @interface JawrSpringTestConfigFiles{

	String webXml();
	
	String jawrConfig();
	
	String dispatcherServletConfig();
	
}


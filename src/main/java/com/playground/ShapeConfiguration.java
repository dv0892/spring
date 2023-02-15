package com.playground;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ShapeConfiguration {
	
	@Bean(name="triangleBean" )
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Triangle triangle() {
		Triangle triangle = new Triangle();
		triangle.setType(point());
		triangle.setType("triangleEqu");
		return triangle;
	}
	
	@Bean(name="triangleBean1" )
	public Triangle triangle1() {
		Triangle triangle = new Triangle();
		triangle.setType(point());
		triangle.setType("triangleEqu1");
		return triangle;
	}
	
	
	@Bean
	public Point point() {
		Point point = new Point();
		point.x = point.y = 1;
		return point;
	}
	
	

}

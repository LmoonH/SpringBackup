package com.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	//외부에서 만든 chef를 사용하는 것이다. 
	@Setter(onMethod_=@Autowired)
	private Chef chef;

}

package com.api.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1147346348267270128L;
	private String jwttoken;



	
}

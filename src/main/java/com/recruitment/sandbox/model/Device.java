package com.recruitment.sandbox.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by David Tomcik on 28.07.2021.
 */
@Builder
@Getter
@Setter
public class Device {

	private String id;
	private String name;
	private boolean mobile;
	private BigDecimal price;
}

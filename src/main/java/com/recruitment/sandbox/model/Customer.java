package com.recruitment.sandbox.model;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by David Tomcik on 28.07.2021.
 */
@Builder
@Getter
@Setter
public class Customer {

	private String id;
	private String name;
	private List<Device> devices;

}

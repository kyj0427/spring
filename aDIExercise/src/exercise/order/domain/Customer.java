package exercise.order.domain;

import lombok.Data;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor

@Data 		//setter,getter , toString, default constructor 


public class Customer {
	
	private long id;
	private String name;
	private String address;
	private String email;



}

package com.newspringdoctor;

public class SpringDoctor {
	

		
		private int number;
		private String name;
	
		
		public SpringDoctor(String name, int number) {
		this.name = name;
		this.number = number; 
	}
		public String getName() {
			return name;
			
		}
		public int getNumber () {
			return number;
					
		}
		public void setName(String name) {
			this.name = name;	
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
}


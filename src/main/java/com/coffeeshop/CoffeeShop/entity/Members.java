package com.coffeeshop.CoffeeShop.entity;

public class Members {

		private String userName;
		private String email;
		
		public Members() {
			
		}
		
		public Members(String userName, String email) {
			super();
			this.userName = userName;
			this.email = email;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "userName=" + userName + ", email=" + email;
		}
		
		
		
}

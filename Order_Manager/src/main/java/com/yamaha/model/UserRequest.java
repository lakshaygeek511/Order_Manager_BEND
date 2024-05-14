package com.yamaha.model;

public class UserRequest 
{
		private String username;
		private Integer usercode;
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Integer getUsercode() {
			return usercode;
		}
		public void setUsercode(Integer usercode) {
			this.usercode = usercode;
		}
		
		
		@Override
		public String toString() {
			return "UserRequest [username=" + username + ", usercode=" + usercode + "]";
		}
		
		
		public UserRequest(String username, Integer usercode) {
			super();
			this.username = username;
			this.usercode = usercode;
		}
		
		public UserRequest() {
			super();
			// TODO Auto-generated constructor stub
		}


}

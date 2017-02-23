package springboot.hello.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Users {

	@Id
	private String userId;
	
	private String username;
	
	private String password;
	
	private boolean enabled;
	
	public Users() {
		// nothing
	}
	
	public Users(String userId, String username, String password, boolean enabled) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ "]";
	}

}

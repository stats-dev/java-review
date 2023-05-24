package chap99_projects;

public class LayeredPattern {

	public class User{

		public User(String username, String password) {
			// TODO Auto-generated constructor stub
		}
		
	public class UserService {
		
	}
		
	}
	
	

	public interface UserRepository {
	    void save(User user);
	    User find(String username);
	}
	
	public class UserServiceImpl implements UserService {
	    private UserRepository userRepository;
	
	    public UserServiceImpl(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }
	
	    public void createUser(String username, String password) {
	        User user = new User(username, password);
	        userRepository.save(user);
	    }
	
	    public User findUser(String username) {
	        return userRepository.find(username);
	    }
	}

}

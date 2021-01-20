package model.UserModel;

public interface UserDAO {
    boolean saveUser(String username, String password);
    int getUserId(String username);
    User getUserByID(int id);
    User getUserByName(String username);
}

package model.UserModel;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private Timestamp createDateTime;
}

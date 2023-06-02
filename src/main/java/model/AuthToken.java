package model;

import com.google.gson.annotations.SerializedName;

public class AuthToken {
    // todo: serialized поля, согласно swagger, а также геттеры и сеттеры
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("token")
    private String token;
    public String getUsername() {
        return username;
    }


    public AuthToken() {

    }

    public AuthToken(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AuthToken(String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}


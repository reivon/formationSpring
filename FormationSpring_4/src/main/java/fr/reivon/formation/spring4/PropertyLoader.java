package fr.reivon.formation.spring4;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by reivaniel on 18/08/2016.
 */
public class PropertyLoader {

    @Value("${my.dbUrl}")
    private String dbUrl;

    private String dbLogin;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbLogin() {
        return dbLogin;
    }

    public void setDbLogin(String dbLogin) {
        this.dbLogin = dbLogin;
    }
}

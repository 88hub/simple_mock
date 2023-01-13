package org.dmtv.simple_mock;

public class Answer {
    private String account;
    private String password;

    public Answer(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}

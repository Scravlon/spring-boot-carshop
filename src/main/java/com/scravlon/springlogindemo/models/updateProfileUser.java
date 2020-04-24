package com.scravlon.springlogindemo.models;

public class updateProfileUser {
    private String oldpassword;
    private String newpassword;
    private String repassword;

    public updateProfileUser(String oldpassword, String newpassword, String repassword) {
        this.oldpassword = oldpassword;
        this.newpassword = newpassword;
        this.repassword = repassword;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}

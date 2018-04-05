package com.evio.samll2.VO;

public class UserVO {
    private String id;

    private String realname;

    private String nickname;

    private String icon;

    public UserVO() {
    }

    public UserVO(String id, String realname, String nickname, String icon) {
        this.id = id;
        this.realname = realname;
        this.nickname = nickname;
        this.icon = icon;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", realname='" + realname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}

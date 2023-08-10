package com.anthony.fansQueryBilibili.entity;

public class FansQueryEntity {

    private String mid;
    private String following;
    private String whisper;
    private String black;
    private String follower;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getWhisper() {
        return whisper;
    }

    public void setWhisper(String whisper) {
        this.whisper = whisper;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        return "FansQueryEntity{" +
                "mid='" + mid + '\'' +
                ", following='" + following + '\'' +
                ", whisper='" + whisper + '\'' +
                ", black='" + black + '\'' +
                ", follower='" + follower + '\'' +
                '}';
    }

}

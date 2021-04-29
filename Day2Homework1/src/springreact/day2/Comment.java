package springreact.day2;

public class Comment {
    private int id;
    private String profile;
    private String text;

    public Comment(int id, String profile, String text) {
        this.id = id;
        this.profile = profile;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

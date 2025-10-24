package CoupleApp;

import java.sql.Date;

public class Couple {
    private int id;
    private String email;
    private String legalName;
    private java.sql.Date birthday;
    private String profilePic;
    private String partnerEmail;
    private String status;
    private String emoji;
    private String location; // "home" or "work"
    private boolean showName;
    private boolean showBirthday;

    public Couple(String email, String legalName, String birthday, String status) {
        this.email = email;
        this.legalName = legalName;
        this.birthday = java.sql.Date.valueOf(birthday); // Converts String to java.sql.Date
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLegalName() {
        return legalName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getPartnerEmail() {
        return partnerEmail;
    }

    public String getStatus() {
        return status;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getLocation() {
        return location;
    }

    public boolean isShowName() {
        return showName;
    }

    public boolean isShowBirthday() {
        return showBirthday;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setPartnerEmail(String partnerEmail) {
        this.partnerEmail = partnerEmail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setShowName(boolean showName) {
        this.showName = showName;
    }

    public void setShowBirthday(boolean showBirthday) {
        this.showBirthday = showBirthday;
    }
}
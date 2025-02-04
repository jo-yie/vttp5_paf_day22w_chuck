package vttp5_paf_day22w_chuk.model;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Rsvp {

    private String email; 
    private String phone;
    private String confirmDate; 
    private String comments;
    public Rsvp() {
    }
    public Rsvp(String email, String phone, String confirmDate, String comments) {
        this.email = email;
        this.phone = phone;
        this.confirmDate = confirmDate;
        this.comments = comments;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getConfirmDate() {
        return confirmDate; 
    }
    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate; 
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public static Rsvp toRsvp(SqlRowSet rs) { 

        Rsvp r = new Rsvp(); 

        r.setEmail(rs.getString("email"));
        r.setPhone(rs.getString("phone"));
        r.setConfirmDate(rs.getDate("confirmation_date").toString());
        r.setComments(rs.getString("comments"));

        return r;

    }
    
}

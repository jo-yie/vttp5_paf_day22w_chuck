package vttp5_paf_day22w_chuk.utils;

public class Queries {

    public static final String SQL_GET_ALL_RSVPS =
    """
        SELECT * 
            FROM rsvp
    """;
    
    public static final String SQL_INSERT_RSVP = 
    """
        INSERT INTO rsvp (email, phone, confirmation_date, comments)
            VALUES (?, ?, ?, ?)
    """;

}

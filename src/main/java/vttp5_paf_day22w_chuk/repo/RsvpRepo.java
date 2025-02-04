package vttp5_paf_day22w_chuk.repo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp5_paf_day22w_chuk.model.Rsvp;
import vttp5_paf_day22w_chuk.utils.Queries;

@Repository
public class RsvpRepo {

    @Autowired
    private JdbcTemplate template; 

    public List<Rsvp> getAllRsvps() { 

        SqlRowSet rs = template.queryForRowSet(Queries.SQL_GET_ALL_RSVPS);
        List<Rsvp> results = new LinkedList<>(); 

        while (rs.next()) { 

            results.add(Rsvp.toRsvp(rs));

        }

        return results; 

    }

    public int insertRsvp(Rsvp rsvp) {

        return template.update(Queries.SQL_INSERT_RSVP,
            rsvp.getEmail(),
            rsvp.getPhone(),
            rsvp.getConfirmDate(),
            rsvp.getComments());

    }
    
}

package vttp5_paf_day22w_chuk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp5_paf_day22w_chuk.model.Rsvp;
import vttp5_paf_day22w_chuk.repo.RsvpRepo;

@Service
public class RsvpService {

    @Autowired
    private RsvpRepo rsvpRepo; 

    public List<Rsvp> getAllRsvps() {

        return rsvpRepo.getAllRsvps();

    }

    public int insertRsvp(Rsvp rsvp) { 

        return rsvpRepo.insertRsvp(rsvp);

    }
    
}

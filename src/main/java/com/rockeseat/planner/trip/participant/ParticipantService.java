package com.rockeseat.planner.trip.participant;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {
    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID Tripid){}

    public void triggerConfirmationEmailToParticipants(UUID tripId){}
}

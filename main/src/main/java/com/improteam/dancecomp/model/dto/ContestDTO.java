package com.improteam.dancecomp.model.dto;

import com.improteam.dancecomp.model.ContestLevel;
import com.improteam.dancecomp.model.ContestType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jury
 */
public class ContestDTO {

    private Long id;
    private ContestType contestType;
    private ContestLevel contestLevel;

    private List<JudgeDTO> judges;
    protected ContestResultDTO result;

    private List<EventParticipantDTO> leaders;
    private List<EventParticipantDTO> followers;
    private List<ParticipantsPairDTO> pairs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContestType getContestType() {
        return contestType;
    }

    public void setContestType(ContestType contestType) {
        this.contestType = contestType;
    }

    public ContestLevel getContestLevel() {
        return contestLevel;
    }

    public void setContestLevel(ContestLevel contestLevel) {
        this.contestLevel = contestLevel;
    }

    public List<JudgeDTO> getJudges() {
        return judges != null ? judges : new ArrayList<JudgeDTO>();
    }

    public void setJudges(List<JudgeDTO> judges) {
        this.judges = judges;
    }

    public ContestResultDTO getResult() {
        return result;
    }

    public void setResult(ContestResultDTO result) {
        this.result = result;
    }

    public List<EventParticipantDTO> getLeaders() {
        return leaders != null ? leaders : new ArrayList<EventParticipantDTO>();
    }

    public void setLeaders(List<EventParticipantDTO> leaders) {
        this.leaders = leaders;
    }

    public List<EventParticipantDTO> getFollowers() {
        return followers != null ? followers : new ArrayList<EventParticipantDTO>();
    }

    public void setFollowers(List<EventParticipantDTO> followers) {
        this.followers = followers;
    }

    public List<ParticipantsPairDTO> getPairs() {
        return pairs != null ? pairs : new ArrayList<ParticipantsPairDTO>();
    }

    public void setPairs(List<ParticipantsPairDTO> pairs) {
        this.pairs = pairs;
    }
}
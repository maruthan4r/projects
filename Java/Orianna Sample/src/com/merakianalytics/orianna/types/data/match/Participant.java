package com.merakianalytics.orianna.types.data.match;

import java.util.List;

import com.merakianalytics.orianna.types.data.CoreData;

public class Participant extends CoreData {
    private static final long serialVersionUID = -5475067567739256742L;
    private String currentPlatform, platform, highestTierInSeason, summonerName, matchHistoryURI, version, lane, role, currentAccountId, summonerId, accountId;
    private List<Integer> items;
    private List<RuneStats> runeStats;
    private ParticipantStats stats;
    private int summonerSpellDId, summonerSpellFId, championId, profileIconId, participantId, team, primaryRunePath, secondaryRunePath;
    private ParticipantTimeline timeline;

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Participant other = (Participant)obj;
        if(accountId == null) {
            if(other.accountId != null) {
                return false;
            }
        } else if(!accountId.equals(other.accountId)) {
            return false;
        }
        if(championId != other.championId) {
            return false;
        }
        if(currentAccountId == null) {
            if(other.currentAccountId != null) {
                return false;
            }
        } else if(!currentAccountId.equals(other.currentAccountId)) {
            return false;
        }
        if(currentPlatform == null) {
            if(other.currentPlatform != null) {
                return false;
            }
        } else if(!currentPlatform.equals(other.currentPlatform)) {
            return false;
        }
        if(highestTierInSeason == null) {
            if(other.highestTierInSeason != null) {
                return false;
            }
        } else if(!highestTierInSeason.equals(other.highestTierInSeason)) {
            return false;
        }
        if(items == null) {
            if(other.items != null) {
                return false;
            }
        } else if(!items.equals(other.items)) {
            return false;
        }
        if(lane == null) {
            if(other.lane != null) {
                return false;
            }
        } else if(!lane.equals(other.lane)) {
            return false;
        }
        if(matchHistoryURI == null) {
            if(other.matchHistoryURI != null) {
                return false;
            }
        } else if(!matchHistoryURI.equals(other.matchHistoryURI)) {
            return false;
        }
        if(participantId != other.participantId) {
            return false;
        }
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(primaryRunePath != other.primaryRunePath) {
            return false;
        }
        if(profileIconId != other.profileIconId) {
            return false;
        }
        if(role == null) {
            if(other.role != null) {
                return false;
            }
        } else if(!role.equals(other.role)) {
            return false;
        }
        if(runeStats == null) {
            if(other.runeStats != null) {
                return false;
            }
        } else if(!runeStats.equals(other.runeStats)) {
            return false;
        }
        if(secondaryRunePath != other.secondaryRunePath) {
            return false;
        }
        if(stats == null) {
            if(other.stats != null) {
                return false;
            }
        } else if(!stats.equals(other.stats)) {
            return false;
        }
        if(summonerId == null) {
            if(other.summonerId != null) {
                return false;
            }
        } else if(!summonerId.equals(other.summonerId)) {
            return false;
        }
        if(summonerName == null) {
            if(other.summonerName != null) {
                return false;
            }
        } else if(!summonerName.equals(other.summonerName)) {
            return false;
        }
        if(summonerSpellDId != other.summonerSpellDId) {
            return false;
        }
        if(summonerSpellFId != other.summonerSpellFId) {
            return false;
        }
        if(team != other.team) {
            return false;
        }
        if(timeline == null) {
            if(other.timeline != null) {
                return false;
            }
        } else if(!timeline.equals(other.timeline)) {
            return false;
        }
        if(version == null) {
            if(other.version != null) {
                return false;
            }
        } else if(!version.equals(other.version)) {
            return false;
        }
        return true;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @return the championId
     */
    public int getChampionId() {
        return championId;
    }

    /**
     * @return the currentAccountId
     */
    public String getCurrentAccountId() {
        return currentAccountId;
    }

    /**
     * @return the currentPlatform
     */
    public String getCurrentPlatform() {
        return currentPlatform;
    }

    /**
     * @return the highestTierInSeason
     */
    public String getHighestTierInSeason() {
        return highestTierInSeason;
    }

    /**
     * @return the items
     */
    public List<Integer> getItems() {
        return items;
    }

    /**
     * @return the lane
     */
    public String getLane() {
        return lane;
    }

    /**
     * @return the matchHistoryURI
     */
    public String getMatchHistoryURI() {
        return matchHistoryURI;
    }

    /**
     * @return the participantId
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the primaryRunePath
     */
    public int getPrimaryRunePath() {
        return primaryRunePath;
    }

    /**
     * @return the profileIconId
     */
    public int getProfileIconId() {
        return profileIconId;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @return the runeStats
     */
    public List<RuneStats> getRuneStats() {
        return runeStats;
    }

    /**
     * @return the secondaryRunePath
     */
    public int getSecondaryRunePath() {
        return secondaryRunePath;
    }

    /**
     * @return the stats
     */
    public ParticipantStats getStats() {
        return stats;
    }

    /**
     * @return the summonerId
     */
    public String getSummonerId() {
        return summonerId;
    }

    /**
     * @return the summonerName
     */
    public String getSummonerName() {
        return summonerName;
    }

    /**
     * @return the summonerSpellDId
     */
    public int getSummonerSpellDId() {
        return summonerSpellDId;
    }

    /**
     * @return the summonerSpellFId
     */
    public int getSummonerSpellFId() {
        return summonerSpellFId;
    }

    /**
     * @return the team
     */
    public int getTeam() {
        return team;
    }

    /**
     * @return the timeline
     */
    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (accountId == null ? 0 : accountId.hashCode());
        result = prime * result + championId;
        result = prime * result + (currentAccountId == null ? 0 : currentAccountId.hashCode());
        result = prime * result + (currentPlatform == null ? 0 : currentPlatform.hashCode());
        result = prime * result + (highestTierInSeason == null ? 0 : highestTierInSeason.hashCode());
        result = prime * result + (items == null ? 0 : items.hashCode());
        result = prime * result + (lane == null ? 0 : lane.hashCode());
        result = prime * result + (matchHistoryURI == null ? 0 : matchHistoryURI.hashCode());
        result = prime * result + participantId;
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + primaryRunePath;
        result = prime * result + profileIconId;
        result = prime * result + (role == null ? 0 : role.hashCode());
        result = prime * result + (runeStats == null ? 0 : runeStats.hashCode());
        result = prime * result + secondaryRunePath;
        result = prime * result + (stats == null ? 0 : stats.hashCode());
        result = prime * result + (summonerId == null ? 0 : summonerId.hashCode());
        result = prime * result + (summonerName == null ? 0 : summonerName.hashCode());
        result = prime * result + summonerSpellDId;
        result = prime * result + summonerSpellFId;
        result = prime * result + team;
        result = prime * result + (timeline == null ? 0 : timeline.hashCode());
        result = prime * result + (version == null ? 0 : version.hashCode());
        return result;
    }

    /**
     * @param accountId
     *        the accountId to set
     */
    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    /**
     * @param championId
     *        the championId to set
     */
    public void setChampionId(final int championId) {
        this.championId = championId;
    }

    /**
     * @param currentAccountId
     *        the currentAccountId to set
     */
    public void setCurrentAccountId(final String currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    /**
     * @param currentPlatform
     *        the currentPlatform to set
     */
    public void setCurrentPlatform(final String currentPlatform) {
        this.currentPlatform = currentPlatform;
    }

    /**
     * @param highestTierInSeason
     *        the highestTierInSeason to set
     */
    public void setHighestTierInSeason(final String highestTierInSeason) {
        this.highestTierInSeason = highestTierInSeason;
    }

    /**
     * @param items
     *        the items to set
     */
    public void setItems(final List<Integer> items) {
        this.items = items;
    }

    /**
     * @param lane
     *        the lane to set
     */
    public void setLane(final String lane) {
        this.lane = lane;
    }

    /**
     * @param matchHistoryURI
     *        the matchHistoryURI to set
     */
    public void setMatchHistoryURI(final String matchHistoryURI) {
        this.matchHistoryURI = matchHistoryURI;
    }

    /**
     * @param participantId
     *        the participantId to set
     */
    public void setParticipantId(final int participantId) {
        this.participantId = participantId;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param primaryRunePath
     *        the primaryRunePath to set
     */
    public void setPrimaryRunePath(final int primaryRunePath) {
        this.primaryRunePath = primaryRunePath;
    }

    /**
     * @param profileIconId
     *        the profileIconId to set
     */
    public void setProfileIconId(final int profileIconId) {
        this.profileIconId = profileIconId;
    }

    /**
     * @param role
     *        the role to set
     */
    public void setRole(final String role) {
        this.role = role;
    }

    /**
     * @param runeStats
     *        the runeStats to set
     */
    public void setRuneStats(final List<RuneStats> runeStats) {
        this.runeStats = runeStats;
    }

    /**
     * @param secondaryRunePath
     *        the secondaryRunePath to set
     */
    public void setSecondaryRunePath(final int secondaryRunePath) {
        this.secondaryRunePath = secondaryRunePath;
    }

    /**
     * @param stats
     *        the stats to set
     */
    public void setStats(final ParticipantStats stats) {
        this.stats = stats;
    }

    /**
     * @param summonerId
     *        the summonerId to set
     */
    public void setSummonerId(final String summonerId) {
        this.summonerId = summonerId;
    }

    /**
     * @param summonerName
     *        the summonerName to set
     */
    public void setSummonerName(final String summonerName) {
        this.summonerName = summonerName;
    }

    /**
     * @param summonerSpellDId
     *        the summonerSpellDId to set
     */
    public void setSummonerSpellDId(final int summonerSpellDId) {
        this.summonerSpellDId = summonerSpellDId;
    }

    /**
     * @param summonerSpellFId
     *        the summonerSpellFId to set
     */
    public void setSummonerSpellFId(final int summonerSpellFId) {
        this.summonerSpellFId = summonerSpellFId;
    }

    /**
     * @param team
     *        the team to set
     */
    public void setTeam(final int team) {
        this.team = team;
    }

    /**
     * @param timeline
     *        the timeline to set
     */
    public void setTimeline(final ParticipantTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * @param version
     *        the version to set
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}

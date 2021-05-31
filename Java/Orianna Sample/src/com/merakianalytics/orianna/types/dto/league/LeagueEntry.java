package com.merakianalytics.orianna.types.dto.league;

import com.merakianalytics.orianna.types.dto.DataObject;

public class LeagueEntry extends DataObject {
    private static final long serialVersionUID = -8885805858383620383L;
    private boolean hotStreak, veteran, inactive, freshBlood;
    private MiniSeries miniSeries;
    private String queueType, summonerName, rank, leagueId, tier, summonerId, platform;
    private int wins, losses, leaguePoints;

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
        final LeagueEntry other = (LeagueEntry)obj;
        if(freshBlood != other.freshBlood) {
            return false;
        }
        if(hotStreak != other.hotStreak) {
            return false;
        }
        if(inactive != other.inactive) {
            return false;
        }
        if(leagueId == null) {
            if(other.leagueId != null) {
                return false;
            }
        } else if(!leagueId.equals(other.leagueId)) {
            return false;
        }
        if(leaguePoints != other.leaguePoints) {
            return false;
        }
        if(losses != other.losses) {
            return false;
        }
        if(miniSeries == null) {
            if(other.miniSeries != null) {
                return false;
            }
        } else if(!miniSeries.equals(other.miniSeries)) {
            return false;
        }
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(queueType == null) {
            if(other.queueType != null) {
                return false;
            }
        } else if(!queueType.equals(other.queueType)) {
            return false;
        }
        if(rank == null) {
            if(other.rank != null) {
                return false;
            }
        } else if(!rank.equals(other.rank)) {
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
        if(tier == null) {
            if(other.tier != null) {
                return false;
            }
        } else if(!tier.equals(other.tier)) {
            return false;
        }
        if(veteran != other.veteran) {
            return false;
        }
        if(wins != other.wins) {
            return false;
        }
        return true;
    }

    /**
     * @return the leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    /**
     * @return the leaguePoints
     */
    public int getLeaguePoints() {
        return leaguePoints;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @return the miniSeries
     */
    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the queueType
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
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
     * @return the tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (freshBlood ? 1231 : 1237);
        result = prime * result + (hotStreak ? 1231 : 1237);
        result = prime * result + (inactive ? 1231 : 1237);
        result = prime * result + (leagueId == null ? 0 : leagueId.hashCode());
        result = prime * result + leaguePoints;
        result = prime * result + losses;
        result = prime * result + (miniSeries == null ? 0 : miniSeries.hashCode());
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + (queueType == null ? 0 : queueType.hashCode());
        result = prime * result + (rank == null ? 0 : rank.hashCode());
        result = prime * result + (summonerId == null ? 0 : summonerId.hashCode());
        result = prime * result + (summonerName == null ? 0 : summonerName.hashCode());
        result = prime * result + (tier == null ? 0 : tier.hashCode());
        result = prime * result + (veteran ? 1231 : 1237);
        result = prime * result + wins;
        return result;
    }

    /**
     * @return the freshBlood
     */
    public boolean isFreshBlood() {
        return freshBlood;
    }

    /**
     * @return the hotStreak
     */
    public boolean isHotStreak() {
        return hotStreak;
    }

    /**
     * @return the inactive
     */
    public boolean isInactive() {
        return inactive;
    }

    /**
     * @return the veteran
     */
    public boolean isVeteran() {
        return veteran;
    }

    /**
     * @param freshBlood
     *        the freshBlood to set
     */
    public void setFreshBlood(final boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    /**
     * @param hotStreak
     *        the hotStreak to set
     */
    public void setHotStreak(final boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    /**
     * @param inactive
     *        the inactive to set
     */
    public void setInactive(final boolean inactive) {
        this.inactive = inactive;
    }

    /**
     * @param leagueId
     *        the leagueId to set
     */
    public void setLeagueId(final String leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * @param leaguePoints
     *        the leaguePoints to set
     */
    public void setLeaguePoints(final int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    /**
     * @param losses
     *        the losses to set
     */
    public void setLosses(final int losses) {
        this.losses = losses;
    }

    /**
     * @param miniSeries
     *        the miniSeries to set
     */
    public void setMiniSeries(final MiniSeries miniSeries) {
        this.miniSeries = miniSeries;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param queueType
     *        the queueType to set
     */
    public void setQueueType(final String queueType) {
        this.queueType = queueType;
    }

    /**
     * @param rank
     *        the rank to set
     */
    public void setRank(final String rank) {
        this.rank = rank;
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
     * @param tier
     *        the tier to set
     */
    public void setTier(final String tier) {
        this.tier = tier;
    }

    /**
     * @param veteran
     *        the veteran to set
     */
    public void setVeteran(final boolean veteran) {
        this.veteran = veteran;
    }

    /**
     * @param wins
     *        the wins to set
     */
    public void setWins(final int wins) {
        this.wins = wins;
    }
}

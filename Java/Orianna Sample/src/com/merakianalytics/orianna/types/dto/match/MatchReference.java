package com.merakianalytics.orianna.types.dto.match;

import com.merakianalytics.orianna.types.dto.DataObject;

public class MatchReference extends DataObject {
    private static final long serialVersionUID = 4433468912283592631L;
    private int champion, season, queue;
    private long gameId, timestamp;
    private String lane, platformId, role, accountId;

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
        final MatchReference other = (MatchReference)obj;
        if(accountId == null) {
            if(other.accountId != null) {
                return false;
            }
        } else if(!accountId.equals(other.accountId)) {
            return false;
        }
        if(champion != other.champion) {
            return false;
        }
        if(gameId != other.gameId) {
            return false;
        }
        if(lane == null) {
            if(other.lane != null) {
                return false;
            }
        } else if(!lane.equals(other.lane)) {
            return false;
        }
        if(platformId == null) {
            if(other.platformId != null) {
                return false;
            }
        } else if(!platformId.equals(other.platformId)) {
            return false;
        }
        if(queue != other.queue) {
            return false;
        }
        if(role == null) {
            if(other.role != null) {
                return false;
            }
        } else if(!role.equals(other.role)) {
            return false;
        }
        if(season != other.season) {
            return false;
        }
        if(timestamp != other.timestamp) {
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
     * @return the champion
     */
    public int getChampion() {
        return champion;
    }

    /**
     * @return the gameId
     */
    public long getGameId() {
        return gameId;
    }

    /**
     * @return the lane
     */
    public String getLane() {
        return lane;
    }

    /**
     * @return the platformId
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * @return the queue
     */
    public int getQueue() {
        return queue;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @return the season
     */
    public int getSeason() {
        return season;
    }

    /**
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (accountId == null ? 0 : accountId.hashCode());
        result = prime * result + champion;
        result = prime * result + (int)(gameId ^ gameId >>> 32);
        result = prime * result + (lane == null ? 0 : lane.hashCode());
        result = prime * result + (platformId == null ? 0 : platformId.hashCode());
        result = prime * result + queue;
        result = prime * result + (role == null ? 0 : role.hashCode());
        result = prime * result + season;
        result = prime * result + (int)(timestamp ^ timestamp >>> 32);
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
     * @param champion
     *        the champion to set
     */
    public void setChampion(final int champion) {
        this.champion = champion;
    }

    /**
     * @param gameId
     *        the gameId to set
     */
    public void setGameId(final long gameId) {
        this.gameId = gameId;
    }

    /**
     * @param lane
     *        the lane to set
     */
    public void setLane(final String lane) {
        this.lane = lane;
    }

    /**
     * @param platformId
     *        the platformId to set
     */
    public void setPlatformId(final String platformId) {
        this.platformId = platformId;
    }

    /**
     * @param queue
     *        the queue to set
     */
    public void setQueue(final int queue) {
        this.queue = queue;
    }

    /**
     * @param role
     *        the role to set
     */
    public void setRole(final String role) {
        this.role = role;
    }

    /**
     * @param season
     *        the season to set
     */
    public void setSeason(final int season) {
        this.season = season;
    }

    /**
     * @param timestamp
     *        the timestamp to set
     */
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
}

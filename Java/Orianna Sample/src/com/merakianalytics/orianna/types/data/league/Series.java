package com.merakianalytics.orianna.types.data.league;

import com.merakianalytics.orianna.types.data.CoreData;

public class Series extends CoreData {
    private static final long serialVersionUID = -808103453588557335L;
    private String progress;
    private int wins, losses, winsRequired;

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
        final Series other = (Series)obj;
        if(losses != other.losses) {
            return false;
        }
        if(progress == null) {
            if(other.progress != null) {
                return false;
            }
        } else if(!progress.equals(other.progress)) {
            return false;
        }
        if(winsRequired != other.winsRequired) {
            return false;
        }
        if(wins != other.wins) {
            return false;
        }
        return true;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @return the progress
     */
    public String getProgress() {
        return progress;
    }

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @return the winsRequired
     */
    public int getWinsRequired() {
        return winsRequired;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + losses;
        result = prime * result + (progress == null ? 0 : progress.hashCode());
        result = prime * result + winsRequired;
        result = prime * result + wins;
        return result;
    }

    /**
     * @param losses
     *        the losses to set
     */
    public void setLosses(final int losses) {
        this.losses = losses;
    }

    /**
     * @param progress
     *        the progress to set
     */
    public void setProgress(final String progress) {
        this.progress = progress;
    }

    /**
     * @param wins
     *        the wins to set
     */
    public void setWins(final int wins) {
        this.wins = wins;
    }

    /**
     * @param winsRequired
     *        the winsRequired to set
     */
    public void setWinsRequired(final int winsRequired) {
        this.winsRequired = winsRequired;
    }
}

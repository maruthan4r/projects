package com.merakianalytics.orianna.types.data.thirdpartycode;

import com.merakianalytics.orianna.types.data.CoreData;

public class VerificationString extends CoreData {
    private static final long serialVersionUID = 6011690200339393247L;
    private String platform, string, summonerId;

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
        final VerificationString other = (VerificationString)obj;
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(string == null) {
            if(other.string != null) {
                return false;
            }
        } else if(!string.equals(other.string)) {
            return false;
        }
        if(summonerId == null) {
            if(other.summonerId != null) {
                return false;
            }
        } else if(!summonerId.equals(other.summonerId)) {
            return false;
        }
        return true;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * @return the summonerId
     */
    public String getSummonerId() {
        return summonerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + (string == null ? 0 : string.hashCode());
        result = prime * result + (summonerId == null ? 0 : summonerId.hashCode());
        return result;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param string
     *        the string to set
     */
    public void setString(final String string) {
        this.string = string;
    }

    /**
     * @param summonerId
     *        the summonerId to set
     */
    public void setSummonerId(final String summonerId) {
        this.summonerId = summonerId;
    }
}

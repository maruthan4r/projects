package com.merakianalytics.orianna.types.dto.staticdata;

import java.util.Map;
import java.util.Set;

import com.merakianalytics.orianna.types.dto.DataObject;

public class ChampionList extends DataObject {
    private static final long serialVersionUID = -6473883697778009202L;
    private Map<String, Champion> data;
    private boolean dataById;
    private Set<String> includedData;
    private Map<String, String> keys;
    private String version, type, format, locale, platform;

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
        final ChampionList other = (ChampionList)obj;
        if(data == null) {
            if(other.data != null) {
                return false;
            }
        } else if(!data.equals(other.data)) {
            return false;
        }
        if(dataById != other.dataById) {
            return false;
        }
        if(format == null) {
            if(other.format != null) {
                return false;
            }
        } else if(!format.equals(other.format)) {
            return false;
        }
        if(includedData == null) {
            if(other.includedData != null) {
                return false;
            }
        } else if(!includedData.equals(other.includedData)) {
            return false;
        }
        if(keys == null) {
            if(other.keys != null) {
                return false;
            }
        } else if(!keys.equals(other.keys)) {
            return false;
        }
        if(locale == null) {
            if(other.locale != null) {
                return false;
            }
        } else if(!locale.equals(other.locale)) {
            return false;
        }
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(type == null) {
            if(other.type != null) {
                return false;
            }
        } else if(!type.equals(other.type)) {
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
     * @return the data
     */
    public Map<String, Champion> getData() {
        return data;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @return the includedData
     */
    public Set<String> getIncludedData() {
        return includedData;
    }

    /**
     * @return the keys
     */
    public Map<String, String> getKeys() {
        return keys;
    }

    /**
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
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
        result = prime * result + (data == null ? 0 : data.hashCode());
        result = prime * result + (dataById ? 1231 : 1237);
        result = prime * result + (format == null ? 0 : format.hashCode());
        result = prime * result + (includedData == null ? 0 : includedData.hashCode());
        result = prime * result + (keys == null ? 0 : keys.hashCode());
        result = prime * result + (locale == null ? 0 : locale.hashCode());
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        result = prime * result + (version == null ? 0 : version.hashCode());
        return result;
    }

    /**
     * @return the dataById
     */
    public boolean isDataById() {
        return dataById;
    }

    /**
     * @param data
     *        the data to set
     */
    public void setData(final Map<String, Champion> data) {
        this.data = data;
    }

    /**
     * @param dataById
     *        the dataById to set
     */
    public void setDataById(final boolean dataById) {
        this.dataById = dataById;
    }

    /**
     * @param format
     *        the format to set
     */
    public void setFormat(final String format) {
        this.format = format;
    }

    /**
     * @param includedData
     *        the includedData to set
     */
    public void setIncludedData(final Set<String> includedData) {
        this.includedData = includedData;
    }

    /**
     * @param keys
     *        the keys to set
     */
    public void setKeys(final Map<String, String> keys) {
        this.keys = keys;
    }

    /**
     * @param locale
     *        the locale to set
     */
    public void setLocale(final String locale) {
        this.locale = locale;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param type
     *        the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @param version
     *        the version to set
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}

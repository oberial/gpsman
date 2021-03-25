package com.johnsmit.gpsmanager;

import java.util.Date;

public class LocationResult {
    private String deviceCode;
    private String Longitude;
    private String Latitude;
    private Date receiveDatetime;
    private String speed;
    private boolean onlineStatus;
    private boolean overSpeedStatus;

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }



    public Date getReceiveDatetime() {
        return receiveDatetime;
    }

    public void setReceiveDatetime(Date receiveDatetime) {
        this.receiveDatetime = receiveDatetime;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public boolean isOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public boolean isOverSpeedStatus() {
        return overSpeedStatus;
    }

    public void setOverSpeedStatus(boolean overSpeedStatus) {
        this.overSpeedStatus = overSpeedStatus;
    }


    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
}

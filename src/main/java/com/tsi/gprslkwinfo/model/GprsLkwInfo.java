package com.tsi.gprslkwinfo.model;

/**
 * Created by osboxes on 28.11.16.
 */
public class GprsLkwInfo {
    long lkwid;
    String kennzeichen;

    public GprsLkwInfo(){
    }

    public GprsLkwInfo(long lkwid, String kennzeichen) {
        this.lkwid = lkwid;
        this.kennzeichen = kennzeichen;

    }
    public long getGprsLkwInfoLkwId() {
        return lkwid;
    }
    public void setGprsLkwInfoLkwId(long lkwid) {
        this.lkwid = lkwid;
    }
    public String getGprsLkwInfokennzeichen() {
        return kennzeichen;
    }
    public void setGprsLkwInfokennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @Override
    public String toString() {
        return "Gprs Lkw Info [lkw id=" + lkwid + ", kennzeichen=" + kennzeichen +  "]";
    }
}

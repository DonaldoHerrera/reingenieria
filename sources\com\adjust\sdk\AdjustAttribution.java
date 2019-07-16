package com.adjust.sdk;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import org.json.JSONObject;

public class AdjustAttribution implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("trackerToken", String.class), new ObjectStreamField("trackerName", String.class), new ObjectStreamField("network", String.class), new ObjectStreamField("campaign", String.class), new ObjectStreamField("adgroup", String.class), new ObjectStreamField("creative", String.class), new ObjectStreamField("clickLabel", String.class), new ObjectStreamField("adid", String.class)};
    private static final long serialVersionUID = 1;
    public String adgroup;
    public String adid;
    public String campaign;
    public String clickLabel;
    public String creative;
    public String network;
    public String trackerName;
    public String trackerToken;

    public static AdjustAttribution fromJson(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        String str3 = "click_label";
        String str4 = "creative";
        String str5 = "adgroup";
        String str6 = "campaign";
        String str7 = "network";
        String str8 = "tracker_name";
        String str9 = "tracker_token";
        if ("unity".equals(str2)) {
            String str10 = "";
            adjustAttribution.trackerToken = jSONObject.optString(str9, str10);
            adjustAttribution.trackerName = jSONObject.optString(str8, str10);
            adjustAttribution.network = jSONObject.optString(str7, str10);
            adjustAttribution.campaign = jSONObject.optString(str6, str10);
            adjustAttribution.adgroup = jSONObject.optString(str5, str10);
            adjustAttribution.creative = jSONObject.optString(str4, str10);
            adjustAttribution.clickLabel = jSONObject.optString(str3, str10);
            if (str == null) {
                str = str10;
            }
            adjustAttribution.adid = str;
        } else {
            adjustAttribution.trackerToken = jSONObject.optString(str9, null);
            adjustAttribution.trackerName = jSONObject.optString(str8, null);
            adjustAttribution.network = jSONObject.optString(str7, null);
            adjustAttribution.campaign = jSONObject.optString(str6, null);
            adjustAttribution.adgroup = jSONObject.optString(str5, null);
            adjustAttribution.creative = jSONObject.optString(str4, null);
            adjustAttribution.clickLabel = jSONObject.optString(str3, null);
            adjustAttribution.adid = str;
        }
        return adjustAttribution;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || AdjustAttribution.class != obj.getClass()) {
            return false;
        }
        AdjustAttribution adjustAttribution = (AdjustAttribution) obj;
        return Util.equalString(this.trackerToken, adjustAttribution.trackerToken) && Util.equalString(this.trackerName, adjustAttribution.trackerName) && Util.equalString(this.network, adjustAttribution.network) && Util.equalString(this.campaign, adjustAttribution.campaign) && Util.equalString(this.adgroup, adjustAttribution.adgroup) && Util.equalString(this.creative, adjustAttribution.creative) && Util.equalString(this.clickLabel, adjustAttribution.clickLabel) && Util.equalString(this.adid, adjustAttribution.adid);
    }

    public int hashCode() {
        return ((((((((((((((629 + Util.hashString(this.trackerToken)) * 37) + Util.hashString(this.trackerName)) * 37) + Util.hashString(this.network)) * 37) + Util.hashString(this.campaign)) * 37) + Util.hashString(this.adgroup)) * 37) + Util.hashString(this.creative)) * 37) + Util.hashString(this.clickLabel)) * 37) + Util.hashString(this.adid);
    }

    public String toString() {
        return Util.formatString("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s", this.trackerToken, this.trackerName, this.network, this.campaign, this.adgroup, this.creative, this.clickLabel, this.adid);
    }
}

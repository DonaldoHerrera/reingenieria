package com.adjust.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.util.Date;
import java.util.Locale;

class DeviceInfo {
    String abi;
    String androidId;
    String apiLevel;
    String appInstallTime;
    String appUpdateTime;
    String appVersion;
    String buildName;
    String clientSdk;
    String country;
    String deviceManufacturer;
    String deviceName;
    String deviceType;
    String displayHeight;
    String displayWidth;
    String fbAttributionId;
    String hardwareName;
    Boolean isTrackingEnabled;
    String language;
    String macSha1;
    String macShortMd5;
    private boolean nonGoogleIdsReadOnce = false;
    String osName;
    String osVersion;
    String packageName;
    String playAdId;
    String playAdIdSource;
    String screenDensity;
    String screenFormat;
    String screenSize;

    DeviceInfo(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Util.getLocale(configuration);
        int i = configuration.screenLayout;
        context.getContentResolver();
        this.packageName = getPackageName(context);
        this.appVersion = getAppVersion(context);
        this.deviceType = getDeviceType(i);
        this.deviceName = getDeviceName();
        this.deviceManufacturer = getDeviceManufacturer();
        this.osName = getOsName();
        this.osVersion = getOsVersion();
        this.apiLevel = getApiLevel();
        this.language = getLanguage(locale);
        this.country = getCountry(locale);
        this.screenSize = getScreenSize(i);
        this.screenFormat = getScreenFormat(i);
        this.screenDensity = getScreenDensity(displayMetrics);
        this.displayWidth = getDisplayWidth(displayMetrics);
        this.displayHeight = getDisplayHeight(displayMetrics);
        this.clientSdk = getClientSdk(str);
        this.fbAttributionId = getFacebookAttributionId(context);
        this.hardwareName = getHardwareName();
        this.abi = getABI();
        this.buildName = getBuildName();
        this.appInstallTime = getAppInstallTime(context);
        this.appUpdateTime = getAppUpdateTime(context);
    }

    private String getABI() {
        String[] supportedAbis = Util.getSupportedAbis();
        if (supportedAbis == null || supportedAbis.length == 0) {
            return Util.getCpuAbi();
        }
        return supportedAbis[0];
    }

    private String getApiLevel() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(VERSION.SDK_INT);
        return sb.toString();
    }

    private String getAppInstallTime(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    private String getAppUpdateTime(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    private String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    private String getBuildName() {
        return Build.ID;
    }

    private String getClientSdk(String str) {
        String str2 = Constants.CLIENT_SDK;
        if (str == null) {
            return str2;
        }
        return Util.formatString("%s@%s", str, str2);
    }

    private String getCountry(Locale locale) {
        return locale.getCountry();
    }

    private String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    private String getDeviceName() {
        return Build.MODEL;
    }

    private String getDeviceType(int i) {
        int i2 = i & 15;
        if (i2 == 1 || i2 == 2) {
            return "phone";
        }
        if (i2 == 3 || i2 == 4) {
            return "tablet";
        }
        return null;
    }

    private String getDisplayHeight(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    private String getDisplayWidth(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    private String getFacebookAttributionId(Context context) {
        String str = "aid";
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{str}, null, null, null);
            if (query == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex(str));
            query.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    private String getHardwareName() {
        return Build.DISPLAY;
    }

    private String getLanguage(Locale locale) {
        return locale.getLanguage();
    }

    private String getMacAddress(Context context, boolean z) {
        if (z) {
            return null;
        }
        if (!Util.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
            AdjustFactory.getLogger().warn("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
        }
        return Util.getMacAddress(context);
    }

    private String getMacSha1(String str) {
        if (str == null) {
            return null;
        }
        return Util.sha1(str);
    }

    private String getMacShortMd5(String str) {
        if (str == null) {
            return null;
        }
        return Util.md5(str.replaceAll(":", ""));
    }

    private String getOsName() {
        return "android";
    }

    private String getOsVersion() {
        return VERSION.RELEASE;
    }

    private String getPackageName(Context context) {
        return context.getPackageName();
    }

    private String getScreenDensity(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        if (i == 0) {
            return null;
        }
        if (i < 140) {
            return Constants.LOW;
        }
        return i > 200 ? Constants.HIGH : Constants.MEDIUM;
    }

    private String getScreenFormat(int i) {
        int i2 = i & 48;
        if (i2 == 16) {
            return Constants.NORMAL;
        }
        if (i2 != 32) {
            return null;
        }
        return Constants.LONG;
    }

    private String getScreenSize(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return Constants.SMALL;
        }
        if (i2 == 2) {
            return Constants.NORMAL;
        }
        if (i2 == 3) {
            return Constants.LARGE;
        }
        if (i2 != 4) {
            return null;
        }
        return Constants.XLARGE;
    }

    /* access modifiers changed from: 0000 */
    public void reloadNonPlayIds(Context context) {
        if (!this.nonGoogleIdsReadOnce) {
            if (!Util.checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                AdjustFactory.getLogger().warn("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
            }
            String macAddress = Util.getMacAddress(context);
            this.macSha1 = getMacSha1(macAddress);
            this.macShortMd5 = getMacShortMd5(macAddress);
            this.androidId = Util.getAndroidId(context);
            this.nonGoogleIdsReadOnce = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void reloadPlayIds(Context context) {
        this.playAdIdSource = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            try {
                this.playAdId = GooglePlayServicesClient.getGooglePlayServicesInfo(context).getGpsAdid();
                if (this.playAdId != null) {
                    this.playAdIdSource = "service";
                    break;
                }
            } catch (Exception unused) {
            }
            this.playAdId = Util.getPlayAdId(context);
            if (this.playAdId != null) {
                this.playAdIdSource = "library";
                break;
            }
            i2++;
        }
        while (i < 3) {
            try {
                this.isTrackingEnabled = GooglePlayServicesClient.getGooglePlayServicesInfo(context).isTrackingEnabled();
                if (this.isTrackingEnabled != null) {
                    return;
                }
            } catch (Exception unused2) {
            }
            this.isTrackingEnabled = Util.isPlayTrackingEnabled(context);
            if (this.isTrackingEnabled == null) {
                i++;
            } else {
                return;
            }
        }
    }
}

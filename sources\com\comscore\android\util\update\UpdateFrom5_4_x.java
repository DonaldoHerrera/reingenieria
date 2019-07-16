package com.comscore.android.util.update;

import android.content.Context;
import android.content.SharedPreferences;
import com.comscore.TrackingPropertyType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UpdateFrom5_4_x {
    public static final String OLD_DEFAULT_PREFS_NAME = "cSPrefs";
    private SharedPreferences a;
    private HashMap<String, String> b;
    /* access modifiers changed from: private */
    public File c;
    /* access modifiers changed from: private */
    public File d;
    private Context e;

    public UpdateFrom5_4_x(Context context) {
        this.e = context;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.getFilesDir().getParent());
        String str = "/shared_prefs/";
        sb.append(str);
        String str2 = OLD_DEFAULT_PREFS_NAME;
        sb.append(str2);
        sb.append(".xml");
        this.c = new File(sb.toString());
        if (this.c.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.e.getFilesDir().getParent());
            sb2.append(str);
            sb2.append(str2);
            sb2.append(".back");
            this.d = new File(sb2.toString());
            this.b = new HashMap<>();
            this.a = this.e.getSharedPreferences(str2, 0);
            for (Entry entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    this.b.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    private ArrayList<String> a(Context context) {
        String[] strArr;
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.isDirectory()) {
            strArr = null;
        } else {
            strArr = filesDir.list(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith("cs_cache_");
                }
            });
            if (strArr != null) {
                Arrays.sort(strArr);
            } else {
                strArr = new String[0];
            }
        }
        return new ArrayList<>(Arrays.asList(strArr));
    }

    private void a() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().commit();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException unused) {
                    }
                    if (UpdateFrom5_4_x.this.c.exists()) {
                        UpdateFrom5_4_x.this.c.delete();
                    }
                    if (UpdateFrom5_4_x.this.d.exists()) {
                        UpdateFrom5_4_x.this.d.delete();
                    }
                }
            }).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC, Splitter:B:17:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032 A[SYNTHETIC, Splitter:B:23:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    private void a(Context context, String str, ArrayList<String> arrayList) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.openFileInput(str)));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    } else if (readLine.length() != 0) {
                        arrayList.add(readLine);
                    }
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            }
        } catch (Exception unused3) {
            if (bufferedReader == null) {
                bufferedReader.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public void libraryPostUpdate(Map<String, String> map, ArrayList<String> arrayList) {
        if (this.a != null) {
            a();
            Iterator it = a(this.e).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                a(this.e, str, arrayList);
                this.e.deleteFile(str);
            }
        }
    }

    public void libraryUpdate(Map<String, String> map) {
        String str;
        if (this.a != null) {
            HashMap hashMap = new HashMap();
            String str2 = "foreground_transitions_count";
            hashMap.put("ns_ap_fg", str2);
            String str3 = "current_install_timestamp";
            hashMap.put("installTime", str3);
            String str4 = (String) this.b.get("lastActivityTime");
            String str5 = "last_session_accumulation_timestamp";
            String str6 = "last_application_accumulation_timestamp";
            if (!(str4 == null || str4.length() == 0)) {
                map.put(str6, str4);
                map.put(str5, str4);
            }
            hashMap.put("lastApplicationAccumulationTimestamp", str6);
            hashMap.put("lastSessionAccumulationTimestamp", str5);
            hashMap.put("lastApplicationSessionTimestamp", "last_application_session_timestamp");
            hashMap.put("lastUserSessionTimestamp", "last_user_session_timestamp");
            hashMap.put("lastActiveUserSessionTimestamp", "last_active_user_session_timestamp");
            hashMap.put("foregroundTransitionsCount", str2);
            hashMap.put("totalForegroundTime", "total_foreground_time");
            hashMap.put("totalBackgroundTime", "total_background_time");
            hashMap.put("totalInactiveTime", "total_inactive_time");
            hashMap.put("accumulatedForegroundTime", "accumulated_foreground_time");
            hashMap.put("accumulatedBackgroundTime", "accumulated_background_time");
            hashMap.put("accumulatedInactiveTime", "accumulated_inactive_time");
            hashMap.put("accumulatedApplicationSessionTime", "accumulated_application_session_time");
            hashMap.put("accumulatedActiveUserSessionTime", "accumulated_active_user_session_time");
            hashMap.put("accumulatedUserSessionTime", "accumulated_user_session_time");
            hashMap.put("activeUserSessionCount", "active_user_session_count");
            hashMap.put("userInteractionCount", "user_interaction_count");
            hashMap.put("userSessionCount", "user_session_count");
            hashMap.put("applicationSessionCountKey", "application_session_count");
            String str7 = "genesis";
            hashMap.put(str7, str7);
            hashMap.put("previousGenesis", "previous_genesis");
            hashMap.put("installId", str3);
            hashMap.put(TrackingPropertyType.FIRST_INSTALL_ID, "first_install_timestamp");
            hashMap.put("currentVersion", "previous_app_version");
            String str8 = "runs";
            hashMap.put(str8, str8);
            hashMap.put(TrackingPropertyType.COLD_START_COUNT, "cold_start_count");
            hashMap.put("lastMeasurementProcessedTimestamp", "last_transmission_time");
            hashMap.put("lastUserInteractionTimestamp", "last_user_interaction_timestamp");
            hashMap.put("crossPublisherId", "crosspublisher_id_RSA");
            hashMap.put("md5RawCrossPublisherId", "crosspublisher_id_MD5");
            for (Entry entry : hashMap.entrySet()) {
                String str9 = (String) entry.getKey();
                String str10 = (String) entry.getValue();
                String str11 = (String) this.b.get(str9);
                if (!(str11 == null || str11.length() == 0)) {
                    map.put(str10, str11);
                }
            }
            String str12 = "updated_from_versions";
            String str13 = (String) map.get(str12);
            if (str13 == null || str13.length() == 0) {
                str = "5.4.x";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("5.4.x,");
                sb.append(str13);
                str = sb.toString();
            }
            map.put(str12, str);
        }
    }
}

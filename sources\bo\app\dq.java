package bo.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest.Builder;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SuppressLint({"MissingPermission"})
public final class dq {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(dq.class);

    public static void a(Context context) {
        Hg.a(a, "Deleting registered geofence cache.");
        Editor edit = context.getSharedPreferences("com.appboy.support.geofences", 0).edit();
        edit.clear();
        edit.apply();
    }

    public static void a(Context context, GoogleApiClient googleApiClient, List<C0491bg> list, PendingIntent pendingIntent) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.geofences", 0);
            List<C0491bg> a2 = dp.a(sharedPreferences);
            String str = "Obsolete geofence will be un-registered: ";
            if (list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C0491bg bgVar : a2) {
                    arrayList.add(bgVar.getId());
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(bgVar.getId());
                    Hg.a(str2, sb.toString());
                }
                if (arrayList.size() > 0) {
                    LocationServices.GeofencingApi.removeGeofences(googleApiClient, arrayList);
                    sharedPreferences.edit().clear().apply();
                    String str3 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No new geofences to register. Cleared ");
                    sb2.append(a2.size());
                    sb2.append(" previously registered geofences.");
                    Hg.a(str3, sb2.toString());
                } else {
                    Hg.a(a, "No new geofences to register. No geofences are currently registered.");
                }
                return;
            }
            ArrayList<C0491bg> arrayList2 = new ArrayList<>();
            HashSet hashSet = new HashSet();
            for (C0491bg bgVar2 : list) {
                hashSet.add(bgVar2.getId());
                boolean z = true;
                for (C0491bg bgVar3 : a2) {
                    if (bgVar2.getId().equals(bgVar3.getId()) && bgVar2.b(bgVar3)) {
                        z = false;
                    }
                }
                if (z) {
                    String str4 = a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("New geofence will be registered: ");
                    sb3.append(bgVar2.getId());
                    Hg.a(str4, sb3.toString());
                    arrayList2.add(bgVar2);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (C0491bg bgVar4 : a2) {
                if (!hashSet.contains(bgVar4.getId())) {
                    arrayList3.add(bgVar4.getId());
                    String str5 = a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(bgVar4.getId());
                    Hg.a(str5, sb4.toString());
                }
            }
            if (arrayList3.size() > 0) {
                Editor edit = sharedPreferences.edit();
                for (String remove : arrayList3) {
                    edit.remove(remove);
                }
                edit.apply();
                String str6 = a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Un-registering ");
                sb5.append(arrayList3.size());
                sb5.append(" obsolete geofences from Google Play Services.");
                Hg.a(str6, sb5.toString());
                LocationServices.GeofencingApi.removeGeofences(googleApiClient, arrayList3);
            } else {
                Hg.a(a, "No obsolete geofences need to be unregistered from Google Play Services.");
            }
            if (arrayList2.size() > 0) {
                ArrayList arrayList4 = new ArrayList();
                Editor edit2 = sharedPreferences.edit();
                for (C0491bg bgVar5 : arrayList2) {
                    arrayList4.add(bgVar5.N());
                    edit2.putString(bgVar5.getId(), bgVar5.forJsonPut().toString());
                }
                edit2.apply();
                String str7 = a;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Registering ");
                sb6.append(arrayList2.size());
                sb6.append(" new geofences with Google Play Services.");
                Hg.a(str7, sb6.toString());
                LocationServices.GeofencingApi.addGeofences(googleApiClient, new Builder().addGeofences(arrayList4).setInitialTrigger(0).build(), pendingIntent).setResultCallback(new ResultCallback<Status>() {
                    /* renamed from: a */
                    public void onResult(Status status) {
                        int statusCode = status.getStatusCode();
                        if (statusCode == 0) {
                            Hg.a(dq.a, "Geofences successfully registered with Google Play Services.");
                        } else if (statusCode == 1001) {
                            String a = dq.a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
                            sb.append(statusCode);
                            Hg.e(a, sb.toString());
                        } else if (statusCode == 1002) {
                            String a2 = dq.a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
                            sb2.append(statusCode);
                            Hg.e(a2, sb2.toString());
                        } else if (statusCode == 1000) {
                            String a3 = dq.a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
                            sb3.append(statusCode);
                            Hg.e(a3, sb3.toString());
                        } else {
                            String a4 = dq.a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Geofence pending result returned unknown status code: ");
                            sb4.append(statusCode);
                            Hg.e(a4, sb4.toString());
                        }
                    }
                });
            } else {
                Hg.a(a, "No new geofences need to be registered with Google Play Services.");
            }
        } catch (SecurityException e) {
            Hg.b(a, "Security exception while adding geofences.", e);
        } catch (Exception e2) {
            Hg.b(a, "Exception while adding geofences.", e2);
        }
    }

    public static boolean a(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        if (googleApiClient == null) {
            Hg.a(a, "Google Play services location Api client was null. Not requesting location update.");
            return false;
        }
        try {
            Hg.a(a, "Requesting single location update from Google Play Services.");
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.setPriority(100);
            locationRequest.setNumUpdates(1);
            if (googleApiClient.isConnected()) {
                Hg.a(a, "Google Play services location Api client is connected. Requesting location update from Google Play Services.");
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, pendingIntent);
                return true;
            }
            Hg.e(a, "Api client was not connected. Failed to request location update.");
            return false;
        } catch (SecurityException e) {
            Hg.d(a, "Failed to request location update due to security exception from insufficient permissions.", e);
            return false;
        } catch (Exception e2) {
            Hg.d(a, "Failed to request location update due to exception.", e2);
            return false;
        }
    }
}

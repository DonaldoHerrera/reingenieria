package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.he reason: case insensitive filesystem */
public interface C0973he extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(zf zfVar) throws RemoteException;

    void getAppInstanceId(zf zfVar) throws RemoteException;

    void getCachedAppInstanceId(zf zfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zf zfVar) throws RemoteException;

    void getCurrentScreenClass(zf zfVar) throws RemoteException;

    void getCurrentScreenName(zf zfVar) throws RemoteException;

    void getDeepLink(zf zfVar) throws RemoteException;

    void getGmpAppId(zf zfVar) throws RemoteException;

    void getMaxUserProperties(String str, zf zfVar) throws RemoteException;

    void getTestFlag(zf zfVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, zf zfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(Dr dr, zzx zzx, long j) throws RemoteException;

    void isDataCollectionEnabled(zf zfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zf zfVar, long j) throws RemoteException;

    void logHealthData(int i, String str, Dr dr, Dr dr2, Dr dr3) throws RemoteException;

    void onActivityCreated(Dr dr, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(Dr dr, long j) throws RemoteException;

    void onActivityPaused(Dr dr, long j) throws RemoteException;

    void onActivityResumed(Dr dr, long j) throws RemoteException;

    void onActivitySaveInstanceState(Dr dr, zf zfVar, long j) throws RemoteException;

    void onActivityStarted(Dr dr, long j) throws RemoteException;

    void onActivityStopped(Dr dr, long j) throws RemoteException;

    void performAction(Bundle bundle, zf zfVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(Af af) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(Dr dr, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(Af af) throws RemoteException;

    void setInstanceIdProvider(Ff ff) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, Dr dr, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(Af af) throws RemoteException;
}

package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

@TargetApi(14)
final class Mc implements ActivityLifecycleCallbacks {
    private final /* synthetic */ C1174sc a;

    private Mc(C1174sc scVar) {
        this.a = scVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3 A[Catch:{ Exception -> 0x01d6, all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0123 A[Catch:{ Exception -> 0x01d6, all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f A[SYNTHETIC, Splitter:B:75:0x015f] */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        Bundle bundle2;
        boolean z;
        Bundle bundle3;
        Activity activity2 = activity;
        Bundle bundle4 = bundle;
        String str2 = Constants.REFERRER;
        try {
            this.a.e().A().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.a.l();
                        String str3 = "auto";
                        String str4 = Vd.a(intent) ? "gs" : str3;
                        String queryParameter = data.getQueryParameter(str2);
                        String str5 = "Activity created with data 'referrer' without required params";
                        String str6 = "utm_medium";
                        String str7 = "_cis";
                        String str8 = "utm_source";
                        String str9 = "utm_campaign";
                        String str10 = "gclid";
                        if (!this.a.f().a(C1127j.Ka)) {
                            if (this.a.f().a(C1127j.Ma)) {
                            }
                            str = str5;
                            bundle2 = null;
                            if (bundle4 == null) {
                                bundle3 = this.a.l().a(data);
                                if (bundle3 != null) {
                                    bundle3.putString(str7, "intent");
                                    if (!this.a.f().a(C1127j.Ka) || bundle3.containsKey(str10) || bundle2 == null || !bundle2.containsKey(str10)) {
                                        z = false;
                                    } else {
                                        z = false;
                                        bundle3.putString("_cer", String.format("gclid=%s", new Object[]{bundle2.getString(str10)}));
                                    }
                                    this.a.b(str4, "_cmp", bundle3);
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                                bundle3 = null;
                            }
                            if (this.a.f().a(C1127j.Ma) && bundle2 != null && bundle2.containsKey(str10) && (bundle3 == null || !bundle3.containsKey(str10))) {
                                this.a.a(str3, "_lgclid", (Object) bundle2.getString(str10), true);
                            }
                            if (TextUtils.isEmpty(queryParameter)) {
                                this.a.r().a(activity2, bundle4);
                                return;
                            }
                            if (queryParameter.contains(str10) && (queryParameter.contains(str9) || queryParameter.contains(str8) || queryParameter.contains(str6) || queryParameter.contains("utm_term") || queryParameter.contains("utm_content"))) {
                                z = true;
                            }
                            if (!z) {
                                this.a.e().z().a(str);
                                this.a.r().a(activity2, bundle4);
                                return;
                            }
                            this.a.e().z().a("Activity created with referrer", queryParameter);
                            if (!TextUtils.isEmpty(queryParameter)) {
                                this.a.a(str3, "_ldl", (Object) queryParameter, true);
                            }
                            this.a.r().a(activity2, bundle4);
                            return;
                        }
                        if (!TextUtils.isEmpty(queryParameter)) {
                            if (queryParameter.contains(str10) || queryParameter.contains(str9) || queryParameter.contains(str8) || queryParameter.contains(str6)) {
                                Vd l = this.a.l();
                                String str11 = "https://google.com/search?";
                                str = str5;
                                String valueOf = String.valueOf(queryParameter);
                                Bundle a2 = l.a(Uri.parse(valueOf.length() != 0 ? str11.concat(valueOf) : new String(str11)));
                                if (a2 != null) {
                                    a2.putString(str7, str2);
                                }
                                bundle2 = a2;
                                if (bundle4 == null) {
                                }
                                this.a.a(str3, "_lgclid", (Object) bundle2.getString(str10), true);
                                if (TextUtils.isEmpty(queryParameter)) {
                                }
                            } else {
                                this.a.e().z().a(str5);
                            }
                        }
                        str = str5;
                        bundle2 = null;
                        if (bundle4 == null) {
                        }
                        this.a.a(str3, "_lgclid", (Object) bundle2.getString(str10), true);
                        if (TextUtils.isEmpty(queryParameter)) {
                        }
                    }
                }
                this.a.r().a(activity2, bundle4);
            }
        } catch (Exception e) {
            this.a.e().s().a("Throwable caught in onActivityCreated", e);
        } finally {
            this.a.r().a(activity2, bundle4);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.r().a(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.a.r().b(activity);
        C1210zd t = this.a.t();
        t.d().a((Runnable) new Ed(t, t.c().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        this.a.r().c(activity);
        C1210zd t = this.a.t();
        t.d().a((Runnable) new Fd(t, t.c().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.r().b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ Mc(C1174sc scVar, C1169rc rcVar) {
        this(scVar);
    }
}

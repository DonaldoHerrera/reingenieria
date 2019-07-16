package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.C1130jc;
import com.google.android.gms.measurement.internal.C1165qc;
import com.google.android.gms.measurement.internal.Lc;
import com.google.android.gms.measurement.internal.Mb;
import com.google.android.gms.measurement.internal.zzjn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final Mb b;
    private final Lc c;
    private final boolean d;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: private */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C1130jc.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        private ConditionalUserProperty(Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) C1130jc.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C1130jc.a(bundle, "origin", String.class, null);
            this.mName = (String) C1130jc.a(bundle, "name", String.class, null);
            this.mValue = C1130jc.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C1130jc.a(bundle, "trigger_event_name", String.class, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) C1130jc.a(bundle, "trigger_timeout", Long.class, valueOf)).longValue();
            this.mTimedOutEventName = (String) C1130jc.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C1130jc.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C1130jc.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C1130jc.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C1130jc.a(bundle, "time_to_live", Long.class, valueOf)).longValue();
            this.mExpiredEventName = (String) C1130jc.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C1130jc.a(bundle, "expired_event_params", Bundle.class, null);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends C1165qc {
        @ShowFirstParty
        @KeepForSdk
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    private AppMeasurement(Mb mb) {
        Preconditions.checkNotNull(mb);
        this.b = mb;
        this.c = null;
        this.d = false;
    }

    @VisibleForTesting
    private static AppMeasurement a(Context context, String str, String str2) {
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    Lc b2 = b(context, null);
                    if (b2 != null) {
                        a = new AppMeasurement(b2);
                    } else {
                        a = new AppMeasurement(Mb.a(context, null, null, null));
                    }
                }
            }
        }
        return a;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private static Lc b(Context context, Bundle bundle) {
        try {
            return (Lc) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", new Class[]{Context.class, Bundle.class}).invoke(null, new Object[]{context, bundle});
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.d) {
            this.c.b(str);
        } else {
            this.b.w().a(str, this.b.c().elapsedRealtime());
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.d) {
            this.c.clearConditionalUserProperty(str, str2, bundle);
        } else {
            this.b.x().a(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.b.x().a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.d) {
            this.c.c(str);
        } else {
            this.b.w().b(str, this.b.c().elapsedRealtime());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.d) {
            return this.c.d();
        }
        return this.b.F().t();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.d) {
            return this.c.a();
        }
        return this.b.x().D();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.d) {
            list = this.c.a(str, str2);
        } else {
            list = this.b.x().b(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.b.x().a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.d) {
            return this.c.e();
        }
        return this.b.x().A();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.d) {
            return this.c.b();
        }
        return this.b.x().B();
    }

    @Keep
    public String getGmpAppId() {
        if (this.d) {
            return this.c.c();
        }
        return this.b.x().C();
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public int getMaxUserProperties(String str) {
        if (this.d) {
            return this.c.a(str);
        }
        this.b.x();
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.d) {
            return this.c.a(str, str2, z);
        }
        return this.b.x().a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.b.x().a(str, str2, str3, z);
        throw null;
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.d) {
            this.c.a(str, str2, bundle);
        } else {
            this.b.x().b(str, str2, bundle);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.d) {
            this.c.a((C1165qc) onEventListener);
        } else {
            this.b.x().a((C1165qc) onEventListener);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (this.d) {
            this.c.a(conditionalUserProperty.a());
        } else {
            this.b.x().a(conditionalUserProperty.a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (this.d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.b.x().b(conditionalUserProperty.a());
        throw null;
    }

    private AppMeasurement(Lc lc) {
        Preconditions.checkNotNull(lc);
        this.c = lc;
        this.b = null;
        this.d = true;
    }

    public final void b(boolean z) {
        if (this.d) {
            this.c.setDataCollectionEnabled(z);
        } else {
            this.b.x().b(z);
        }
    }

    public static AppMeasurement a(Context context, Bundle bundle) {
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    Lc b2 = b(context, bundle);
                    if (b2 != null) {
                        a = new AppMeasurement(b2);
                    } else {
                        a = new AppMeasurement(Mb.a(context, null, null, bundle));
                    }
                }
            }
        }
        return a;
    }

    @ShowFirstParty
    @KeepForSdk
    public void a(String str, String str2, Object obj) {
        Preconditions.checkNotEmpty(str);
        if (this.d) {
            this.c.a(str, str2, obj);
        } else {
            this.b.x().a(str, str2, obj, true);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public Map<String, Object> a(boolean z) {
        if (this.d) {
            return this.c.a((String) null, (String) null, z);
        }
        List<zzjn> c2 = this.b.x().c(z);
        T t = new T(c2.size());
        for (zzjn zzjn : c2) {
            t.put(zzjn.b, zzjn.i());
        }
        return t;
    }
}

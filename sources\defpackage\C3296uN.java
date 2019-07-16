package defpackage;

import android.content.Context;
import com.crashlytics.android.a.C0031a;
import com.crashlytics.android.ndk.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0012J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J$\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/analytics/crashlytics/FabricProvider;", "", "context", "Landroid/content/Context;", "crashReportingHelper", "Lcom/soundcloud/android/analytics/crashlytics/CrashReportingHelper;", "(Landroid/content/Context;Lcom/soundcloud/android/analytics/crashlytics/CrashReportingHelper;)V", "executor", "Ljava/util/concurrent/Executor;", "createCrashlytics", "Lcom/crashlytics/android/Crashlytics;", "initialize", "", "isInitialized", "", "isReportingCrashes", "log", "priority", "", "tag", "", "message", "scheduleInFabricExecutor", "command", "Ljava/lang/Runnable;", "Companion", "FailedToLoadCrashlyticsNdkException", "base_release"}, mv = {1, 1, 15})
/* renamed from: uN reason: default package and case insensitive filesystem */
/* compiled from: FabricProvider.kt */
public class C3296uN {
    public static final a a = new a(null);
    private Executor b;
    private final Context c;
    private final C3236rN d;

    /* renamed from: uN$a */
    /* compiled from: FabricProvider.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final void a(Context context, C3236rN rNVar) {
            C7471uYa.b(context, "context");
            C7471uYa.b(rNVar, "crashReportingHelper");
            new C3296uN(context, rNVar);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: uN$b */
    /* compiled from: FabricProvider.kt */
    private static final class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public C3296uN(Context context, C3236rN rNVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(rNVar, "crashReportingHelper");
        this.c = context;
        this.d = rNVar;
        a();
    }

    @NXa
    public static final void a(Context context, C3236rN rNVar) {
        a.a(context, rNVar);
    }

    private com.crashlytics.android.a d() {
        C0031a aVar = new C0031a();
        defpackage.Ei.a aVar2 = new defpackage.Ei.a();
        aVar2.a(C3316vN.a);
        aVar.a(aVar2.a());
        com.crashlytics.android.a a2 = aVar.a();
        C7471uYa.a((Object) a2, "Crashlytics.Builder()\n  …d()\n            ).build()");
        return a2;
    }

    public final void a() {
        if (c()) {
            List d2 = C6918mWa.d(d(), new Rg());
            try {
                System.loadLibrary("crashlytics");
                d2.add(new c());
            } catch (UnsatisfiedLinkError e) {
                C7316sHa.a((Throwable) new b(e), "Supported ABIs", C5111MGa.a());
            }
            defpackage.C5328TMa.a aVar = new defpackage.C5328TMa.a(this.c);
            if (d2 != null) {
                Object[] array = d2.toArray(new C5531_Ma[0]);
                if (array != null) {
                    C5531_Ma[] _maArr = (C5531_Ma[]) array;
                    aVar.a((C5531_Ma[]) Arrays.copyOf(_maArr, _maArr.length));
                    C5328TMa c2 = C5328TMa.c(aVar.a());
                    C7471uYa.a((Object) c2, "fabric");
                    this.b = c2.b();
                    return;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    public void a(String str) {
        a(this, 0, null, str, 3, null);
    }

    public boolean b() {
        return C5328TMa.h();
    }

    public boolean c() {
        return this.d.c();
    }

    public static /* synthetic */ void a(C3296uN uNVar, int i, String str, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 3;
            }
            if ((i2 & 2) != 0) {
                str = "CrashlyticsCore";
            }
            uNVar.a(i, str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void a(int i, String str, String str2) {
        C7471uYa.b(str, "tag");
        C7471uYa.b(str2, "message");
        Ei ei = ((com.crashlytics.android.a) C5328TMa.a(com.crashlytics.android.a.class)).i;
        if (ei != null) {
            ei.a(i, str, str2);
        }
    }
}

package com.soundcloud.android.main;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/main/EnterScreenDispatcher;", "", "activity", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/main/RootActivity;", "getActivity", "()Lcom/soundcloud/java/optional/Optional;", "setActivity", "(Lcom/soundcloud/java/optional/Optional;)V", "currentDateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "getCurrentDateProvider", "()Lcom/soundcloud/android/utilities/android/date/DateProvider;", "setCurrentDateProvider", "(Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "listener", "Lcom/soundcloud/android/main/EnterScreenDispatcher$Listener;", "getListener", "setListener", "screenStateProvider", "Lcom/soundcloud/android/main/ScreenStateProvider;", "getScreenStateProvider", "()Lcom/soundcloud/android/main/ScreenStateProvider;", "onPageSelected", "", "position", "", "onPauseHelper", "onResumeHelper", "Listener", "base_release"}, mv = {1, 1, 15})
/* compiled from: EnterScreenDispatcher.kt */
public interface I {

    /* compiled from: EnterScreenDispatcher.kt */
    public static final class a {
        public static void a(I i, b bVar) {
            C7471uYa.b(bVar, CastExtraArgs.LISTENER);
            C4928GKa c = C4928GKa.c(bVar);
            C7471uYa.a((Object) c, "Optional.of(listener)");
            i.a(c);
        }

        public static void a(I i, RootActivity rootActivity) {
            C7471uYa.b(rootActivity, "activity");
            C4928GKa c = C4928GKa.c(rootActivity);
            C7471uYa.a((Object) c, "Optional.of(activity)");
            i.b(c);
            if (i.i().c() && i.h().l()) {
                ((b) i.i().b()).a(rootActivity);
            }
        }

        public static void a(I i) {
            C4928GKa a = C4928GKa.a();
            C7471uYa.a((Object) a, "Optional.absent()");
            i.b(a);
        }

        public static void a(I i, int i2) {
            i.n().a((C7733yKa<? super T>) new K<Object>(i, i2));
        }
    }

    /* compiled from: EnterScreenDispatcher.kt */
    public interface b {
        void a(RootActivity rootActivity);

        void a(RootActivity rootActivity, int i);
    }

    void a(C4928GKa<b> gKa);

    void b(C4928GKa<RootActivity> gKa);

    ia h();

    C4928GKa<b> i();

    C4928GKa<RootActivity> n();
}

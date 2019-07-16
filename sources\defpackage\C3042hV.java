package defpackage;

import com.soundcloud.android.features.record.J;

/* renamed from: hV reason: default package and case insensitive filesystem */
/* compiled from: CreatorsModule_ProvideRecordIntentProviderFactory */
public final class C3042hV implements C4961HMa<J> {
    private static final C3042hV a = new C3042hV();

    public static C3042hV a() {
        return a;
    }

    public static J b() {
        J a2 = C3023gV.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public J get() {
        return b();
    }
}

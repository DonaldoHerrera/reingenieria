package defpackage;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionChangedListener;

/* renamed from: MM reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2167MM implements OnAttributionChangedListener {
    private final /* synthetic */ C2243QM a;

    public /* synthetic */ C2167MM(C2243QM qm) {
        this.a = qm;
    }

    public final void onAttributionChanged(AdjustAttribution adjustAttribution) {
        this.a.a(adjustAttribution);
    }
}

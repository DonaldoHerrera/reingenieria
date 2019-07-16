package androidx.preference;

import androidx.preference.Preference.c;
import androidx.preference.PreferenceGroup.a;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: androidx.preference.a reason: case insensitive filesystem */
/* compiled from: CollapsiblePreferenceGroupController */
class C0393a implements c {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ C0394b b;

    C0393a(C0394b bVar, PreferenceGroup preferenceGroup) {
        this.b = bVar;
        this.a = preferenceGroup;
    }

    public boolean a(Preference preference) {
        this.a.h(BaseClientBuilder.API_PRIORITY_OTHER);
        this.b.a.c(preference);
        a da = this.a.da();
        if (da != null) {
            da.a();
        }
        return true;
    }
}

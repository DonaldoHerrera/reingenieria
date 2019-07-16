package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.preference.b reason: case insensitive filesystem */
/* compiled from: CollapsiblePreferenceGroupController */
final class C0394b {
    final x a;
    private final Context b;
    private boolean c = false;

    /* renamed from: androidx.preference.b$a */
    /* compiled from: CollapsiblePreferenceGroupController */
    static class a extends Preference {
        private long O;

        a(Context context, List<Preference> list, long j) {
            super(context);
            fa();
            a(list);
            this.O = j + 1000000;
        }

        private void a(List<Preference> list) {
            ArrayList arrayList = new ArrayList();
            CharSequence charSequence = null;
            for (Preference preference : list) {
                CharSequence K = preference.K();
                boolean z = preference instanceof PreferenceGroup;
                if (z && !TextUtils.isEmpty(K)) {
                    arrayList.add((PreferenceGroup) preference);
                }
                if (arrayList.contains(preference.getParent())) {
                    if (z) {
                        arrayList.add((PreferenceGroup) preference);
                    }
                } else if (!TextUtils.isEmpty(K)) {
                    if (charSequence == null) {
                        charSequence = K;
                    } else {
                        charSequence = b().getString(H.summary_collapsed_preference_list, new Object[]{charSequence, K});
                    }
                }
            }
            a(charSequence);
        }

        private void fa() {
            d(G.expand_button);
            c(E.ic_arrow_down_24dp);
            f(H.expand_button_title);
            e(C1325gg.INAPP_MESSAGE_DURATION_MIN_MILLIS);
        }

        public long getId() {
            return this.O;
        }

        public void a(C c) {
            super.a(c);
            c.a(false);
        }
    }

    C0394b(PreferenceGroup preferenceGroup, x xVar) {
        this.a = xVar;
        this.b = preferenceGroup.b();
    }

    private List<Preference> b(PreferenceGroup preferenceGroup) {
        this.c = false;
        boolean z = preferenceGroup.ca() != Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int ea = preferenceGroup.ea();
        int i = 0;
        for (int i2 = 0; i2 < ea; i2++) {
            Preference g = preferenceGroup.g(i2);
            if (g.Q()) {
                if (!z || i < preferenceGroup.ca()) {
                    arrayList.add(g);
                } else {
                    arrayList2.add(g);
                }
                if (!(g instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) g;
                    if (!preferenceGroup2.fa()) {
                        continue;
                    } else {
                        List<Preference> b2 = b(preferenceGroup2);
                        if (!z || !this.c) {
                            for (Preference preference : b2) {
                                if (!z || i < preferenceGroup.ca()) {
                                    arrayList.add(preference);
                                } else {
                                    arrayList2.add(preference);
                                }
                                i++;
                            }
                        } else {
                            throw new IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                    }
                }
            }
        }
        if (z && i > preferenceGroup.ca()) {
            arrayList.add(a(preferenceGroup, arrayList2));
        }
        this.c |= z;
        return arrayList;
    }

    public List<Preference> a(PreferenceGroup preferenceGroup) {
        return b(preferenceGroup);
    }

    private a a(PreferenceGroup preferenceGroup, List<Preference> list) {
        a aVar = new a(this.b, list, preferenceGroup.getId());
        aVar.a((c) new C0393a(this, preferenceGroup));
        return aVar;
    }
}

package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private a I;
    private List<Preference> J;
    private PreferenceGroup K;
    private boolean L;
    private boolean M;
    private final OnClickListener N;
    private Context a;
    private z b;
    private C0406n c;
    private long d;
    private boolean e;
    private b f;
    private c g;
    private int h;
    private int i;
    private CharSequence j;
    private CharSequence k;
    private int l;
    private Drawable m;
    private String n;
    private Intent o;
    private String p;
    private Bundle q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;
    private Object w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Creator<BaseSavedState> CREATOR = new C0405m();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface a {
        void b(Preference preference);

        void c(Preference preference);
    }

    public interface b {
        boolean a(Preference preference, Object obj);
    }

    public interface c {
        boolean a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.h = BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = 0;
        this.r = true;
        this.s = true;
        this.u = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.D = true;
        this.F = true;
        this.G = G.preference;
        this.N = new C0404l(this);
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J.Preference, i2, i3);
        this.l = C0286Za.b(obtainStyledAttributes, J.Preference_icon, J.Preference_android_icon, 0);
        this.n = C0286Za.b(obtainStyledAttributes, J.Preference_key, J.Preference_android_key);
        this.j = C0286Za.c(obtainStyledAttributes, J.Preference_title, J.Preference_android_title);
        this.k = C0286Za.c(obtainStyledAttributes, J.Preference_summary, J.Preference_android_summary);
        this.h = C0286Za.a(obtainStyledAttributes, J.Preference_order, J.Preference_android_order, (int) BaseClientBuilder.API_PRIORITY_OTHER);
        this.p = C0286Za.b(obtainStyledAttributes, J.Preference_fragment, J.Preference_android_fragment);
        this.G = C0286Za.b(obtainStyledAttributes, J.Preference_layout, J.Preference_android_layout, G.preference);
        this.H = C0286Za.b(obtainStyledAttributes, J.Preference_widgetLayout, J.Preference_android_widgetLayout, 0);
        this.r = C0286Za.a(obtainStyledAttributes, J.Preference_enabled, J.Preference_android_enabled, true);
        this.s = C0286Za.a(obtainStyledAttributes, J.Preference_selectable, J.Preference_android_selectable, true);
        this.u = C0286Za.a(obtainStyledAttributes, J.Preference_persistent, J.Preference_android_persistent, true);
        this.v = C0286Za.b(obtainStyledAttributes, J.Preference_dependency, J.Preference_android_dependency);
        int i4 = J.Preference_allowDividerAbove;
        this.A = C0286Za.a(obtainStyledAttributes, i4, i4, this.s);
        int i5 = J.Preference_allowDividerBelow;
        this.B = C0286Za.a(obtainStyledAttributes, i5, i5, this.s);
        if (obtainStyledAttributes.hasValue(J.Preference_defaultValue)) {
            this.w = a(obtainStyledAttributes, J.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(J.Preference_android_defaultValue)) {
            this.w = a(obtainStyledAttributes, J.Preference_android_defaultValue);
        }
        this.F = C0286Za.a(obtainStyledAttributes, J.Preference_shouldDisableView, J.Preference_android_shouldDisableView, true);
        this.C = obtainStyledAttributes.hasValue(J.Preference_singleLineTitle);
        if (this.C) {
            this.D = C0286Za.a(obtainStyledAttributes, J.Preference_singleLineTitle, J.Preference_android_singleLineTitle, true);
        }
        this.E = C0286Za.a(obtainStyledAttributes, J.Preference_iconSpaceReserved, J.Preference_android_iconSpaceReserved, false);
        int i6 = J.Preference_isPreferenceVisible;
        this.z = C0286Za.a(obtainStyledAttributes, i6, i6, true);
        obtainStyledAttributes.recycle();
    }

    private void ca() {
        if (w() != null) {
            a(true, this.w);
            return;
        }
        if (!ba() || !y().contains(this.n)) {
            Object obj = this.w;
            if (obj != null) {
                a(false, obj);
            }
        } else {
            a(true, (Object) null);
        }
    }

    private void da() {
        if (!TextUtils.isEmpty(this.v)) {
            Preference a2 = a(this.v);
            if (a2 != null) {
                a2.b(this);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Dependency \"");
            sb.append(this.v);
            sb.append("\" not found for preference \"");
            sb.append(this.n);
            sb.append("\" (title: \"");
            sb.append(this.j);
            sb.append("\"");
            throw new IllegalStateException(sb.toString());
        }
    }

    private void ea() {
        String str = this.v;
        if (str != null) {
            Preference a2 = a(str);
            if (a2 != null) {
                a2.c(this);
            }
        }
    }

    public CharSequence J() {
        return this.k;
    }

    public CharSequence K() {
        return this.j;
    }

    public final int L() {
        return this.H;
    }

    public boolean M() {
        return !TextUtils.isEmpty(this.n);
    }

    public boolean N() {
        return this.r && this.x && this.y;
    }

    public boolean O() {
        return this.u;
    }

    public boolean P() {
        return this.s;
    }

    public final boolean Q() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public void R() {
        a aVar = this.I;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void S() {
        a aVar = this.I;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    public void T() {
        da();
    }

    /* access modifiers changed from: protected */
    public void U() {
    }

    public void V() {
        ea();
        this.L = true;
    }

    /* access modifiers changed from: protected */
    public void W() {
        ea();
    }

    /* access modifiers changed from: protected */
    public Parcelable X() {
        this.M = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void Y() {
        if (N()) {
            U();
            c cVar = this.g;
            if (cVar == null || !cVar.a(this)) {
                z x2 = x();
                if (x2 != null) {
                    androidx.preference.z.c d2 = x2.d();
                    if (d2 != null && d2.onPreferenceTreeClick(this)) {
                        return;
                    }
                }
                if (this.o != null) {
                    b().startActivity(this.o);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void Z() {
        if (!TextUtils.isEmpty(this.n)) {
            this.t = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i2) {
        return null;
    }

    public void a(Mc mc) {
    }

    public void a(Intent intent) {
        this.o = intent;
    }

    public boolean aa() {
        return !N();
    }

    public void b(CharSequence charSequence) {
        if ((charSequence == null && this.j != null) || (charSequence != null && !charSequence.equals(this.j))) {
            this.j = charSequence;
            R();
        }
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }

    /* access modifiers changed from: protected */
    public boolean ba() {
        return this.b != null && O() && M();
    }

    public Bundle c() {
        if (this.q == null) {
            this.q = new Bundle();
        }
        return this.q;
    }

    public void d(int i2) {
        this.G = i2;
    }

    public String e() {
        return this.p;
    }

    public Intent f() {
        return this.o;
    }

    public String g() {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.d;
    }

    public PreferenceGroup getParent() {
        return this.K;
    }

    public String toString() {
        return d().toString();
    }

    public final int u() {
        return this.G;
    }

    public int v() {
        return this.h;
    }

    public C0406n w() {
        C0406n nVar = this.c;
        if (nVar != null) {
            return nVar;
        }
        z zVar = this.b;
        if (zVar != null) {
            return zVar.f();
        }
        return null;
    }

    public z x() {
        return this.b;
    }

    public SharedPreferences y() {
        if (this.b == null || w() != null) {
            return null;
        }
        return this.b.h();
    }

    public void a(C c2) {
        c2.itemView.setOnClickListener(this.N);
        c2.itemView.setId(this.i);
        TextView textView = (TextView) c2.a(16908310);
        int i2 = 8;
        if (textView != null) {
            CharSequence K2 = K();
            if (!TextUtils.isEmpty(K2)) {
                textView.setText(K2);
                textView.setVisibility(0);
                if (this.C) {
                    textView.setSingleLine(this.D);
                }
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) c2.a(16908304);
        if (textView2 != null) {
            CharSequence J2 = J();
            if (!TextUtils.isEmpty(J2)) {
                textView2.setText(J2);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) c2.a(16908294);
        if (imageView != null) {
            if (!(this.l == 0 && this.m == null)) {
                if (this.m == null) {
                    this.m = androidx.core.content.a.c(b(), this.l);
                }
                Drawable drawable = this.m;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.m != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.E ? 4 : 8);
            }
        }
        View a2 = c2.a(F.icon_frame);
        if (a2 == null) {
            a2 = c2.a(16908350);
        }
        if (a2 != null) {
            if (this.m != null) {
                a2.setVisibility(0);
            } else {
                if (this.E) {
                    i2 = 4;
                }
                a2.setVisibility(i2);
            }
        }
        if (this.F) {
            a(c2.itemView, N());
        } else {
            a(c2.itemView, true);
        }
        boolean P = P();
        c2.itemView.setFocusable(P);
        c2.itemView.setClickable(P);
        c2.a(this.A);
        c2.b(this.B);
    }

    public void d(String str) {
        this.n = str;
        if (this.t && !M()) {
            Z();
        }
    }

    public void e(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            S();
        }
    }

    public void f(int i2) {
        b((CharSequence) this.a.getString(i2));
    }

    public Context b() {
        return this.a;
    }

    public void c(int i2) {
        a(androidx.core.content.a.c(this.a, i2));
        this.l = i2;
    }

    private void b(Preference preference) {
        if (this.J == null) {
            this.J = new ArrayList();
        }
        this.J.add(preference);
        preference.a(this, aa());
    }

    /* access modifiers changed from: 0000 */
    public StringBuilder d() {
        StringBuilder sb = new StringBuilder();
        CharSequence K2 = K();
        if (!TextUtils.isEmpty(K2)) {
            sb.append(K2);
            sb.append(' ');
        }
        CharSequence J2 = J();
        if (!TextUtils.isEmpty(J2)) {
            sb.append(J2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    private void c(Preference preference) {
        List<Preference> list = this.J;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void c(Object obj) {
        this.w = obj;
    }

    public void b(boolean z2) {
        List<Preference> list = this.J;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Preference) list.get(i2)).a(this, z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(String str) {
        if (!ba()) {
            return false;
        }
        if (TextUtils.equals(str, b((String) null))) {
            return true;
        }
        C0406n w2 = w();
        if (w2 != null) {
            w2.b(this.n, str);
        } else {
            Editor a2 = this.b.a();
            a2.putString(this.n, str);
            a(a2);
        }
        return true;
    }

    public void b(Preference preference, boolean z2) {
        if (this.y == z2) {
            this.y = !z2;
            b(aa());
            R();
        }
    }

    public void d(Bundle bundle) {
        b(bundle);
    }

    /* access modifiers changed from: protected */
    public String b(String str) {
        if (!ba()) {
            return str;
        }
        C0406n w2 = w();
        if (w2 != null) {
            return w2.a(this.n, str);
        }
        return this.b.h().getString(this.n, str);
    }

    /* access modifiers changed from: protected */
    public boolean c(boolean z2) {
        if (!ba()) {
            return false;
        }
        if (z2 == a(!z2)) {
            return true;
        }
        C0406n w2 = w();
        if (w2 != null) {
            w2.b(this.n, z2);
        } else {
            Editor a2 = this.b.a();
            a2.putBoolean(this.n, z2);
            a(a2);
        }
        return true;
    }

    public boolean b(Set<String> set) {
        if (!ba()) {
            return false;
        }
        if (set.equals(a(null))) {
            return true;
        }
        C0406n w2 = w();
        if (w2 != null) {
            w2.b(this.n, set);
        } else {
            Editor a2 = this.b.a();
            a2.putStringSet(this.n, set);
            a(a2);
        }
        return true;
    }

    public void c(Bundle bundle) {
        a(bundle);
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2) {
        if (!ba()) {
            return false;
        }
        if (i2 == a(~i2)) {
            return true;
        }
        C0406n w2 = w();
        if (w2 != null) {
            w2.b(this.n, i2);
        } else {
            Editor a2 = this.b.a();
            a2.putInt(this.n, i2);
            a(a2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void b(Bundle bundle) {
        if (M()) {
            this.M = false;
            Parcelable X = X();
            if (!this.M) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (X != null) {
                bundle.putParcelable(this.n, X);
            }
        }
    }

    private void a(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0286Za.a(context, D.preferenceStyle, 16842894));
    }

    public void a(Drawable drawable) {
        if ((drawable == null && this.m != null) || (drawable != null && this.m != drawable)) {
            this.m = drawable;
            this.l = 0;
            R();
        }
    }

    public Preference(Context context) {
        this(context, null);
    }

    public void a(CharSequence charSequence) {
        if ((charSequence == null && this.k != null) || (charSequence != null && !charSequence.equals(this.k))) {
            this.k = charSequence;
            R();
        }
    }

    public boolean a(Object obj) {
        b bVar = this.f;
        return bVar == null || bVar.a(this, obj);
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public void a(c cVar) {
        this.g = cVar;
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        Y();
    }

    /* renamed from: a */
    public int compareTo(Preference preference) {
        int i2 = this.h;
        int i3 = preference.h;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.j;
        CharSequence charSequence2 = preference.j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.j.toString());
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        this.I = aVar;
    }

    /* access modifiers changed from: protected */
    public void a(z zVar) {
        this.b = zVar;
        if (!this.e) {
            this.d = zVar.b();
        }
        ca();
    }

    /* access modifiers changed from: protected */
    public void a(z zVar, long j2) {
        this.d = j2;
        this.e = true;
        try {
            a(zVar);
        } finally {
            this.e = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(PreferenceGroup preferenceGroup) {
        this.K = preferenceGroup;
    }

    public final void a() {
        this.L = false;
    }

    /* access modifiers changed from: protected */
    public Preference a(String str) {
        if (!TextUtils.isEmpty(str)) {
            z zVar = this.b;
            if (zVar != null) {
                return zVar.a((CharSequence) str);
            }
        }
        return null;
    }

    public void a(Preference preference, boolean z2) {
        if (this.x == z2) {
            this.x = !z2;
            b(aa());
            R();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void a(boolean z2, Object obj) {
        b(obj);
    }

    private void a(Editor editor) {
        if (this.b.i()) {
            editor.apply();
        }
    }

    public Set<String> a(Set<String> set) {
        if (!ba()) {
            return set;
        }
        C0406n w2 = w();
        if (w2 != null) {
            return w2.a(this.n, set);
        }
        return this.b.h().getStringSet(this.n, set);
    }

    /* access modifiers changed from: protected */
    public int a(int i2) {
        if (!ba()) {
            return i2;
        }
        C0406n w2 = w();
        if (w2 != null) {
            return w2.a(this.n, i2);
        }
        return this.b.h().getInt(this.n, i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(boolean z2) {
        if (!ba()) {
            return z2;
        }
        C0406n w2 = w();
        if (w2 != null) {
            return w2.a(this.n, z2);
        }
        return this.b.h().getBoolean(this.n, z2);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bundle bundle) {
        if (M()) {
            Parcelable parcelable = bundle.getParcelable(this.n);
            if (parcelable != null) {
                this.M = false;
                a(parcelable);
                if (!this.M) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        this.M = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}

package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.E;

/* renamed from: uM reason: default package and case insensitive filesystem */
/* compiled from: ScreenPublisher.kt */
final class C3295uM<T1, T2, R> implements C6504gQa<E, Ul<? extends AppCompatActivity>, Ul<? extends HVa<? extends E, ? extends AppCompatActivity>>> {
    public static final C3295uM a = new C3295uM();

    C3295uM() {
    }

    /* renamed from: a */
    public final Ul<HVa<E, AppCompatActivity>> apply(E e, Ul<? extends AppCompatActivity> ul) {
        C7471uYa.b(e, "screenEvent");
        C7471uYa.b(ul, "appCompatActivityOpt");
        return ul instanceof Wl ? new Wl(NVa.a(e, ((Wl) ul).a())) : Tl.b;
    }
}

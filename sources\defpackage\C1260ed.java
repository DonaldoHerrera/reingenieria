package defpackage;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ed reason: default package and case insensitive filesystem */
/* compiled from: LoaderManager */
public abstract class C1260ed {

    /* renamed from: ed$a */
    /* compiled from: LoaderManager */
    public interface a<D> {
        void a(C1384id<D> idVar);

        void a(C1384id<D> idVar, D d);

        C1384id<D> onCreateLoader(int i, Bundle bundle);
    }

    public static <T extends h & w> C1260ed a(T t) {
        return new C1291fd(t, ((w) t).getViewModelStore());
    }

    public abstract <D> C1384id<D> a(int i, Bundle bundle, a<D> aVar);

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}

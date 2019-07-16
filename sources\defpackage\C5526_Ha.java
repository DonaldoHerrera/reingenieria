package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: _Ha reason: default package and case insensitive filesystem */
/* compiled from: Urns */
public final class C5526_Ha {
    public static final Function<C3508cda, Long> a = C4955HGa.a;
    public static final Predicate<C3508cda> b = C4893FGa.a;
    public static final Predicate<C3508cda> c = C4831DGa.a;

    private C5526_Ha() {
    }

    static /* synthetic */ boolean b(C3508cda cda) {
        return !cda.x();
    }

    static /* synthetic */ boolean c(C3508cda cda) {
        return cda.c() > 0;
    }

    public static List<Long> a(List<C3508cda> list) {
        return C2063HD.a(list, a);
    }

    public static ArrayList<String> b(List<C3508cda> list) {
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (C3508cda b2 : list) {
            arrayList.add(b2.b());
        }
        return arrayList;
    }

    public static Collection<Long> a(Collection<C3508cda> collection) {
        return C3063jD.a(collection, a);
    }

    public static C4928GKa<C3508cda> a(Bundle bundle, String str) {
        return C4928GKa.b(b(bundle, str));
    }

    public static C3508cda a(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            return new C3508cda(stringExtra);
        }
        return null;
    }

    public static C3508cda b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(str);
        if (string != null) {
            return new C3508cda(string);
        }
        return null;
    }

    public static List<C3508cda> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (!arrayList.isEmpty()) {
            return C2063HD.a((List<F>) arrayList, (Function<? super F, ? extends T>) C5080LGa.a);
        }
        return null;
    }

    public static List<C3508cda> b(Intent intent, String str) {
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra(str);
        if (stringArrayListExtra != null) {
            return C2063HD.a((List<F>) stringArrayListExtra, (Function<? super F, ? extends T>) C5080LGa.a);
        }
        return null;
    }

    public static void b(Bundle bundle, String str, C3508cda cda) {
        bundle.putString(str, cda != null ? cda.b() : null);
    }

    public static void a(Parcel parcel, List<C3508cda> list) {
        parcel.writeStringList(list != null ? C2063HD.a(list, (Function<? super F, ? extends T>) C7798zGa.a) : null);
    }

    public static Intent b(Intent intent, String str, C3508cda cda) {
        return intent.putExtra(str, cda.b());
    }

    public static void a(Bundle bundle, String str, C4928GKa<C3508cda> gKa) {
        gKa.a((C7733yKa<? super T>) new C4924GGa<Object>(bundle, str));
    }

    public static Intent a(Intent intent, String str, C4928GKa<C3508cda> gKa) {
        gKa.a((C7733yKa<? super T>) new C4862EGa<Object>(intent, str));
        return intent;
    }

    public static Intent a(Intent intent, String str, List<C3508cda> list) {
        return intent.putStringArrayListExtra(str, new ArrayList(C2063HD.a(list, (Function<? super F, ? extends T>) C7798zGa.a)));
    }
}

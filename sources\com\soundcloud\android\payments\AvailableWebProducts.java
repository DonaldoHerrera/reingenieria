package com.soundcloud.android.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u0006\u0010\u000e\u001a\u00020\u0007J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/payments/AvailableWebProducts;", "Landroid/os/Parcelable;", "products", "", "Lcom/soundcloud/android/payments/WebProduct;", "(Ljava/util/List;)V", "<set-?>", "", "productsSize", "getProductsSize", "()I", "describeContents", "highTier", "Lcom/soundcloud/java/optional/Optional;", "highTierIndex", "midTier", "midTierIndex", "studentTier", "studentTierIndex", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments_release"}, mv = {1, 1, 15})
/* compiled from: AvailableWebProducts.kt */
public final class AvailableWebProducts implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a a = new a(null);
    private final List<WebProduct> b;

    /* compiled from: AvailableWebProducts.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final AvailableWebProducts a() {
            return new AvailableWebProducts(C6918mWa.a());
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final AvailableWebProducts a(List<WebProduct> list) {
            C7471uYa.b(list, "products");
            return new AvailableWebProducts(list);
        }
    }

    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7471uYa.b(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((WebProduct) WebProduct.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new AvailableWebProducts(arrayList);
        }

        public final Object[] newArray(int i) {
            return new AvailableWebProducts[i];
        }
    }

    public AvailableWebProducts(List<WebProduct> list) {
        C7471uYa.b(list, "products");
        this.b = list;
    }

    @NXa
    public static final AvailableWebProducts a() {
        return a.a();
    }

    @NXa
    public static final AvailableWebProducts a(List<WebProduct> list) {
        return a.a(list);
    }

    public final int b() {
        List b2 = C6918mWa.b((Object[]) new Boolean[]{Boolean.valueOf(e().c()), Boolean.valueOf(c().c()), Boolean.valueOf(g().c())});
        ArrayList arrayList = new ArrayList();
        for (Object next : b2) {
            if (((Boolean) next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public final C4928GKa<WebProduct> c() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) ((WebProduct) obj).d(), (Object) "high_tier")) {
                break;
            }
        }
        C4928GKa<WebProduct> b2 = C4928GKa.b(obj);
        C7471uYa.a((Object) b2, "Optional.fromNullable(pr…d == HIGH_TIER_PLAN_ID })");
        return b2;
    }

    public final int d() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public final C4928GKa<WebProduct> e() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) ((WebProduct) obj).d(), (Object) "mid_tier")) {
                break;
            }
        }
        C4928GKa<WebProduct> b2 = C4928GKa.b(obj);
        C7471uYa.a((Object) b2, "Optional.fromNullable(pr…Id == MID_TIER_PLAN_ID })");
        return b2;
    }

    public final int f() {
        return (g().c() ? h() : d()) + 1;
    }

    public final C4928GKa<WebProduct> g() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) ((WebProduct) obj).d(), (Object) "student_tier")) {
                break;
            }
        }
        C4928GKa<WebProduct> b2 = C4928GKa.b(obj);
        C7471uYa.a((Object) b2, "Optional.fromNullable(pr…= STUDENT_TIER_PLAN_ID })");
        return b2;
    }

    public final int h() {
        if (g().c()) {
            return d() + 1;
        }
        return -1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7471uYa.b(parcel, "parcel");
        List<WebProduct> list = this.b;
        parcel.writeInt(list.size());
        for (WebProduct writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}

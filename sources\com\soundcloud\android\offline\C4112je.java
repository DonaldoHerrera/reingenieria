package com.soundcloud.android.offline;

import com.soundcloud.android.collections.data.K;

/* renamed from: com.soundcloud.android.offline.je reason: case insensitive filesystem */
/* compiled from: OfflineStateOperations_Factory */
public final class C4112je implements C4961HMa<C4106ie> {
    private final C7054oVa<K> a;
    private final C7054oVa<Gd> b;
    private final C7054oVa<De> c;
    private final C7054oVa<C6332dsa> d;
    private final C7054oVa<C5421Wpa> e;
    private final C7054oVa<HPa> f;

    public C4112je(C7054oVa<K> ova, C7054oVa<Gd> ova2, C7054oVa<De> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C5421Wpa> ova5, C7054oVa<HPa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C4112je a(C7054oVa<K> ova, C7054oVa<Gd> ova2, C7054oVa<De> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C5421Wpa> ova5, C7054oVa<HPa> ova6) {
        C4112je jeVar = new C4112je(ova, ova2, ova3, ova4, ova5, ova6);
        return jeVar;
    }

    public static C4106ie a(K k, Gd gd, De de, C6332dsa dsa, C5421Wpa wpa, HPa hPa) {
        C4106ie ieVar = new C4106ie(k, gd, de, dsa, wpa, hPa);
        return ieVar;
    }

    public C4106ie get() {
        C4106ie ieVar = new C4106ie((K) this.a.get(), (Gd) this.b.get(), (De) this.c.get(), (C6332dsa) this.d.get(), (C5421Wpa) this.e.get(), (HPa) this.f.get());
        return ieVar;
    }
}

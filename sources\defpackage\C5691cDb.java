package defpackage;

/* renamed from: cDb reason: default package and case insensitive filesystem */
/* compiled from: DefaultInterfaceTemporal */
public abstract class C5691cDb extends C6287dDb implements C6967nDb {
    public C6967nDb a(C7105pDb pdb) {
        return pdb.a(this);
    }

    public C6967nDb a(C7312sDb sdb) {
        return sdb.a(this);
    }

    public C6967nDb a(long j, DDb dDb) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, dDb).b(1, dDb) : b(-j, dDb);
    }
}

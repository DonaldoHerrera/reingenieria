package com.soundcloud.android.offline;

import java.util.Set;

/* compiled from: OfflineAuditMigration.kt */
public final class Nd extends Exception {
    public Nd(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Missing offline file count: ");
        sb.append(i);
        super(sb.toString());
    }

    public Nd(Set<C3508cda> set) {
        C7471uYa.b(set, "missingFiles");
        StringBuilder sb = new StringBuilder();
        sb.append("Missing offline file count: ");
        sb.append(set.size());
        sb.append(" -> ");
        sb.append(C7676xWa.a(set, null, null, null, 0, null, null, 63, null));
        super(sb.toString());
    }
}

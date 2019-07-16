package com.soundcloud.android.settings.notifications;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: NotificationPreferenceType */
enum i {
    MESSAGES("messages", null, "messages_mail"),
    GROUPS("groups", null, "groups_mail"),
    NEWSLETTERS("newsletters", null, "newsletters_mail"),
    COMMENTS("comments", "comments_mobile", "comments_mail"),
    FOLLOWS("follows", "follows_mobile", "follows_mail"),
    NEW_CONTENT("newContent", "newContent_mobile", "newContent_mail"),
    LIKES("likes", "likes_mobile", "likes_mail"),
    REPOSTS("reposts", "reposts_mobile", "reposts_mail"),
    PRODUCT_UPDATES("productUpdates", "productUpdates_mobile", "productUpdates_mail"),
    SURVEYS("surveys", "surveys_mobile", "surveys_mail"),
    TIPS("tips", "tips_mobile", "tips_mail"),
    RECOMMENDATIONS("recommendations", "recommendations_mobile", "recommendations_mail");
    
    private static EnumSet<i> m;
    private static EnumSet<i> n;
    private static final Function<i, String> o = null;
    private static final Function<i, String> p = null;
    private final String r;
    private final C4928GKa<String> s;
    private final C4928GKa<String> t;

    static {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        i iVar7;
        i iVar8;
        i iVar9;
        m = EnumSet.of(iVar, new i[]{iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9});
        n = EnumSet.of(MESSAGES, new i[]{GROUPS, NEWSLETTERS, COMMENTS, FOLLOWS, NEW_CONTENT, LIKES, REPOSTS, PRODUCT_UPDATES, SURVEYS, TIPS, RECOMMENDATIONS});
        o = a.a;
        p = b.a;
    }

    private i(String str, String str2, String str3) {
        this.r = str;
        this.s = C4928GKa.b(str2);
        this.t = C4928GKa.b(str3);
    }

    static Collection<String> c() {
        return C3063jD.a((Collection<F>) n, p);
    }

    static Collection<String> e() {
        return C3063jD.a((Collection<F>) m, o);
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> d() {
        return this.s;
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.r;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<String> b() {
        return this.t;
    }

    static C4928GKa<i> a(String str) {
        i[] values;
        for (i iVar : values()) {
            if (iVar.a().equals(str)) {
                return C4928GKa.c(iVar);
            }
        }
        return C4928GKa.a();
    }
}

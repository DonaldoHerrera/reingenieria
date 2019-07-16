package defpackage;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: oxb reason: default package and case insensitive filesystem */
/* compiled from: Regex.kt */
final class C7093oxb implements C6819kxb {
    private final C6683ixb a = new C7024nxb(this);
    private List<String> b;
    private final Matcher c;
    private final CharSequence d;

    public C7093oxb(Matcher matcher, CharSequence charSequence) {
        C7471uYa.b(matcher, "matcher");
        C7471uYa.b(charSequence, "input");
        this.c = matcher;
        this.d = charSequence;
    }

    /* access modifiers changed from: private */
    public final MatchResult c() {
        return this.c;
    }

    public List<String> b() {
        if (this.b == null) {
            this.b = new C6887lxb(this);
        }
        List<String> list = this.b;
        if (list != null) {
            return list;
        }
        C7471uYa.a();
        throw null;
    }

    public b a() {
        return a.a(this);
    }
}

package defpackage;

import java.util.Arrays;

/* renamed from: Lpb reason: default package */
/* compiled from: constantValues.kt */
public final class Lpb extends Wpb<Character> {
    public Lpb(char c) {
        super(Character.valueOf(c));
    }

    private final boolean b(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    public String toString() {
        Object[] objArr = {Integer.valueOf(((Character) a()).charValue()), a(((Character) a()).charValue())};
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, objArr.length));
        C7471uYa.a((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb k = fdb.E().k();
        C7471uYa.a((Object) k, "module.builtIns.charType");
        return k;
    }

    private final String a(char c) {
        switch (c) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                String ch = b(c) ? Character.toString(c) : "?";
                C7471uYa.a((Object) ch, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
                return ch;
        }
    }
}

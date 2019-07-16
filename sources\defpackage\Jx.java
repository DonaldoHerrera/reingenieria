package defpackage;

/* renamed from: Jx reason: default package */
final class Jx {
    static String a(C0289Zv zv) {
        Mx mx = new Mx(zv);
        StringBuilder sb = new StringBuilder(mx.size());
        for (int i = 0; i < mx.size(); i++) {
            byte c = mx.c(i);
            if (c == 34) {
                sb.append("\\\"");
            } else if (c == 39) {
                sb.append("\\'");
            } else if (c != 92) {
                switch (c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c >= 32 && c <= 126) {
                            sb.append((char) c);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((c >>> 6) & 3) + 48));
                            sb.append((char) (((c >>> 3) & 7) + 48));
                            sb.append((char) ((c & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

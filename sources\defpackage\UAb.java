package defpackage;

/* renamed from: UAb reason: default package */
/* compiled from: OptionValidator */
class UAb {
    static void a(String str) throws IllegalArgumentException {
        if (str != null) {
            String str2 = "'";
            int i = 0;
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                if (!b(charAt)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("illegal option value '");
                    stringBuffer.append(charAt);
                    stringBuffer.append(str2);
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            } else {
                char[] charArray = str.toCharArray();
                while (i < charArray.length) {
                    if (a(charArray[i])) {
                        i++;
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("opt contains illegal character value '");
                        stringBuffer2.append(charArray[i]);
                        stringBuffer2.append(str2);
                        throw new IllegalArgumentException(stringBuffer2.toString());
                    }
                }
            }
        }
    }

    private static boolean b(char c) {
        return a(c) || c == ' ' || c == '?' || c == '@';
    }

    private static boolean a(char c) {
        return Character.isJavaIdentifierPart(c);
    }
}

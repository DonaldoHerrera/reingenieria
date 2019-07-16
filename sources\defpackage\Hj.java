package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: Hj reason: default package */
/* compiled from: FastXmlSerializer */
class Hj implements XmlSerializer {
    private static final String[] a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    private static String b = "                                                              ";
    private final char[] c = new char[8192];
    private int d;
    private Writer e;
    private OutputStream f;
    private CharsetEncoder g;
    private ByteBuffer h = ByteBuffer.allocate(8192);
    private boolean i = false;
    private boolean j;
    private int k = 0;
    private boolean l = true;

    Hj() {
    }

    private void a(char c2) throws IOException {
        int i2 = this.d;
        if (i2 >= 8191) {
            flush();
            i2 = this.d;
        }
        this.c[i2] = c2;
        this.d = i2 + 1;
    }

    private void b(String str) throws IOException {
        int length = str.length();
        String[] strArr = a;
        char length2 = (char) strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i3 < i2) {
                        a(str, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    a(str2);
                }
            }
            i2++;
        }
        if (i3 < i2) {
            a(str, i3, i2 - i3);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        a(' ');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        a("=\"");
        b(str3);
        a('\"');
        this.l = false;
        return this;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.k--;
        if (this.j) {
            a(" />\n");
        } else {
            if (this.i && this.l) {
                a(this.k);
            }
            a("</");
            if (str != null) {
                a(str);
                a(':');
            }
            a(str2);
            a(">\n");
        }
        this.l = true;
        this.j = false;
        return this;
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void flush() throws IOException {
        int i2 = this.d;
        if (i2 > 0) {
            if (this.f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.c, 0, i2);
                CoderResult encode = this.g.encode(wrap, this.h, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        a();
                        encode = this.g.encode(wrap, this.h, true);
                    } else {
                        a();
                        this.f.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.e.write(this.c, 0, i2);
            this.e.flush();
            this.d = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.i = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.g = Charset.forName(str).newEncoder();
                this.f = outputStream;
            } catch (IllegalCharsetNameException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            } catch (UnsupportedCharsetException e3) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e3));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        a(sb.toString());
        this.l = true;
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.j) {
            a(">\n");
        }
        if (this.i) {
            a(this.k);
        }
        this.k++;
        a('<');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        this.j = true;
        this.l = false;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i2, int i3) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.j) {
            a(">");
            this.j = false;
        }
        b(cArr, i2, i3);
        if (this.i) {
            int i4 = i2 + i3;
            boolean z = true;
            if (cArr[i4 - 1] != 10) {
                z = false;
            }
            this.l = z;
        }
        return this;
    }

    private void a(String str, int i2, int i3) throws IOException {
        if (i3 > 8192) {
            int i4 = i3 + i2;
            while (i2 < i4) {
                int i5 = i2 + 8192;
                a(str, i2, i5 < i4 ? 8192 : i4 - i2);
                i2 = i5;
            }
            return;
        }
        int i6 = this.d;
        if (i6 + i3 > 8192) {
            flush();
            i6 = this.d;
        }
        str.getChars(i2, i2 + i3, this.c, i6);
        this.d = i6 + i3;
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = false;
        if (this.j) {
            a(">");
            this.j = false;
        }
        b(str);
        if (this.i) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == 10) {
                z = true;
            }
            this.l = z;
        }
        return this;
    }

    private void b(char[] cArr, int i2, int i3) throws IOException {
        String[] strArr = a;
        char length = (char) strArr.length;
        int i4 = i3 + i2;
        int i5 = i2;
        while (i2 < i4) {
            char c2 = cArr[i2];
            if (c2 < length) {
                String str = strArr[c2];
                if (str != null) {
                    if (i5 < i2) {
                        a(cArr, i5, i2 - i5);
                    }
                    i5 = i2 + 1;
                    a(str);
                }
            }
            i2++;
        }
        if (i5 < i2) {
            a(cArr, i5, i2 - i5);
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.e = writer;
    }

    private void a(char[] cArr, int i2, int i3) throws IOException {
        if (i3 > 8192) {
            int i4 = i3 + i2;
            while (i2 < i4) {
                int i5 = i2 + 8192;
                a(cArr, i2, i5 < i4 ? 8192 : i4 - i2);
                i2 = i5;
            }
            return;
        }
        int i6 = this.d;
        if (i6 + i3 > 8192) {
            flush();
            i6 = this.d;
        }
        System.arraycopy(cArr, i2, this.c, i6, i3);
        this.d = i6 + i3;
    }

    private void a(String str) throws IOException {
        a(str, 0, str.length());
    }

    private void a(int i2) throws IOException {
        int i3 = i2 * 4;
        if (i3 > b.length()) {
            i3 = b.length();
        }
        a(b, 0, i3);
    }

    private void a() throws IOException {
        int position = this.h.position();
        if (position > 0) {
            this.h.flip();
            this.f.write(this.h.array(), 0, position);
            this.h.clear();
        }
    }
}

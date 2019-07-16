package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[ChainedTransformer(");
            sb.append(this._t1);
            sb.append(", ");
            sb.append(this._t2);
            sb.append(")]");
            return sb.toString();
        }

        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    protected static final class NopTransformer extends NameTransformer implements Serializable {
        protected NopTransformer() {
        }

        public String transform(String str) {
            return str;
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = true;
        boolean z2 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z = false;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() {
                    public String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("[PreAndSuffixTransformer('");
                        sb.append(str);
                        sb.append("','");
                        sb.append(str2);
                        sb.append("')]");
                        return sb.toString();
                    }

                    public String transform(String str) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str);
                        sb.append(str2);
                        return sb.toString();
                    }
                };
            }
            return new NameTransformer() {
                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[PrefixTransformer('");
                    sb.append(str);
                    sb.append("')]");
                    return sb.toString();
                }

                public String transform(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str);
                    return sb.toString();
                }
            };
        } else if (z) {
            return new NameTransformer() {
                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[SuffixTransformer('");
                    sb.append(str2);
                    sb.append("')]");
                    return sb.toString();
                }

                public String transform(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    return sb.toString();
                }
            };
        } else {
            return NOP;
        }
    }

    public abstract String transform(String str);
}

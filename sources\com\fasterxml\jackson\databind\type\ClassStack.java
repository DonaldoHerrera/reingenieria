package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.soundcloud.flippernative.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        for (ClassStack classStack = this._parent; classStack != null; classStack = classStack._parent) {
            if (classStack._current == cls) {
                return classStack;
            }
        }
        return null;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ResolvedRecursiveType) it.next()).setReference(javaType);
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList == null) {
            str = BuildConfig.VERSION_NAME;
        } else {
            str = String.valueOf(arrayList.size());
        }
        sb.append(str);
        sb.append(')');
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            sb.append(' ');
            sb.append(classStack._current.getName());
        }
        sb.append(']');
        return sb.toString();
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }
}

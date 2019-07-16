package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Value;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    /* renamed from: com.fasterxml.jackson.databind.introspect.VisibilityChecker$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 3;
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 4;
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 5;
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std DEFAULT;
        protected final Visibility _creatorMinLevel;
        protected final Visibility _fieldMinLevel;
        protected final Visibility _getterMinLevel;
        protected final Visibility _isGetterMinLevel;
        protected final Visibility _setterMinLevel;

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            Visibility visibility2 = Visibility.ANY;
            Std std = new Std(visibility, visibility, visibility2, visibility2, Visibility.PUBLIC_ONLY);
            DEFAULT = std;
        }

        public Std(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility2;
            this._setterMinLevel = visibility3;
            this._creatorMinLevel = visibility4;
            this._fieldMinLevel = visibility5;
        }

        private Visibility _defaultOrOverride(Visibility visibility, Visibility visibility2) {
            return visibility2 == Visibility.DEFAULT ? visibility : visibility2;
        }

        public static Std defaultInstance() {
            return DEFAULT;
        }

        /* access modifiers changed from: protected */
        public Std _with(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == this._getterMinLevel && visibility2 == this._isGetterMinLevel && visibility3 == this._setterMinLevel && visibility4 == this._creatorMinLevel && visibility5 == this._fieldMinLevel) {
                return this;
            }
            Std std = new Std(visibility, visibility2, visibility3, visibility4, visibility5);
            return std;
        }

        public boolean isCreatorVisible(Member member) {
            return this._creatorMinLevel.isVisible(member);
        }

        public boolean isFieldVisible(Field field) {
            return this._fieldMinLevel.isVisible(field);
        }

        public boolean isGetterVisible(Method method) {
            return this._getterMinLevel.isVisible(method);
        }

        public boolean isIsGetterVisible(Method method) {
            return this._isGetterMinLevel.isVisible(method);
        }

        public boolean isSetterVisible(Method method) {
            return this._setterMinLevel.isVisible(method);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel});
        }

        public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
            return isCreatorVisible(annotatedMember.getMember());
        }

        public boolean isFieldVisible(AnnotatedField annotatedField) {
            return isFieldVisible(annotatedField.getAnnotated());
        }

        public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
            return isGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
            return isIsGetterVisible(annotatedMethod.getAnnotated());
        }

        public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
            return isSetterVisible(annotatedMethod.getAnnotated());
        }

        public Std with(JsonAutoDetect jsonAutoDetect) {
            if (jsonAutoDetect == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, jsonAutoDetect.getterVisibility()), _defaultOrOverride(this._isGetterMinLevel, jsonAutoDetect.isGetterVisibility()), _defaultOrOverride(this._setterMinLevel, jsonAutoDetect.setterVisibility()), _defaultOrOverride(this._creatorMinLevel, jsonAutoDetect.creatorVisibility()), _defaultOrOverride(this._fieldMinLevel, jsonAutoDetect.fieldVisibility()));
        }

        public Std withCreatorVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._creatorMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._creatorMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
            return std;
        }

        public Std withFieldVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._fieldMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._fieldMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility2);
            return std;
        }

        public Std withGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._getterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._getterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withIsGetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._isGetterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._isGetterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withOverrides(Value value) {
            if (value == null) {
                return this;
            }
            return _with(_defaultOrOverride(this._getterMinLevel, value.getGetterVisibility()), _defaultOrOverride(this._isGetterMinLevel, value.getIsGetterVisibility()), _defaultOrOverride(this._setterMinLevel, value.getSetterVisibility()), _defaultOrOverride(this._creatorMinLevel, value.getCreatorVisibility()), _defaultOrOverride(this._fieldMinLevel, value.getFieldVisibility()));
        }

        public Std withSetterVisibility(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                visibility = DEFAULT._setterMinLevel;
            }
            Visibility visibility2 = visibility;
            if (this._setterMinLevel == visibility2) {
                return this;
            }
            Std std = new Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
            return std;
        }

        public Std withVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
            switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[propertyAccessor.ordinal()]) {
                case 1:
                    return withGetterVisibility(visibility);
                case 2:
                    return withSetterVisibility(visibility);
                case 3:
                    return withCreatorVisibility(visibility);
                case 4:
                    return withFieldVisibility(visibility);
                case 5:
                    return withIsGetterVisibility(visibility);
                case 6:
                    return with(visibility);
                default:
                    return this;
            }
        }

        public Std(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                Std std = DEFAULT;
                this._getterMinLevel = std._getterMinLevel;
                this._isGetterMinLevel = std._isGetterMinLevel;
                this._setterMinLevel = std._setterMinLevel;
                this._creatorMinLevel = std._creatorMinLevel;
                this._fieldMinLevel = std._fieldMinLevel;
                return;
            }
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility;
            this._setterMinLevel = visibility;
            this._creatorMinLevel = visibility;
            this._fieldMinLevel = visibility;
        }

        public Std with(Visibility visibility) {
            if (visibility == Visibility.DEFAULT) {
                return DEFAULT;
            }
            return new Std(visibility);
        }
    }

    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isFieldVisible(AnnotatedField annotatedField);

    boolean isGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isIsGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isSetterVisible(AnnotatedMethod annotatedMethod);

    T with(JsonAutoDetect jsonAutoDetect);

    T withCreatorVisibility(Visibility visibility);

    T withFieldVisibility(Visibility visibility);

    T withGetterVisibility(Visibility visibility);

    T withIsGetterVisibility(Visibility visibility);

    T withOverrides(Value value);

    T withSetterVisibility(Visibility visibility);

    T withVisibility(PropertyAccessor propertyAccessor, Visibility visibility);
}

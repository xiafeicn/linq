package com.bestvike.tuple;

import com.bestvike.collections.IStructuralComparable;
import com.bestvike.collections.IStructuralEquatable;
import com.bestvike.collections.generic.Comparer;
import com.bestvike.collections.generic.EqualityComparer;
import com.bestvike.collections.generic.IEqualityComparer;
import com.bestvike.linq.exception.Errors;

import java.util.Comparator;

/**
 * Created by 许崇雷 on 2017/7/23.
 */
@SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
public final class Tuple7<T1, T2, T3, T4, T5, T6, T7> implements IStructuralEquatable, IStructuralComparable, Comparable, ITupleInternal, ITuple {
    private final T1 item1;
    private final T2 item2;
    private final T3 item3;
    private final T4 item4;
    private final T5 item5;
    private final T6 item6;
    private final T7 item7;

    public Tuple7(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
    }

    public T1 getItem1() {
        return this.item1;
    }

    public T2 getItem2() {
        return this.item2;
    }

    public T3 getItem3() {
        return this.item3;
    }

    public T4 getItem4() {
        return this.item4;
    }

    public T5 getItem5() {
        return this.item5;
    }

    public T6 getItem6() {
        return this.item6;
    }

    public T7 getItem7() {
        return this.item7;
    }

    @Override
    public int size() {
        return 7;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.item1;
            case 1:
                return this.item2;
            case 2:
                return this.item3;
            case 3:
                return this.item4;
            case 4:
                return this.item5;
            case 5:
                return this.item6;
            case 6:
                return this.item7;
            default:
                throw Errors.indexOutOfRange();
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj, EqualityComparer.Default());
    }

    @Override
    public boolean equals(Object other, IEqualityComparer comparer) {
        Tuple7 that;
        //noinspection unchecked
        return other instanceof Tuple7
                && comparer.equals(this.item1, (that = (Tuple7) other).item1)
                && comparer.equals(this.item2, that.item2)
                && comparer.equals(this.item3, that.item3)
                && comparer.equals(this.item4, that.item4)
                && comparer.equals(this.item5, that.item5)
                && comparer.equals(this.item6, that.item6)
                && comparer.equals(this.item7, that.item7);
    }

    @Override
    public int compareTo(Object obj) {
        return this.compareTo(obj, Comparer.Default());
    }

    @Override
    public int compareTo(Object other, Comparator comparer) {
        if (other == null)
            return 1;
        if (!(other instanceof Tuple7))
            throw Errors.tupleIncorrectType(this.getClass(), "other");
        Tuple7 that = (Tuple7) other;
        //noinspection unchecked
        int num = comparer.compare(this.item1, that.item1);
        if (num != 0)
            return num;
        //noinspection unchecked
        num = comparer.compare(this.item2, that.item2);
        if (num != 0)
            return num;
        //noinspection unchecked
        num = comparer.compare(this.item3, that.item3);
        if (num != 0)
            return num;
        //noinspection unchecked
        num = comparer.compare(this.item4, that.item4);
        if (num != 0)
            return num;
        //noinspection unchecked
        num = comparer.compare(this.item5, that.item5);
        if (num != 0)
            return num;
        //noinspection unchecked
        num = comparer.compare(this.item6, that.item6);
        if (num != 0)
            return num;
        //noinspection unchecked
        return comparer.compare(this.item7, that.item7);
    }

    @Override
    public int hashCode() {
        return this.hashCode(EqualityComparer.Default());
    }

    @Override
    public int hashCode(IEqualityComparer comparer) {
        //noinspection unchecked
        return Tuple.combineHashCodes(comparer.hashCode(this.item1),
                comparer.hashCode(this.item2),
                comparer.hashCode(this.item3),
                comparer.hashCode(this.item4),
                comparer.hashCode(this.item5),
                comparer.hashCode(this.item6),
                comparer.hashCode(this.item7));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        return this.toString(builder);
    }

    @Override
    public String toString(StringBuilder builder) {
        builder.append(this.item1);
        builder.append(", ");
        builder.append(this.item2);
        builder.append(", ");
        builder.append(this.item3);
        builder.append(", ");
        builder.append(this.item4);
        builder.append(", ");
        builder.append(this.item5);
        builder.append(", ");
        builder.append(this.item6);
        builder.append(", ");
        builder.append(this.item7);
        builder.append(")");
        return builder.toString();
    }
}

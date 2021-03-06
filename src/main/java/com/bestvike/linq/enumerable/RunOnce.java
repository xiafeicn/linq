package com.bestvike.linq.enumerable;

import com.bestvike.linq.IEnumerable;
import com.bestvike.linq.bridge.enumerable.RunOnceEnumerable;
import com.bestvike.linq.exception.Errors;

/**
 * Created by 许崇雷 on 2018-05-11.
 */
public final class RunOnce {
    private RunOnce() {
    }

    public static <TSource> IEnumerable<TSource> runOnce(IEnumerable<TSource> source) {
        if (source == null)
            throw Errors.argumentNull("source");

        return new RunOnceEnumerable<>(source);
    }
}

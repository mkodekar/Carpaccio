package com.github.florent37.carpaccio.controllers.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by florentchampigny on 31/07/15.
 */
public interface OnItemSwipedListener<T> {
    boolean OnItemSwipedListener(T item, int position, Holder holder, RecyclerView.Adapter adapter);
}
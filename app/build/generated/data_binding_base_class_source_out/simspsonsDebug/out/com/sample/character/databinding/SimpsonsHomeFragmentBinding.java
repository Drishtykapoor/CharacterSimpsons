// Generated by view binder compiler. Do not edit!
package com.sample.character.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sample.character.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SimpsonsHomeFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView errorImage;

  @NonNull
  public final TextView errorText;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Guideline guideline;

  @NonNull
  public final ConstraintLayout itemListContainer;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerview;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final EditText searchText;

  @NonNull
  public final SwipeRefreshLayout swiperefresh;

  @NonNull
  public final TextView title;

  @NonNull
  public final ConstraintLayout titleRow;

  private SimpsonsHomeFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView errorImage, @NonNull TextView errorText, @Nullable Guideline guideline,
      @NonNull ConstraintLayout itemListContainer, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView recyclerview, @Nullable EditText searchText,
      @NonNull SwipeRefreshLayout swiperefresh, @NonNull TextView title,
      @NonNull ConstraintLayout titleRow) {
    this.rootView = rootView;
    this.errorImage = errorImage;
    this.errorText = errorText;
    this.guideline = guideline;
    this.itemListContainer = itemListContainer;
    this.progressBar = progressBar;
    this.recyclerview = recyclerview;
    this.searchText = searchText;
    this.swiperefresh = swiperefresh;
    this.title = title;
    this.titleRow = titleRow;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SimpsonsHomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SimpsonsHomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.simpsons_home_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SimpsonsHomeFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.error_image;
      ImageView errorImage = ViewBindings.findChildViewById(rootView, id);
      if (errorImage == null) {
        break missingId;
      }

      id = R.id.error_text;
      TextView errorText = ViewBindings.findChildViewById(rootView, id);
      if (errorText == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);

      ConstraintLayout itemListContainer = (ConstraintLayout) rootView;

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      RecyclerView recyclerview = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview == null) {
        break missingId;
      }

      id = R.id.searchText;
      EditText searchText = ViewBindings.findChildViewById(rootView, id);

      id = R.id.swiperefresh;
      SwipeRefreshLayout swiperefresh = ViewBindings.findChildViewById(rootView, id);
      if (swiperefresh == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.title_row;
      ConstraintLayout titleRow = ViewBindings.findChildViewById(rootView, id);
      if (titleRow == null) {
        break missingId;
      }

      return new SimpsonsHomeFragmentBinding((ConstraintLayout) rootView, errorImage, errorText,
          guideline, itemListContainer, progressBar, recyclerview, searchText, swiperefresh, title,
          titleRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

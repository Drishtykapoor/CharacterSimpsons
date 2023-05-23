// Generated by view binder compiler. Do not edit!
package com.sample.simpsonsviewer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sample.simpsonsviewer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SimpsonsDetailFragmentBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView eventsErrorView;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView simpDescription;

  @NonNull
  public final TextView simpTitle;

  @NonNull
  public final TextView title;

  private SimpsonsDetailFragmentBinding(@NonNull ScrollView rootView, @NonNull TextView description,
      @NonNull TextView eventsErrorView, @NonNull ImageView image,
      @NonNull TextView simpDescription, @NonNull TextView simpTitle, @NonNull TextView title) {
    this.rootView = rootView;
    this.description = description;
    this.eventsErrorView = eventsErrorView;
    this.image = image;
    this.simpDescription = simpDescription;
    this.simpTitle = simpTitle;
    this.title = title;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static SimpsonsDetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SimpsonsDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.simpsons_detail_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SimpsonsDetailFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.events_error_view;
      TextView eventsErrorView = ViewBindings.findChildViewById(rootView, id);
      if (eventsErrorView == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.simpDescription;
      TextView simpDescription = ViewBindings.findChildViewById(rootView, id);
      if (simpDescription == null) {
        break missingId;
      }

      id = R.id.simpTitle;
      TextView simpTitle = ViewBindings.findChildViewById(rootView, id);
      if (simpTitle == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new SimpsonsDetailFragmentBinding((ScrollView) rootView, description, eventsErrorView,
          image, simpDescription, simpTitle, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

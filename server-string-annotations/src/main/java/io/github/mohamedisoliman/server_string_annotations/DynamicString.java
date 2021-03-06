package io.github.mohamedisoliman.server_string_annotations;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Mohamed Ibrahim on 9/17/18.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface DynamicString {

  @StringRes int serverKey();

  @IdRes int viewId();
}

package com.android.dialer.calllog.database;

import com.google.common.util.concurrent.ListeningExecutorService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MutationApplier_Factory implements Factory<MutationApplier> {
  private final Provider<ListeningExecutorService> backgroundExecutorServiceProvider;

  public MutationApplier_Factory(
      Provider<ListeningExecutorService> backgroundExecutorServiceProvider) {
    assert backgroundExecutorServiceProvider != null;
    this.backgroundExecutorServiceProvider = backgroundExecutorServiceProvider;
  }

  @Override
  public MutationApplier get() {
    return new MutationApplier(backgroundExecutorServiceProvider.get());
  }

  public static Factory<MutationApplier> create(
      Provider<ListeningExecutorService> backgroundExecutorServiceProvider) {
    return new MutationApplier_Factory(backgroundExecutorServiceProvider);
  }
}

package com.android.dialer.common.concurrent;

import com.google.common.util.concurrent.ListeningExecutorService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DialerExecutorModule_ProvideLightweightExecutorFactory
    implements Factory<ListeningExecutorService> {
  private final Provider<ExecutorService> delegateProvider;

  public DialerExecutorModule_ProvideLightweightExecutorFactory(
      Provider<ExecutorService> delegateProvider) {
    assert delegateProvider != null;
    this.delegateProvider = delegateProvider;
  }

  @Override
  public ListeningExecutorService get() {
    return Preconditions.checkNotNull(
        DialerExecutorModule.provideLightweightExecutor(delegateProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListeningExecutorService> create(
      Provider<ExecutorService> delegateProvider) {
    return new DialerExecutorModule_ProvideLightweightExecutorFactory(delegateProvider);
  }
}

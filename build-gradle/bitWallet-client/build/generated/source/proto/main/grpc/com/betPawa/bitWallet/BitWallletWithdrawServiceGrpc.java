package com.betPawa.bitWallet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: bitWallet.withdraw.proto")
public final class BitWallletWithdrawServiceGrpc {

  private BitWallletWithdrawServiceGrpc() {}

  public static final String SERVICE_NAME = "BitWallletWithdrawService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.betPawa.bitWallet.IWithdraw.WithdrawRequest,
      com.betPawa.bitWallet.IWithdraw.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.betPawa.bitWallet.IWithdraw.WithdrawRequest.class,
      responseType = com.betPawa.bitWallet.IWithdraw.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betPawa.bitWallet.IWithdraw.WithdrawRequest,
      com.betPawa.bitWallet.IWithdraw.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.betPawa.bitWallet.IWithdraw.WithdrawRequest, com.betPawa.bitWallet.IWithdraw.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = BitWallletWithdrawServiceGrpc.getWithdrawMethod) == null) {
      synchronized (BitWallletWithdrawServiceGrpc.class) {
        if ((getWithdrawMethod = BitWallletWithdrawServiceGrpc.getWithdrawMethod) == null) {
          BitWallletWithdrawServiceGrpc.getWithdrawMethod = getWithdrawMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IWithdraw.WithdrawRequest, com.betPawa.bitWallet.IWithdraw.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletWithdrawService", "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IWithdraw.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IWithdraw.WithdrawResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletWithdrawServiceMethodDescriptorSupplier("Withdraw"))
                  .build();
          }
        }
     }
     return getWithdrawMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BitWallletWithdrawServiceStub newStub(io.grpc.Channel channel) {
    return new BitWallletWithdrawServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BitWallletWithdrawServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BitWallletWithdrawServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BitWallletWithdrawServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BitWallletWithdrawServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BitWallletWithdrawServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void withdraw(com.betPawa.bitWallet.IWithdraw.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IWithdraw.WithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.betPawa.bitWallet.IWithdraw.WithdrawRequest,
                com.betPawa.bitWallet.IWithdraw.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .build();
    }
  }

  /**
   */
  public static final class BitWallletWithdrawServiceStub extends io.grpc.stub.AbstractStub<BitWallletWithdrawServiceStub> {
    private BitWallletWithdrawServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletWithdrawServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletWithdrawServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletWithdrawServiceStub(channel, callOptions);
    }

    /**
     */
    public void withdraw(com.betPawa.bitWallet.IWithdraw.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IWithdraw.WithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BitWallletWithdrawServiceBlockingStub extends io.grpc.stub.AbstractStub<BitWallletWithdrawServiceBlockingStub> {
    private BitWallletWithdrawServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletWithdrawServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletWithdrawServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletWithdrawServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.betPawa.bitWallet.IWithdraw.WithdrawResponse withdraw(com.betPawa.bitWallet.IWithdraw.WithdrawRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BitWallletWithdrawServiceFutureStub extends io.grpc.stub.AbstractStub<BitWallletWithdrawServiceFutureStub> {
    private BitWallletWithdrawServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletWithdrawServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletWithdrawServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletWithdrawServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IWithdraw.WithdrawResponse> withdraw(
        com.betPawa.bitWallet.IWithdraw.WithdrawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WITHDRAW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BitWallletWithdrawServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BitWallletWithdrawServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.betPawa.bitWallet.IWithdraw.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IWithdraw.WithdrawResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BitWallletWithdrawServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BitWallletWithdrawServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betPawa.bitWallet.IWithdraw.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BitWallletWithdrawService");
    }
  }

  private static final class BitWallletWithdrawServiceFileDescriptorSupplier
      extends BitWallletWithdrawServiceBaseDescriptorSupplier {
    BitWallletWithdrawServiceFileDescriptorSupplier() {}
  }

  private static final class BitWallletWithdrawServiceMethodDescriptorSupplier
      extends BitWallletWithdrawServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BitWallletWithdrawServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BitWallletWithdrawServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BitWallletWithdrawServiceFileDescriptorSupplier())
              .addMethod(getWithdrawMethod())
              .build();
        }
      }
    }
    return result;
  }
}

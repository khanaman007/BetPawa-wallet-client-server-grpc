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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: bitWallet.balance.proto")
public final class BitWallletBalanceServiceGrpc {

  private BitWallletBalanceServiceGrpc() {}

  public static final String SERVICE_NAME = "BitWallletBalanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.betPawa.bitWallet.IBalance.BalanceRequest,
      com.betPawa.bitWallet.IBalance.BalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.betPawa.bitWallet.IBalance.BalanceRequest.class,
      responseType = com.betPawa.bitWallet.IBalance.BalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betPawa.bitWallet.IBalance.BalanceRequest,
      com.betPawa.bitWallet.IBalance.BalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.betPawa.bitWallet.IBalance.BalanceRequest, com.betPawa.bitWallet.IBalance.BalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = BitWallletBalanceServiceGrpc.getBalanceMethod) == null) {
      synchronized (BitWallletBalanceServiceGrpc.class) {
        if ((getBalanceMethod = BitWallletBalanceServiceGrpc.getBalanceMethod) == null) {
          BitWallletBalanceServiceGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IBalance.BalanceRequest, com.betPawa.bitWallet.IBalance.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletBalanceService", "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IBalance.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IBalance.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletBalanceServiceMethodDescriptorSupplier("Balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BitWallletBalanceServiceStub newStub(io.grpc.Channel channel) {
    return new BitWallletBalanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BitWallletBalanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BitWallletBalanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BitWallletBalanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BitWallletBalanceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BitWallletBalanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void balance(com.betPawa.bitWallet.IBalance.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.betPawa.bitWallet.IBalance.BalanceRequest,
                com.betPawa.bitWallet.IBalance.BalanceResponse>(
                  this, METHODID_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class BitWallletBalanceServiceStub extends io.grpc.stub.AbstractStub<BitWallletBalanceServiceStub> {
    private BitWallletBalanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletBalanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletBalanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletBalanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void balance(com.betPawa.bitWallet.IBalance.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BitWallletBalanceServiceBlockingStub extends io.grpc.stub.AbstractStub<BitWallletBalanceServiceBlockingStub> {
    private BitWallletBalanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletBalanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletBalanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletBalanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.betPawa.bitWallet.IBalance.BalanceResponse balance(com.betPawa.bitWallet.IBalance.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BitWallletBalanceServiceFutureStub extends io.grpc.stub.AbstractStub<BitWallletBalanceServiceFutureStub> {
    private BitWallletBalanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletBalanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletBalanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletBalanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IBalance.BalanceResponse> balance(
        com.betPawa.bitWallet.IBalance.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BALANCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BitWallletBalanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BitWallletBalanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BALANCE:
          serviceImpl.balance((com.betPawa.bitWallet.IBalance.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse>) responseObserver);
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

  private static abstract class BitWallletBalanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BitWallletBalanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betPawa.bitWallet.IBalance.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BitWallletBalanceService");
    }
  }

  private static final class BitWallletBalanceServiceFileDescriptorSupplier
      extends BitWallletBalanceServiceBaseDescriptorSupplier {
    BitWallletBalanceServiceFileDescriptorSupplier() {}
  }

  private static final class BitWallletBalanceServiceMethodDescriptorSupplier
      extends BitWallletBalanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BitWallletBalanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BitWallletBalanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BitWallletBalanceServiceFileDescriptorSupplier())
              .addMethod(getBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}

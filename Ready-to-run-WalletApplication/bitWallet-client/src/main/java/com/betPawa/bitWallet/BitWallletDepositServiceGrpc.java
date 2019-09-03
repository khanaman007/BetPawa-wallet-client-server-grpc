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
    comments = "Source: bitWallet.deposit.proto")
public final class BitWallletDepositServiceGrpc {

  private BitWallletDepositServiceGrpc() {}

  public static final String SERVICE_NAME = "BitWallletDepositService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.betPawa.bitWallet.IDeposit.DepositRequest,
      com.betPawa.bitWallet.IDeposit.EmpltyResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.betPawa.bitWallet.IDeposit.DepositRequest.class,
      responseType = com.betPawa.bitWallet.IDeposit.EmpltyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betPawa.bitWallet.IDeposit.DepositRequest,
      com.betPawa.bitWallet.IDeposit.EmpltyResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.betPawa.bitWallet.IDeposit.DepositRequest, com.betPawa.bitWallet.IDeposit.EmpltyResponse> getDepositMethod;
    if ((getDepositMethod = BitWallletDepositServiceGrpc.getDepositMethod) == null) {
      synchronized (BitWallletDepositServiceGrpc.class) {
        if ((getDepositMethod = BitWallletDepositServiceGrpc.getDepositMethod) == null) {
          BitWallletDepositServiceGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IDeposit.DepositRequest, com.betPawa.bitWallet.IDeposit.EmpltyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletDepositService", "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IDeposit.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IDeposit.EmpltyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletDepositServiceMethodDescriptorSupplier("Deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BitWallletDepositServiceStub newStub(io.grpc.Channel channel) {
    return new BitWallletDepositServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BitWallletDepositServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BitWallletDepositServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BitWallletDepositServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BitWallletDepositServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BitWallletDepositServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IDeposit.EmpltyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.betPawa.bitWallet.IDeposit.DepositRequest,
                com.betPawa.bitWallet.IDeposit.EmpltyResponse>(
                  this, METHODID_DEPOSIT)))
          .build();
    }
  }

  /**
   */
  public static final class BitWallletDepositServiceStub extends io.grpc.stub.AbstractStub<BitWallletDepositServiceStub> {
    private BitWallletDepositServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletDepositServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletDepositServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletDepositServiceStub(channel, callOptions);
    }

    /**
     */
    public void deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IDeposit.EmpltyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BitWallletDepositServiceBlockingStub extends io.grpc.stub.AbstractStub<BitWallletDepositServiceBlockingStub> {
    private BitWallletDepositServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletDepositServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletDepositServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletDepositServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.betPawa.bitWallet.IDeposit.EmpltyResponse deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BitWallletDepositServiceFutureStub extends io.grpc.stub.AbstractStub<BitWallletDepositServiceFutureStub> {
    private BitWallletDepositServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletDepositServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletDepositServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletDepositServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IDeposit.EmpltyResponse> deposit(
        com.betPawa.bitWallet.IDeposit.DepositRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BitWallletDepositServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BitWallletDepositServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.betPawa.bitWallet.IDeposit.DepositRequest) request,
              (io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IDeposit.EmpltyResponse>) responseObserver);
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

  private static abstract class BitWallletDepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BitWallletDepositServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betPawa.bitWallet.IDeposit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BitWallletDepositService");
    }
  }

  private static final class BitWallletDepositServiceFileDescriptorSupplier
      extends BitWallletDepositServiceBaseDescriptorSupplier {
    BitWallletDepositServiceFileDescriptorSupplier() {}
  }

  private static final class BitWallletDepositServiceMethodDescriptorSupplier
      extends BitWallletDepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BitWallletDepositServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BitWallletDepositServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BitWallletDepositServiceFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
    comments = "Source: bit-wallet-server.proto")
public final class BitWallletServiceGrpc {

  private BitWallletServiceGrpc() {}

  public static final String SERVICE_NAME = "BitWallletService";

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
    if ((getDepositMethod = BitWallletServiceGrpc.getDepositMethod) == null) {
      synchronized (BitWallletServiceGrpc.class) {
        if ((getDepositMethod = BitWallletServiceGrpc.getDepositMethod) == null) {
          BitWallletServiceGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IDeposit.DepositRequest, com.betPawa.bitWallet.IDeposit.EmpltyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletService", "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IDeposit.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IDeposit.EmpltyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletServiceMethodDescriptorSupplier("Deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }

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
    if ((getBalanceMethod = BitWallletServiceGrpc.getBalanceMethod) == null) {
      synchronized (BitWallletServiceGrpc.class) {
        if ((getBalanceMethod = BitWallletServiceGrpc.getBalanceMethod) == null) {
          BitWallletServiceGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IBalance.BalanceRequest, com.betPawa.bitWallet.IBalance.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletService", "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IBalance.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IBalance.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletServiceMethodDescriptorSupplier("Balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

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
    if ((getWithdrawMethod = BitWallletServiceGrpc.getWithdrawMethod) == null) {
      synchronized (BitWallletServiceGrpc.class) {
        if ((getWithdrawMethod = BitWallletServiceGrpc.getWithdrawMethod) == null) {
          BitWallletServiceGrpc.getWithdrawMethod = getWithdrawMethod = 
              io.grpc.MethodDescriptor.<com.betPawa.bitWallet.IWithdraw.WithdrawRequest, com.betPawa.bitWallet.IWithdraw.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BitWallletService", "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IWithdraw.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betPawa.bitWallet.IWithdraw.WithdrawResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BitWallletServiceMethodDescriptorSupplier("Withdraw"))
                  .build();
          }
        }
     }
     return getWithdrawMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BitWallletServiceStub newStub(io.grpc.Channel channel) {
    return new BitWallletServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BitWallletServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BitWallletServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BitWallletServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BitWallletServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BitWallletServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IDeposit.EmpltyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    public void balance(com.betPawa.bitWallet.IBalance.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     */
    public void withdraw(com.betPawa.bitWallet.IWithdraw.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IWithdraw.WithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
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
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.betPawa.bitWallet.IBalance.BalanceRequest,
                com.betPawa.bitWallet.IBalance.BalanceResponse>(
                  this, METHODID_BALANCE)))
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
  public static final class BitWallletServiceStub extends io.grpc.stub.AbstractStub<BitWallletServiceStub> {
    private BitWallletServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletServiceStub(channel, callOptions);
    }

    /**
     */
    public void deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IDeposit.EmpltyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void balance(com.betPawa.bitWallet.IBalance.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
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
  public static final class BitWallletServiceBlockingStub extends io.grpc.stub.AbstractStub<BitWallletServiceBlockingStub> {
    private BitWallletServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.betPawa.bitWallet.IDeposit.EmpltyResponse deposit(com.betPawa.bitWallet.IDeposit.DepositRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.betPawa.bitWallet.IBalance.BalanceResponse balance(com.betPawa.bitWallet.IBalance.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
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
  public static final class BitWallletServiceFutureStub extends io.grpc.stub.AbstractStub<BitWallletServiceFutureStub> {
    private BitWallletServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BitWallletServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BitWallletServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BitWallletServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IDeposit.EmpltyResponse> deposit(
        com.betPawa.bitWallet.IDeposit.DepositRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IBalance.BalanceResponse> balance(
        com.betPawa.bitWallet.IBalance.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betPawa.bitWallet.IWithdraw.WithdrawResponse> withdraw(
        com.betPawa.bitWallet.IWithdraw.WithdrawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_BALANCE = 1;
  private static final int METHODID_WITHDRAW = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BitWallletServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BitWallletServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_BALANCE:
          serviceImpl.balance((com.betPawa.bitWallet.IBalance.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.betPawa.bitWallet.IBalance.BalanceResponse>) responseObserver);
          break;
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

  private static abstract class BitWallletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BitWallletServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betPawa.bitWallet.IServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BitWallletService");
    }
  }

  private static final class BitWallletServiceFileDescriptorSupplier
      extends BitWallletServiceBaseDescriptorSupplier {
    BitWallletServiceFileDescriptorSupplier() {}
  }

  private static final class BitWallletServiceMethodDescriptorSupplier
      extends BitWallletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BitWallletServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BitWallletServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BitWallletServiceFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getWithdrawMethod())
              .build();
        }
      }
    }
    return result;
  }
}

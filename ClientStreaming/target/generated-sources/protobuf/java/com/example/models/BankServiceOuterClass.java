// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank-service.proto

package com.example.models;

public final class BankServiceOuterClass {
  private BankServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Balance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Balance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DepositRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DepositRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022bank-service.proto\"\031\n\007Balance\022\016\n\006amoun" +
      "t\030\001 \001(\005\"7\n\016DepositRequest\022\025\n\raccountNumb" +
      "er\030\001 \001(\005\022\016\n\006amount\030\002 \001(\00529\n\013BankService\022" +
      "*\n\013cashDeposit\022\017.DepositRequest\032\010.Balanc" +
      "e(\001B\026\n\022com.example.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Balance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Balance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Balance_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_DepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DepositRequest_descriptor,
        new java.lang.String[] { "AccountNumber", "Amount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
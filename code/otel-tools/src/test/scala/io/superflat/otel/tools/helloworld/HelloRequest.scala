// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.superflat.otel.tools.helloworld

/**
 * The request message containing the user's name.
 */
@SerialVersionUID(0L)
final case class HelloRequest(
  name: _root_.scala.Predef.String = "",
  unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
) extends scalapb.GeneratedMessage
    with scalapb.lenses.Updatable[HelloRequest] {
  @transient
  private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
  private[this] def __computeSerializedValue(): _root_.scala.Int = {
    var __size = 0

    {
      val __value = name
      if (!__value.isEmpty) {
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
    };
    __size += unknownFields.serializedSize
    __size
  }
  override def serializedSize: _root_.scala.Int = {
    var read = __serializedSizeCachedValue
    if (read == 0) {
      read = __computeSerializedValue()
      __serializedSizeCachedValue = read
    }
    read
  }
  def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
    {
      val __v = name
      if (!__v.isEmpty) {
        _output__.writeString(1, __v)
      }
    };
    unknownFields.writeTo(_output__)
  }
  def withName(__v: _root_.scala.Predef.String): HelloRequest = copy(name = __v)
  def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
  def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
  def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
    (__fieldNumber: @ _root_.scala.unchecked) match {
      case 1 => {
        val __t = name
        if (__t != "") __t else null
      }
    }
  }
  def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
    _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
    (__field.number: @ _root_.scala.unchecked) match {
      case 1 => _root_.scalapb.descriptors.PString(name)
    }
  }
  def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
  def companion = io.superflat.otel.tools.helloworld.HelloRequest
  // @@protoc_insertion_point(GeneratedMessage[helloworld.HelloRequest])
}

object HelloRequest extends scalapb.GeneratedMessageCompanion[io.superflat.otel.tools.helloworld.HelloRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.superflat.otel.tools.helloworld.HelloRequest] =
    this
  def parseFrom(
    `_input__`: _root_.com.google.protobuf.CodedInputStream
  ): io.superflat.otel.tools.helloworld.HelloRequest = {
    var __name: _root_.scala.Predef.String = ""
    var `_unknownFields__` : _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.superflat.otel.tools.helloworld.HelloRequest(
      name = __name,
      unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.superflat.otel.tools.helloworld.HelloRequest] =
    _root_.scalapb.descriptors.Reads {
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor),
                                    "FieldDescriptor does not match message type."
        )
        io.superflat.otel.tools.helloworld.HelloRequest(
          name = __fieldsMap
            .get(scalaDescriptor.findFieldByNumber(1).get)
            .map(_.as[_root_.scala.Predef.String])
            .getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor =
    HelloworldProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloworldProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] =
    throw new MatchError(__number)
  lazy val nestedMessagesCompanions
    : Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] =
    throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.superflat.otel.tools.helloworld.HelloRequest(
    name = ""
  )
  implicit class HelloRequestLens[UpperPB](
    _l: _root_.scalapb.lenses.Lens[UpperPB, io.superflat.otel.tools.helloworld.HelloRequest]
  ) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.superflat.otel.tools.helloworld.HelloRequest](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] =
      field(_.name)((c_, f_) => c_.copy(name = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  def of(
    name: _root_.scala.Predef.String
  ): _root_.io.superflat.otel.tools.helloworld.HelloRequest = _root_.io.superflat.otel.tools.helloworld.HelloRequest(
    name
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[helloworld.HelloRequest])
}

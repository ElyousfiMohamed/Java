
/**
* factHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from fact.idl
* Wednesday, March 11, 2020 10:45:04 AM CET
*/

abstract public class factHelper
{
  private static String  _id = "IDL:fact:1.0";

  public static void insert (org.omg.CORBA.Any a, fact that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static fact extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (factHelper.id (), "fact");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static fact read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_factStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, fact value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static fact narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof fact)
      return (fact)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _factStub stub = new _factStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static fact unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof fact)
      return (fact)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _factStub stub = new _factStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeLayoutResult  {

      /**
       * element : layouts of type {urn:partner.soap.sforce.com}DescribeLayout
       * java type: com.sforce.soap.partner.DescribeLayout[]
       */

      public com.sforce.soap.partner.IDescribeLayout[] getLayouts();

      public void setLayouts(com.sforce.soap.partner.IDescribeLayout[] layouts);

      /**
       * element : recordTypeMappings of type {urn:partner.soap.sforce.com}RecordTypeMapping
       * java type: com.sforce.soap.partner.RecordTypeMapping[]
       */

      public com.sforce.soap.partner.IRecordTypeMapping[] getRecordTypeMappings();

      public void setRecordTypeMappings(com.sforce.soap.partner.IRecordTypeMapping[] recordTypeMappings);

      /**
       * element : recordTypeSelectorRequired of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getRecordTypeSelectorRequired();

      public boolean isRecordTypeSelectorRequired();

      public void setRecordTypeSelectorRequired(boolean recordTypeSelectorRequired);


}
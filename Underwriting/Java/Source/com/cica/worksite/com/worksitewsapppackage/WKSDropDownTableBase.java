/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class WKSDropDownTableBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_CompanyCode = "CompanyCode";
    public final static String ATTR_Language = "Language";
    public final static String ATTR_Identifier = "Identifier";
    public final static String ATTR_Description = "Description";
    public final static String ATTR_Value = "Value";
    public final static String ATTR_CreatedBy = "CreatedBy";
    public final static String ATTR_CreatedDate = "CreatedDate";
    public final static String ATTR_UpdatedBy = "UpdatedBy";
    public final static String ATTR_UpdatedDate = "UpdatedDate";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(WKSDropDownTable.class);
            s_classInfo.setTableName("WKSDropDownTable");
            s_classInfo.setUIDElements(new String[]{ATTR_CompanyCode, ATTR_Language, ATTR_Identifier, ATTR_Value});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CompanyCode);
                ai.setJavaName(ATTR_CompanyCode);
                ai.setColumnName(ATTR_CompanyCode);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CompanyCode);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Language);
                ai.setJavaName(ATTR_Language);
                ai.setColumnName(ATTR_Language);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Language);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Identifier);
                ai.setJavaName(ATTR_Identifier);
                ai.setColumnName(ATTR_Identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Identifier);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Description);
                ai.setJavaName(ATTR_Description);
                ai.setColumnName(ATTR_Description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Description);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Value);
                ai.setJavaName(ATTR_Value);
                ai.setColumnName(ATTR_Value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Value);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedBy);
                ai.setJavaName(ATTR_CreatedBy);
                ai.setColumnName(ATTR_CreatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CreatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedDate);
                ai.setJavaName(ATTR_CreatedDate);
                ai.setColumnName(ATTR_CreatedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UpdatedBy);
                ai.setJavaName(ATTR_UpdatedBy);
                ai.setColumnName(ATTR_UpdatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_UpdatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UpdatedDate);
                ai.setJavaName(ATTR_UpdatedDate);
                ai.setColumnName(ATTR_UpdatedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public WKSDropDownTableBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getCompanyCode()
    {
        return getStringProperty(ATTR_CompanyCode);
    }

    public void setCompanyCode(String value)
    {
        setProperty(ATTR_CompanyCode, value, 0);
    }

    public String getLanguage()
    {
        return getStringProperty(ATTR_Language);
    }

    public void setLanguage(String value)
    {
        setProperty(ATTR_Language, value, 0);
    }

    public String getIdentifier()
    {
        return getStringProperty(ATTR_Identifier);
    }

    public void setIdentifier(String value)
    {
        setProperty(ATTR_Identifier, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_Description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_Description, value, 0);
    }

    public String getValue()
    {
        return getStringProperty(ATTR_Value);
    }

    public void setValue(String value)
    {
        setProperty(ATTR_Value, value, 0);
    }

    public String getCreatedBy()
    {
        return getStringProperty(ATTR_CreatedBy);
    }

    public void setCreatedBy(String value)
    {
        setProperty(ATTR_CreatedBy, value, 0);
    }

    public java.util.Date getCreatedDate()
    {
        return getDateTimestampProperty(ATTR_CreatedDate);
    }

    public void setCreatedDate(java.util.Date value)
    {
        setProperty(ATTR_CreatedDate, value, 0);
    }

    public String getUpdatedBy()
    {
        return getStringProperty(ATTR_UpdatedBy);
    }

    public void setUpdatedBy(String value)
    {
        setProperty(ATTR_UpdatedBy, value, 0);
    }

    public java.util.Date getUpdatedDate()
    {
        return getDateTimestampProperty(ATTR_UpdatedDate);
    }

    public void setUpdatedDate(java.util.Date value)
    {
        setProperty(ATTR_UpdatedDate, value, 0);
    }



    public static BusObjectIterator<com.worksitewsapppackage.WKSDropDownTable> getNextWKSDropDownTableObjects(String CompanyCode, String Language, String Identifier, String Value, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSDropDownTable\" where (\"CompanyCode\" > :CompanyCode) or (\"CompanyCode\" = :CompanyCode and \"Language\" > :Language) or (\"CompanyCode\" = :CompanyCode and \"Language\" = :Language and \"Identifier\" > :Identifier) or (\"CompanyCode\" = :CompanyCode and \"Language\" = :Language and \"Identifier\" = :Identifier and \"Value\" > :Value) order by \"CompanyCode\" asc, \"Language\" asc, \"Identifier\" asc, \"Value\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, CompanyCode);//NOPMD
        query.addParameter("Language", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, Language);//NOPMD
        query.addParameter("Identifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, Identifier);//NOPMD
        query.addParameter("Value", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, Value);//NOPMD
        query.setResultClass(WKSDropDownTable.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSDropDownTable> getPreviousWKSDropDownTableObjects(String CompanyCode, String Language, String Identifier, String Value, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSDropDownTable\" where (\"CompanyCode\" < :CompanyCode) or (\"CompanyCode\" = :CompanyCode and \"Language\" < :Language) or (\"CompanyCode\" = :CompanyCode and \"Language\" = :Language and \"Identifier\" < :Identifier) or (\"CompanyCode\" = :CompanyCode and \"Language\" = :Language and \"Identifier\" = :Identifier and \"Value\" < :Value) order by \"CompanyCode\" desc, \"Language\" desc, \"Identifier\" desc, \"Value\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, CompanyCode);//NOPMD
        query.addParameter("Language", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, Language);//NOPMD
        query.addParameter("Identifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, Identifier);//NOPMD
        query.addParameter("Value", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, Value);//NOPMD
        query.setResultClass(WKSDropDownTable.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.worksitewsapppackage.WKSDropDownTable getWKSDropDownTableObject(String CompanyCode, String Language, String Identifier, String Value)
    {
        String queryText = "select * from \"WKSDropDownTable\" where \"CompanyCode\" = :CompanyCode and \"Language\" = :Language and \"Identifier\" = :Identifier and \"Value\" = :Value";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, CompanyCode);//NOPMD
        query.addParameter("Language", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, Language);//NOPMD
        query.addParameter("Identifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, Identifier);//NOPMD
        query.addParameter("Value", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, Value);//NOPMD
        query.setResultClass(WKSDropDownTable.class);
        return (WKSDropDownTable)query.getObject();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSDropDownTable> getWKSDropDownTableObjects(String fromCompanyCode, String toCompanyCode, String fromLanguage, String toLanguage, String fromIdentifier, String toIdentifier, String fromValue, String toValue, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSDropDownTable\" where \"CompanyCode\" between :fromCompanyCode and :toCompanyCode and \"Language\" between :fromLanguage and :toLanguage and \"Identifier\" between :fromIdentifier and :toIdentifier and \"Value\" between :fromValue and :toValue";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, fromCompanyCode);
        query.addParameter("toCompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, toCompanyCode);
        query.addParameter("fromLanguage", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, fromLanguage);
        query.addParameter("toLanguage", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, toLanguage);
        query.addParameter("fromIdentifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, fromIdentifier);
        query.addParameter("toIdentifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, toIdentifier);
        query.addParameter("fromValue", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, fromValue);
        query.addParameter("toValue", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, toValue);
        query.setResultClass(WKSDropDownTable.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSDropDownTable> getWKSDropDownTableObjects(String fromCompanyCode, String toCompanyCode, String fromLanguage, String toLanguage, String fromIdentifier, String toIdentifier, String fromValue, String toValue)
    {
        String queryText = "select * from \"WKSDropDownTable\" where \"CompanyCode\" between :fromCompanyCode and :toCompanyCode and \"Language\" between :fromLanguage and :toLanguage and \"Identifier\" between :fromIdentifier and :toIdentifier and \"Value\" between :fromValue and :toValue";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, fromCompanyCode);
        query.addParameter("toCompanyCode", "WKSDropDownTable.CompanyCode", QueryObject.PARAM_STRING, toCompanyCode);
        query.addParameter("fromLanguage", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, fromLanguage);
        query.addParameter("toLanguage", "WKSDropDownTable.Language", QueryObject.PARAM_STRING, toLanguage);
        query.addParameter("fromIdentifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, fromIdentifier);
        query.addParameter("toIdentifier", "WKSDropDownTable.Identifier", QueryObject.PARAM_STRING, toIdentifier);
        query.addParameter("fromValue", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, fromValue);
        query.addParameter("toValue", "WKSDropDownTable.Value", QueryObject.PARAM_STRING, toValue);
        query.setResultClass(WKSDropDownTable.class);
        return query.getObjects();
    }


}
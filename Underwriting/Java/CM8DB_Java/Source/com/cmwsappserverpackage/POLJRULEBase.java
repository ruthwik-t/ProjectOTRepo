/*
  This class has been generated by the Code Generator
*/

package com.cmwsappserverpackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class POLJRULEBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_POLICY = "POLICY";
    public final static String ATTR_FORM = "FORM";
    public final static String ATTR_JRULE = "JRULE";
    public final static String ATTR_BENEFITDESC = "BENEFITDESC";
    public final static String ATTR_PRODUCTDESC = "PRODUCTDESC";
    public final static String ATTR_STATE = "STATE";
    public final static String ATTR_LANG = "LANG";
    public final static String ATTR_COMPANY = "COMPANY";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(POLJRULE.class);
            s_classInfo.setTableName("POLJRULE");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_POLICY);
                ai.setJavaName(ATTR_POLICY);
                ai.setColumnName(ATTR_POLICY);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_POLICY);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FORM);
                ai.setJavaName(ATTR_FORM);
                ai.setColumnName(ATTR_FORM);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FORM);
                v.setMaxLength(5);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_JRULE);
                ai.setJavaName(ATTR_JRULE);
                ai.setColumnName(ATTR_JRULE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_JRULE);
                v.setMaxLength(42);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BENEFITDESC);
                ai.setJavaName(ATTR_BENEFITDESC);
                ai.setColumnName(ATTR_BENEFITDESC);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_BENEFITDESC);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PRODUCTDESC);
                ai.setJavaName(ATTR_PRODUCTDESC);
                ai.setColumnName(ATTR_PRODUCTDESC);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PRODUCTDESC);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_STATE);
                ai.setJavaName(ATTR_STATE);
                ai.setColumnName(ATTR_STATE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_STATE);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_LANG);
                ai.setJavaName(ATTR_LANG);
                ai.setColumnName(ATTR_LANG);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_LANG);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_COMPANY);
                ai.setJavaName(ATTR_COMPANY);
                ai.setColumnName(ATTR_COMPANY);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_COMPANY);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public POLJRULEBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getPOLICY()
    {
        return getStringProperty(ATTR_POLICY);
    }

    public void setPOLICY(String value)
    {
        setProperty(ATTR_POLICY, value, 0);
    }

    public String getFORM()
    {
        return getStringProperty(ATTR_FORM);
    }

    public void setFORM(String value)
    {
        setProperty(ATTR_FORM, value, 0);
    }

    public String getJRULE()
    {
        return getStringProperty(ATTR_JRULE);
    }

    public void setJRULE(String value)
    {
        setProperty(ATTR_JRULE, value, 0);
    }

    public int getBENEFITDESC()
    {
        return getIntProperty(ATTR_BENEFITDESC);
    }

    public void setBENEFITDESC(int value)
    {
        setProperty(ATTR_BENEFITDESC, value, 0);
    }

    public String getPRODUCTDESC()
    {
        return getStringProperty(ATTR_PRODUCTDESC);
    }

    public void setPRODUCTDESC(String value)
    {
        setProperty(ATTR_PRODUCTDESC, value, 0);
    }

    public String getSTATE()
    {
        return getStringProperty(ATTR_STATE);
    }

    public void setSTATE(String value)
    {
        setProperty(ATTR_STATE, value, 0);
    }

    public String getLANG()
    {
        return getStringProperty(ATTR_LANG);
    }

    public void setLANG(String value)
    {
        setProperty(ATTR_LANG, value, 0);
    }

    public String getCOMPANY()
    {
        return getStringProperty(ATTR_COMPANY);
    }

    public void setCOMPANY(String value)
    {
        setProperty(ATTR_COMPANY, value, 0);
    }


    public static BusObjectIterator<com.cmwsappserverpackage.POLJRULE> getPoljruleObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"POLJRULE\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(POLJRULE.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cmwsappserverpackage.POLJRULE> getPoljruleObjects()
    {
        String queryText = "select * from \"POLJRULE\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(POLJRULE.class);
        return query.getObjects();
    }

}